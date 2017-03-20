package ua.lviv.iot.programming.java.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ua.lviv.iot.programming.java.db.jdbc.model.Student;

public class JDBCConnector {

    public Student getStudent() {

        Student student = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/iot-test-db", "viruslviv",
                "viruslviv")) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students");

            if (rs.next()) {

                student = new Student();
                student.setId(rs.getInt(1));
                student.setFirstName(rs.getString(2));

            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return student;
    }

    public Student createStudent() {

        Student student = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/iot-test-db", "viruslviv",
                "viruslviv")) {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO `students` (`id`, `first_name`, `last_name`, `enrollment_year`) "
                    + " VALUES (101, 'Vitaliy', 'Chucherskyy', 2016)");
            
            // no need to call commit since autocommit is set to true
            //con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return student;
    }
}
