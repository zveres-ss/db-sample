package ua.lviv.iot.programming.java.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import ua.lviv.iot.programming.java.db.jdbc.model.Student;

public class JDBCConnector {

    public Student getStudent() {
        try (Connection con = DriverManager.getConnection("jdbc:myDriver:mySql", "viruslviv", "viruslviv")) {
            con.createStatement();

        } catch (Exception exception) {

        }

        return null;
    }
}
