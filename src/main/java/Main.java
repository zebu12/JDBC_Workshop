import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static db.MysqlConnection.getConnection;

public class Main {


    public static void main(String[] args) {

        String sql = "SELECT * FROM city WHERE ID = 1";


        try (
                Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                ){
            while (resultSet.next()){
                System.out.println(
                        resultSet.getString("Name")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }


    }


}
