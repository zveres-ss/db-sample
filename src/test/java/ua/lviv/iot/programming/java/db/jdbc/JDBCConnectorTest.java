package ua.lviv.iot.programming.java.db.jdbc;

import org.junit.Test;

import ua.lviv.iot.programming.java.db.jdbc.model.Student;

import org.junit.Assert;

public class JDBCConnectorTest {

    @Test
    public void testGetStudent() {
        JDBCConnector connector = new JDBCConnector();
        Student student = connector.getStudent();
        Assert.assertNotNull(student);
        
        System.out.println(student);
    }
    
    
    @Test
    public void testCreateStudent() {
        JDBCConnector connector = new JDBCConnector();
        connector.createStudent();
    }
}
