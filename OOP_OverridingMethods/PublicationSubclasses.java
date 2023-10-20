package OOP_OverridingMethods;

/**
 * You are given four classes — Publication, Newspaper, Article and Announcement.
 * You need to override the methods getType() and getDetails() in classes inherited from the class Publication.
 * Then you need to implement getInfo() in the class Publication using getType() and getDetails().
 * The method should return a String with a type of publication in the first place, then details
 * in round brackets and the title after a colon. Examples are shown below.
 */

public class PublicationSubclasses {
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        Newspaper newspaper = new Newspaper("Football results","Sport news");
        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        Announcement announcement = new Announcement("Will sell a house", 30);

        System.out.println(publication.getInfo());
        System.out.println(newspaper.getInfo());
        System.out.println(article.getInfo());
        System.out.println(announcement.getInfo());

    }
}

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return getType() + title;
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here


    @Override
    public String getType() {
        return "Newspaper (source - " + source + "): ";
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getType() {
        return "Article (author - " + author + "): ";
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getType() {
        return "Announcement (days to expire - " + daysToExpire + "): ";
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

}
