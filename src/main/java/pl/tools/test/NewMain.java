/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tools.test;

/**
 *
 * @author Michał
 */
public class NewMain {
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
  * Java program to demonstrate JDBC Batch Insert example. Inserting data in batch
  * seems to improve performance a lot. executeBatch() method of PreparedStatement is
  * used to run batch queries in Java JDBC.
  */
public class MySQLJdbcExample {

    public static void main(String args[]) throws SQLException {
     
        //creating JDBC Connection to mysql database
        String url="jdbc:mysql://localhost:3306/test";
        Connection conn = DriverManager.getConnection(url, "root", "root");
       // conn.setAutoCommit(false); keep auto commit false for better performance

        //query for inserting batch data
        String query = "insert into employee values (?,?,NULL)";
        PreparedStatement pStatement = conn.prepareStatement(query);
        int batchSize = 100;
     
        long startTime = System.currentTimeMillis();
        for (int count = 0; count < 1000; count++) {
            pStatement.setString(1, Integer.toString(count));
            pStatement.setString(2, "Employee" + count);
            pStatement.addBatch();
         
            if (count % batchSize == 0) {
                pStatement.executeBatch();
            }
        }

       pStatement.executeBatch() ; //for remaining batch queries if total record is odd no.
     
     // conn.commit();
        pStatement.close();
        conn.close();
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime)/1000; //in seconds
        System.out.println("Total time required to execute 1000 queries using PreparedStatement with JDBC batch insert is :" + elapsedTime);

     
     
    }
}


}
