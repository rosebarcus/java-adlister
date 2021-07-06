import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album neko = new Album("1", "Neko Case", "Middle Cyclone", 2009, 1, "Alt rock");

        Author jTobia = new Author(1, "Jacob", "Tobia");
        Quote quoteJacob = new Quote(1, "Be yourself always, and you'll regret nothing.", jTobia);

        System.out.println(quoteJacob);
        System.out.println(quoteJacob.getAuthor().getFirstName());
        System.out.println(neko);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quoteJacob);
        quotes.add(new Quote(2, "Better in than out, I always say", new Author(2, "Shrek", "The Ogre")));
        quotes.add(new Quote(3,"Success usually comes to those who are too busy to be looking for it", jTobia));

            for(Quote quote : quotes) {
                System.out.println("Here's a quote for ya'! *****************");
                System.out.printf("\"%s\"%n - %s %s%n", quote.getContent(), quote.getAuthor().getFirstName(),
                        quote.getAuthor().getLastName());
            }

    }
}
