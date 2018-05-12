package ar.com.martinjm.practice.dao;

import ar.com.martinjm.practice.Model.Movie;
import ar.com.martinjm.practice.db.IDBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface MovieDao extends IDBConnection {
    default ArrayList<Movie> readMovies(){
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        try(Connection connection = connectToDB()){
            String query = "SELECT * FROM movie";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                movieList.add(new Movie(resultSet.getString("title"),
                                resultSet.getString("genre"),
                        resultSet.getString("creator"),
                        resultSet.getString("duration"),
                        resultSet.getString("year")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movieList;
    }
}
