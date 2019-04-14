package classes;

import java.sql.*;

public class battleMySQL {

    private static Connection battleConn = null;
    private static Statement battleStat = null;
    private static PreparedStatement battlePreparedStat = null;
    private static String query;

    public static void makeJDBCConnection() {

        try {
            battleConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "cl14m5");
            battleStat =  battleConn.createStatement();

            query = "CREATE DATABASE IF NOT EXISTS battlebeer;";

            battleStat.execute(query);

            query = "USE battlebeer";

            battleStat.execute(query);

            query = "CREATE TABLE IF NOT EXISTS battlebeer.winners ("
                    + "id INT AUTO_INCREMENT, PRIMARY KEY,"
                    + " winner VARCHAR(50),"
                    + " team VARCHAR(50),"
                    + " beer_in_body INT);";

            battleStat.execute(query);


            battleConn.close();

            battleConn = DriverManager.getConnection("jdbc:mysql://localhost3306/battlebeer", "root", "cl14m5");



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void closeJDBCConnection() {
        try {
            battleStat.close();
            battleConn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void addDataToDB(String winner, String team, int points) {

        try {
            query = "INSERT  INTO  winners  (winner, team, beer_in_body) VALUES  (?,?,?);";
            battlePreparedStat = battleConn.prepareStatement(query);

            battlePreparedStat.setString(1, winner);
            battlePreparedStat.setString(2, team);
            battlePreparedStat.setInt(3, points);

            // execute insert SQL statement
            battlePreparedStat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
