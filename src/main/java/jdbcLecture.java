import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcLecture {

    public static void main(String[] args) throws SQLException{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/example_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "root","codeup");

        Statement statement = connection.createStatement();
        ResultSet selectResults = statement.executeQuery("SELECT * FROM products");

        while(selectResults.next()){ //WHILE there are rows that are Next..

            System.out.println("Here's a product:");
            System.out.println("name: " + selectResults.getString("name")); //talk to column need 'name' that has a string
            System.out.println("price: $" + selectResults.getInt("price") + "\n");

            String insertQuery = "INSERT INTO products(name,price) VALUE ('nailgun', 250)";
            Statement insertStatement = connection.createStatement();

            insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet insertResults = insertStatement.getGeneratedKeys();

            if(insertResults.next()){
                System.out.println("Administrator: A new item has been created with the id of: " + insertResults.getLong(1));

            }

        }
    }
}
