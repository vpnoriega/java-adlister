import java.io.Serializable;

//implements the Serializable or Externalizable interface:
public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private int release_date;
    private float sales;
    private String genre;

    //provides a zero-argument constructor (used to initialize objects)
    public Album(int id, String artist, String name, int release_date, float sales, String genre){
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public Album(){}

    //has getters and setters for all instance variables
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

    public int getRelease_date(){
        return release_date;
    }

    public void setRelease_date(int release_date){
        this.release_date = release_date;
    }

    public float getSales(){
        return sales;
    }

    public void setSales(float sales){
        this.sales = sales;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre= genre;
    }
}
