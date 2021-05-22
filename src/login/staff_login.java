package login;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import login.student_form;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
class staff_login extends JFrame
{
    JButton student;
    JButton staff;
    JButton reset;
    JButton home; 
    JTextField uname;
    JPasswordField password; 
	staff_login()
	{
		//font
		Font f = new Font("algerian",Font.BOLD,50);		
                Font f1;
		//header
		JPanel hd = new JPanel();
		hd.setBackground(new Color(0,0,0,80));
		hd.setBounds(0,0,1368,100);
		JLabel hd_name = new JLabel("Staff Login");
		hd_name.setBounds(720,50,200,50);
		hd_name.setFont(f);
		hd.add(hd_name);

		//login panel
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(500,150,400,400);
		//username label
                JLabel username = new JLabel("Username");
                username.setBackground(Color.red);
                username.setBounds(50,20,300,50);
                f1 = new Font("cambria",Font.BOLD,20);
                username.setFont(f1);
                login.add(username);
                //password label
                JLabel pswd = new JLabel("Password");
                pswd.setBackground(Color.red);
                pswd.setBounds(50,120,300,50);
                f1 = new Font("cambria",Font.BOLD,20);
                pswd.setFont(f1);
                login.add(pswd);
                
		uname = new JTextField();
		uname.setBounds(50,60,300,50);
                f1 = new Font("cambria",Font.BOLD,20);
                uname.setFont(f1);
		login.add(uname);
                
		
		password = new JPasswordField();
		password.setBounds(50,160,300,50);
                f1 = new Font("cambria",Font.BOLD,20);
                password.setFont(f1);
		login.add(password);

		/*JButton signup = new JButton("Signup");
		signup.setBounds(50,260,100,50);
		signup.setBackground(new Color(160,182,45));
		login.add(signup);*/

		JButton login_button = new JButton("Login");
		login_button.setBounds(250,260,100,50);
		login_button.setBackground(new Color(160,182,45));
		login.add(login_button);
                
                reset = new JButton("Reset");
                reset.setBounds(50,260,100,50);
                reset.setBackground(new Color(160,182,45));
                login.add(reset);

		//frame
		this.setSize(1368,768);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Relative Grading System For Students");
		this.add(login);
		this.add(hd);
                 //tail context
                home = new JButton("Home");
                home.setBounds(570,585,250,50);
                home.setFont(f1);
                this.add(home);
		this.setVisible(true);
                
                home.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        homeActionPerformed(evt);
                    }
                });
                
                 login_button.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        login_buttonActionPerformed(evt);
                    }
                });
                
                reset.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        resetActionPerformed(evt);
                    }
                });
	}
        private static final String USERNAME="root";
        private static final String PASSWORD="";
        private static final String CONN_STRING="jdbc:mysql://localhost:3306/stu_signup";
        public void login_buttonActionPerformed(java.awt.event.ActionEvent event)
        {
             Connection conn = null;
            try
            {
                conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                System.out.println("connected");
                String sql = "select * from staff where username=? and pswd=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, uname.getText());
                st.setString(2, password.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next())
                {
                    addmarks a = new addmarks();
                    this.dispose();
                    a.setSize(1369, 768);
                    a.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Welcome "+uname.getText()+".", "Successful login", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid login details","Login error", JOptionPane.ERROR_MESSAGE);
                    uname.setText(null);
                    password.setText(null);
                }
                conn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Unsuccessful Login", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public void resetActionPerformed(java.awt.event.ActionEvent evt)
        {
            uname.setText(null);
            password.setText(null);
        }

        public void homeActionPerformed(java.awt.event.ActionEvent evt)
        {
            homepage h2 = new homepage();
            //uname.setText(null);
            //password.setText(null);
        }
        
    
}
