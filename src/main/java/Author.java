import java.io.Serializable;
//JAVA Bean notes:
//implements the Serializable or Externalizable interface:

public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

//provides a zero-argument constructor (used to initialize objects)
public Author(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
}

public Author(){} //??what's the point of doing this -- for the "new quote to instantiate a new object"

    //has getters and setters for all instance variables
    public int getId() {
        return id;
    }

    public void setId(int id){
    this.id = id;
    }

    public String getFirstName(){
    return firstName;
    }

    public void setFirstName(String firstName){
    this.firstName = firstName;
    }

    public String getLastName(){
    return lastName;
    }

    public void setLastName(String lastName){
    this.lastName = lastName;
    }
}