package ar.com.martinjm.practice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static ar.com.martinjm.practice.config.DatabaseConfig.*;


/**
 * Interface to connect to a database
 */
public interface IDBConnection {
    default Connection connectToDB(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            return connection;
        }
    }
}
