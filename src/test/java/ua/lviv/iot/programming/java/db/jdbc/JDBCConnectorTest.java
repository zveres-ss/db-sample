package ua.lviv.iot.programming.java.db.jdbc;

import org.junit.Test;

import org.junit.Assert;

public class JDBCConnectorTest {

    @Test
    public void testGetStudent() {
        JDBCConnector connector = new JDBCConnector();
        Assert.assertNotNull(connector.getStudent());
    }
}
