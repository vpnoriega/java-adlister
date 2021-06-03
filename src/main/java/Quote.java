import java.io.Serializable;

//implements the Serializable or Externalizable interface:
public class Quote implements Serializable {
    private int id;
    private String content;
    private int authorId;
    private String author;

    //provides a zero-argument constructor (used to initialize objects)
    public Quote(int id, String content, int authorId, String author) {
        this.id = id;
        this.content = content;
        this.authorId = authorId;
        this.author = author;
    }
    //has getters and setters for all instance variables
        public Quote(){}

        public int getId(){
            return id;
        }

        public void setId(int id){
        this.id = id;
        }

        public String getContent(){
        return content;
        }

        public void setContent(String content){
        this.content = content;
        }

        public int getAuthorId(){
        return authorId;
        }

        public void setAuthorId(int authorId){
        this.authorId = authorId;
        }

        public String getAuthor(){
        return author;
        }

        public void setAuthor(String author){
        this.author = author;
        }

}
