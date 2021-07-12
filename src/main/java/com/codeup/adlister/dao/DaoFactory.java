package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
    private static Users users = new Users() {

        @Override
        public User findByUsername(String username) {
            return null;
        }

        @Override
        public Long insert(User user) {
            return null;
        }
    };

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
