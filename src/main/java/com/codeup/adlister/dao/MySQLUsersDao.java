package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLUsersDao implements Users {
    private Connection connection = null;

    // Constructor that establishes a connection to the MySQL database
    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    // find user by username, and create a prepared statement that takes in a search query
    @Override
    public User findByUsername(String username) {
        try {
            String sqlQuery = "SELECT * FROM users WHERE username = ?";
            PreparedStatement ps = connection.prepareStatement(sqlQuery);
            ps.setString(1, username);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                return extractUser(rs);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Could not find by username exception: ", e);
        }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("Username"),
                rs.getString("Email"),
                rs.getString("Password")
        );
    }

    // creates user and inserts into Database
    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(user_id,username, email, password) VALUES (?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, 1);
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());

            stmt.executeUpdate();
            ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }



}
// one: get all the users info from the database
// two: once a user creates a new user from the website, push the info into the database