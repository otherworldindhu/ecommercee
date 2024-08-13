package com.ms.ecommerce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        // why throws instead of try, called by repo layer, prob raised here,
        // should be informed by repo, the caller. repo is consumed by service. service to main.
        //caller will understand there's an issue(main). it has a soln. Throws will impact the interface.
        //get connection object
        Connection connection = null;
        Properties properties=loadPropertyFile();
        if(properties!=null){
            // getting the connection object
            connection=DriverManager.getConnection(properties.getProperty("app.db.url"),
                    properties.getProperty("app.db.username"),
                    properties.getProperty("app.db.password"));
        }
        //connection= DriverManager.getConnection();
        return connection;
    }
    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();;


    }
    private static Properties loadPropertyFile(){
        //return property object
        //below is done by springboot internally
        //try with resource
        Properties properties= null;
        try(InputStream inputStream=DBUtils.class.getClassLoader().getResourceAsStream("application.properties" )){
            properties=new Properties();
            properties.load(inputStream);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        return properties;
    }
    public static void main(String[] args){
        /*try{
            Connection connection=DBUtils.getConnection();
            if(connection!=null){
                System.out.println("connected");
                System.out.println(connection);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //Properties properties=DBUtils.loadPropertyFile();
        //System.out.println(properties);*/
    }
}
