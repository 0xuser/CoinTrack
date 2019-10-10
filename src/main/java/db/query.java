package db;

import java.sql.*;

public class query {

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:database.db";
    private Connection connection;
    private Statement statement;

    public query() {
        connect();
        //close();
    }

    private void connect() {
        try {
            Class.forName(query.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(DB_URL);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Connection error.");
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Close connection problem.");
            e.printStackTrace();
        }
    }

    /*
    CREATE TABLE user_currencies( id_usercurrency INTEGER PRIMARY KEY AUTOINCREMENT, id_currency INTEGER, quantity DOUBLE);
    CREATE TABLE currencies( id_currency INTEGER PRIMARY KEY AUTOINCREMENT, symbol VARCHAR(10), name VARCHAR(255), price DOUBLE, marketcap DOUBLE, volume DOUBLE, change DOUBLE)

     */
    public boolean insertUserCurrency(int id_usercurrency, int id_currency, double quantity) {
        try {
            PreparedStatement prepStmt = connection.prepareStatement(
                    "INSERT INTO user_currencies VALUES (NULL, ?, ?);");
            prepStmt.setInt(1, id_currency);
            prepStmt.setDouble(2, quantity);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("insertUserCurrency exception.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

        /*
    CREATE TABLE user_currencies( id_usercurrency INTEGER PRIMARY KEY AUTOINCREMENT, id_currency INTEGER, quantity DOUBLE);
    CREATE TABLE currencies( id_currency INTEGER PRIMARY KEY AUTOINCREMENT, symbol VARCHAR(10), name VARCHAR(255), price DOUBLE, marketcap DOUBLE, volume DOUBLE, change DOUBLE)

     */

    public boolean insertCurrency(int id_currency, String symbol, String name, double price, double marketcap, double volume, double change) {
        try {
            PreparedStatement prepStmt = connection.prepareStatement(
                    "INSERT INTO currencies VALUES (NULL, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, symbol);
            prepStmt.setString(2, name);
            prepStmt.setDouble(3, price);
            prepStmt.setDouble(4, marketcap);
            prepStmt.setDouble(5, volume);
            prepStmt.setDouble(6, change);

            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("insertCurrency exception.");
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static void main( String[] args )
    {
        query q = new query();
        q.insertUserCurrency(0,6,500);
        q.close();
        System.out.println( "Hello World!" );
    }
}
