
package login;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;

public class test 
{
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/stu_signup";
    
    void Connection()
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connection successful");
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Connection problem");
        }
    }
    
    public static void main(String arr[])
    {
        test t = new test();
        t.Connection();
    }
}
