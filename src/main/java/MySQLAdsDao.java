import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException error) {
            throw new RuntimeException("Error connecting to the database");
        }

    }

    @Override
    public List<Ad> all() {
        try {
            Statement stmt = connection.createStatement();
            String showAds = "Select * FROM ads";
            ResultSet rs = stmt.executeQuery(showAds);
            return createAdsFromResults(rs);

        } catch (RuntimeException | SQLException error) {
            throw new RuntimeException("Error retrieving all ads");
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException error) {
            throw new RuntimeException("could not insert ad successfully.");
        }
    }

    private String createInsertQuery(Ad ad) {
        return String.format("INSERT INTO ads (user_id, title, description) VALUES(%d, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description"));
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }return ads;
    }
}
