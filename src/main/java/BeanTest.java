import java.util.ArrayList;

public class BeanTest {
    //Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.

    public static void main(String [] args){
        //One way
        Album testAlbum = new Album(1,"Selena","Amor Prohibido",1994,2.5,"Tejano");

        //second way
        Album testAlbum2 = new Album();
        testAlbum2.setId(2);
        testAlbum2.setArtist("J.Cole");
        testAlbum2.setName("The Off Season");
        testAlbum2.setRelease_date(2021);
        testAlbum2.setSales(2.0);
        testAlbum2.setGenre("hip hop/rap");


        Quote testQuote1 = new Quote(1,"Dont let yesterday take up too much of today.", 1,"Will Rogers");

        Quote testQuote2 = new Quote();
        testQuote2.setId(2);
        testQuote2.setContent("Stay away from negative people, they have a problem for every solution.");
        testQuote2.setAuthor("Albert Einstein");


        Author testAuthor1 = new Author(1, "Earnest", "Hemmingway");

        Author testAuthor2 = new Author();
        testAuthor2.setId(2);
        testAuthor2.setFirstName("Charles");
        testAuthor2.setLastName("Dickens");


        //In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.

        ArrayList<Album> albums = new ArrayList<>(); //create a new array named albums, then add the ones you created:
        albums.add(testAlbum);
        albums.add(testAlbum2);

        for(Album album : albums){
            System.out.println("album.getId() = " + album.getId());
            System.out.println("album.getArtist() = " + album.getArtist());
            System.out.println("album.getName() = " + album.getName());
            System.out.println("album.getGenre() = " + album.getGenre());
            System.out.println("album.getSales() = " + album.getSales());
            System.out.println("album.getReleaseDate() = " + album.getRelease_date());


            ArrayList<Quote> quotes = new ArrayList<>();
            quotes.add(testQuote1);
            quotes.add(testQuote2);

            for(Quote quote : quotes){
                System.out.println("quote.getId() = " + quote.getId());
                System.out.println("quote.getAuthorId() = " + quote.getAuthorId());
                System.out.println("quote.getContent() = " + quote.getContent());
                System.out.println("quote.getAuthor() = " + quote.getAuthor());
            }


            ArrayList<Author> authors = new ArrayList<>();
            authors.add(testAuthor1);
            authors.add(testAuthor2);

            for(Author author : authors){
                System.out.println("author.getId() = " + author.getId());
                System.out.println("author.getFirstName() = " + author.getFirstName());
                System.out.println("author.getLastName() = " + author.getLastName());

            }
        }
    }
}
