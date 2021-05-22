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

public class displayresult extends javax.swing.JFrame {
    public displayresult() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hd_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        reg_num_label = new javax.swing.JLabel();
        reg_num_field = new javax.swing.JTextField();
        wt_label = new javax.swing.JLabel();
        wt_field = new javax.swing.JTextField();
        ca_label = new javax.swing.JLabel();
        ca_field = new javax.swing.JTextField();
        se_label = new javax.swing.JLabel();
        se_field = new javax.swing.JTextField();
        os_label = new javax.swing.JLabel();
        os_field = new javax.swing.JTextField();
        algo_label = new javax.swing.JLabel();
        algo_field = new javax.swing.JTextField();
        maths_label = new javax.swing.JLabel();
        maths_field = new javax.swing.JTextField();
        ok_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        hd_name.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        hd_name.setText("RESULT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hd_name)
                .addGap(661, 661, 661))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hd_name)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        reg_num_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reg_num_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        reg_num_label.setText("Register number");

        wt_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wt_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wt_label.setText("Web Tech");

        ca_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ca_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ca_label.setText("CA");

        se_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        se_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        se_label.setText("SE");

        os_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        os_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        os_label.setText("OS");

        algo_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algo_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        algo_label.setText("Algorithms");

        maths_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maths_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maths_label.setText("Maths");

        ok_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("homepage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maths_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(algo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(os_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(se_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ca_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wt_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reg_num_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(193, 193, 193)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reg_num_field)
                    .addComponent(wt_field)
                    .addComponent(ca_field)
                    .addComponent(se_field)
                    .addComponent(os_field)
                    .addComponent(algo_field)
                    .addComponent(maths_field, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ok_button)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(268, 268, 268))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_num_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reg_num_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ca_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ca_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(se_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(os_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(os_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(algo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(algo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maths_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maths_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/stu_signup";
    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
       
             Connection conn = null;
            try
            {
                conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                System.out.println("connected");
                String sql = " select * from addmarks inner join payment on addmarks.register_no=payment.register_no where addmarks.register_no=?";//SELECT SE,CASE WHEN SE > 90 THEN \"O\" WHEN SE > 80 THEN \"A+\" WHEN SE > 70 THEN \"A\" WHEN SE > 60 THEN \"B+\" WHEN SE > 50 THEN \"B\" ELSE \"RA\" END as GRADE FROM addmarks where register_no=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1,Integer.parseInt(reg_num_field.getText()));
                ResultSet rs = st.executeQuery();
                if(rs.next())
                {
                    ResultSet rs1 = st.getResultSet();
                    if(!rs1.getString("fees").equals("1200"))
                    {
                        JOptionPane.showMessageDialog(null,"Please pay the sem fees.","Permission denied", JOptionPane.ERROR_MESSAGE);
                        this.dispose();
                        fees_payment fp1 = new fees_payment();
                        fp1.setVisible(true);
                    }
                    else
                    {
                        String sql1 = "select avg(SE),avg(WebTech),avg(OS),avg(CA),avg(Algo),avg(Maths) from addmarks";
                        PreparedStatement st1 = conn.prepareStatement(sql1);
                        ResultSet rs2 = st1.executeQuery();
                        if(rs2.next())
                        {
                            ResultSet rs3 = st1.getResultSet();
                            int a = Integer.parseInt(rs.getString("SE"));
                            int a1 = rs3.getInt("avg(SE)");
                            if(a>=a1)
                            {
                               se_field.setText("O");
                            }
                            else if(a>=a1-10 && a<a1 && a>=50)
                            {
                                se_field.setText("A+");
                            }
                             else if(a>=a1-20  &&  a<a1-10  && a>=50)
                            {
                                se_field.setText("A");
                            }
                            else if(a>=a1-30  &&  a<a1-20  && a>=50)
                            {
                                se_field.setText("B+");
                            }
                            else if(a>=a1-40  &&  a<a1-30  && a>=50)
                            {
                                se_field.setText("B");
                            }
                            else
                            {
                                se_field.setText("RA");
                            }
                    
                            int b = Integer.parseInt(rs.getString("WebTech"));
                            int b1 = rs3.getInt("avg(WebTech)");
                            if(b>=b1)
                            {
                               wt_field.setText("O");
                            }
                            else if(b>=b1-10 && b<b1 && b>=50)
                            {
                                wt_field.setText("A+");
                            }
                             else if(b>=b1-20  &&  b<b1-10  && b>=50)
                            {
                                wt_field.setText("A");
                            }
                            else if(b>=b1-30  &&  b<b1-20  && b>=50)
                            {
                                wt_field.setText("B+");
                            }
                            else if(b>=b1-40  &&  b<b1-30  && b>=50)
                            {
                                wt_field.setText("B");
                            }
                            else
                            {
                                wt_field.setText("RA");
                            }
                     
                            int c = Integer.parseInt(rs.getString("OS"));
                            int c1 = rs3.getInt("avg(OS)");
                            if(c>=c1)
                            {
                               os_field.setText("O");
                            }
                            else if(c>=c1-10 && c<c1 && c>=50)
                            {
                                os_field.setText("A+");
                            }
                             else if(c>=c1-20  &&  c<c1-10  && c>=50)
                            {
                                os_field.setText("A");
                            }
                            else if(c>=c1-30  &&  c<c1-20  && c>=50)
                            {
                                os_field.setText("B+");
                            }
                            else if(c>=c1-40  &&  c<c1-30  && c>=50)
                            {
                                os_field.setText("B");
                            }
                            else
                            {
                                os_field.setText("RA");
                            }
                    
                            int d = Integer.parseInt(rs.getString("Algo"));
                            int d1 = rs3.getInt("avg(Algo)");
                            if(d>=d1)
                            {
                               algo_field.setText("O");
                            }
                            else if(d>=d1-10 && d<d1 && d>=50)
                            {
                                algo_field.setText("A+");
                            }
                             else if(d>=d1-20  &&  d<d1-10  && d>=50)
                            {
                                algo_field.setText("A");
                            }
                            else if(d>=d1-30  &&  d<d1-20  && d>=50)
                            {
                                algo_field.setText("B+");
                            }
                            else if(d>=d1-40  &&  d<d1-30  && d>=50)
                            {
                                algo_field.setText("B");
                            }
                            else
                            {
                                algo_field.setText("RA");
                            }
                   
                            int e = Integer.parseInt(rs.getString("CA"));
                            int e1 = rs3.getInt("avg(CA)");
                            if(e>=e1)
                            {
                               ca_field.setText("O");
                            }
                            else if(e>=e1-10 && e<e1 && e>=50)
                            {
                                ca_field.setText("A+");
                            }
                             else if(e>=e1-20  &&  e<e1-10  && e>=50)
                            {
                                ca_field.setText("A");
                            }
                            else if(e>=e1-30  &&  e<e1-20  && e>=50)
                            {
                                ca_field.setText("B+");
                            }
                            else if(e>=e1-40  &&  e<e1-30  && e>=50)
                            {
                                ca_field.setText("B");
                            }
                            else
                            {
                                ca_field.setText("RA");
                            }
                            
                            int f = Integer.parseInt(rs.getString("Maths"));
                            int f1 = rs3.getInt("avg(Maths)");
                            if(f>=f1)
                            {
                               maths_field.setText("O");
                            }
                            else if(f>=f1-10 && f<f1 && f>=50)
                            {
                                maths_field.setText("A+");
                            }
                             else if(f>=f1-20  &&  f<f1-10  && f>=50)
                            {
                                maths_field.setText("A");
                            }
                            else if(f>=f1-30  &&  f<f1-20  && f>=50)
                            {
                                maths_field.setText("B+");
                            }
                            else if(f>=f1-40  &&  f<f1-30  && f>=50)
                            {
                                maths_field.setText("B");
                            }
                            else
                            {
                                maths_field.setText("RA");
                            }
                    }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No such entry!!!","Permission denied", JOptionPane.ERROR_MESSAGE);
                    //uname.setText(null);
                    //password.setText(null);
                }
                conn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        homepage h2 =new homepage();
        this.dispose();
        h2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField algo_field;
    private javax.swing.JLabel algo_label;
    public javax.swing.JTextField ca_field;
    private javax.swing.JLabel ca_label;
    private javax.swing.JLabel hd_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JTextField maths_field;
    private javax.swing.JLabel maths_label;
    private javax.swing.JButton ok_button;
    public javax.swing.JTextField os_field;
    private javax.swing.JLabel os_label;
    public static javax.swing.JTextField reg_num_field;
    private javax.swing.JLabel reg_num_label;
    public javax.swing.JTextField se_field;
    private javax.swing.JLabel se_label;
    public javax.swing.JTextField wt_field;
    private javax.swing.JLabel wt_label;
    // End of variables declaration//GEN-END:variables
}
