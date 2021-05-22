package login;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class student_signup extends JFrame 
{
    public student_signup() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hd_name = new javax.swing.JLabel();
        instrn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        student_name_label = new javax.swing.JLabel();
        stu_name = new javax.swing.JTextField();
        reg_no_label = new javax.swing.JLabel();
        dept_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        reg_no = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        hd_name.setBackground(new java.awt.Color(153, 153, 153));
        hd_name.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        hd_name.setText("Student Signup Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addComponent(hd_name)
                .addGap(395, 395, 395))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(hd_name)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        instrn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        instrn.setText("Please enter the correct credentials");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        student_name_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        student_name_label.setText("Student name ");

        stu_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_nameActionPerformed(evt);
            }
        });

        reg_no_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg_no_label.setText("Register num");

        dept_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dept_label.setText("Department");

        username_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_label.setText("Username");

        password_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_label.setText("Password");

        password.setText("");

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(student_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reg_no_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dept_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stu_name)
                            .addComponent(reg_no)
                            .addComponent(dept)
                            .addComponent(uname)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(student_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(reg_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(reg_no)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(dept_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dept)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uname)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(instrn)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/stu_signup";
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connected");
            /*Statement st = (Statement) conn.createStatement();
            String stud_name = stu_name.getText();
            String register_no = reg_no.getText();
            String department = dept.getText();
            String username = uname.getText();
            String pswd = password.getText();*/
            //String insert ="insert into stu_signup.stu_signup_table values("+stud_name+","+register_no+","+department+","+username+","+pswd+")";
            String insert ="insert into stu_signup.stu_signup_table values(?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(insert);
            st.setString(1, stu_name.getText());
            st.setInt(2, Integer.parseInt(reg_no.getText()));
            st.setString(3, dept.getText());
            st.setString(4, uname.getText());
            st.setString(5, password.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion successfull");
            conn.close();
            this.dispose();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.err.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void stu_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField dept;
    private javax.swing.JLabel dept_label;
    private javax.swing.JLabel hd_name;
    private javax.swing.JLabel instrn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField password;
    private javax.swing.JLabel password_label;
    public javax.swing.JTextField reg_no;
    private javax.swing.JLabel reg_no_label;
    public javax.swing.JTextField stu_name;
    private javax.swing.JLabel student_name_label;
    private javax.swing.JButton submit;
    public javax.swing.JTextField uname;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
    
    



}
