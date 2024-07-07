package org.example.sql;

import java.sql.SQLException;

public class SQLDemo {
    public static void main(String[] args) throws SQLException {
        // since java do not provide implementation class for DriverManager, so we need to add dependencies from Maven Central repo
        // access MySQL on system: mysql -u root -p

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven_basics_db", "root", "abhaysingh@20");
//        connection.createStatement().execute("create table jbdl_table_1 (name varchar(20), id integer)");
//        connection.close();
    }
}
