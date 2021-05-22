package login;
import java.sql.*;
import javax.swing.*;
public class fees_payment extends javax.swing.JFrame {
    public fees_payment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hd_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        card_no_label = new javax.swing.JLabel();
        card_no_field = new javax.swing.JTextField();
        ccv_label = new javax.swing.JLabel();
        ccv_field = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        pay_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        hd_name.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        hd_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hd_name.setText("Payment Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(hd_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(hd_name)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        card_no_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        card_no_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        card_no_label.setText("Card_no");

        card_no_field.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ccv_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ccv_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ccv_label.setText("Ccv_no");

        ccv_field.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        name_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_label.setText("Acc_Holder_Name");

        name_field.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        pay_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pay_button.setText("Pay 1200");
        pay_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name_label)
                            .addComponent(ccv_label)
                            .addComponent(card_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(card_no_field, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(ccv_field)
                            .addComponent(name_field)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(pay_button)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card_no_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card_no_label))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccv_label)
                    .addComponent(ccv_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(pay_button)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(787, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 245, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/stu_signup";
    private void pay_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_buttonActionPerformed
        Connection conn = null;
            try
            {
                conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                System.out.println("payment details connected");
                String sql = "select * from payment where cardno=? and ccv=? and name=?";
                PreparedStatement st = conn.prepareStatement(sql);
                System.out.println("checking");
                st.setInt(1, Integer.parseInt(card_no_field.getText()));
                st.setInt(2, Integer.parseInt(ccv_field.getText()));
                st.setString(3, name_field.getText());
                System.out.println("checking1");
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println("checking2");
                    //String sql2 = "select fees from payment where cardno=?";
                    //PreparedStatement st2 = conn.prepareStatement(sql2);
                    //st2.setInt(1, Integer.parseInt(card_no_field.getText()));
                    ResultSet rs1 = st.getResultSet();
                    System.out.println("checking4");
                    if(!rs1.getString(6).equals("1200"))
                    {
                        System.out.println("1st statement processed");
                        String sql1 = "update payment set balance=balance-1200,fees='1200' where cardno=?";
                        PreparedStatement st1 = conn.prepareStatement(sql1);
                        st1.setInt(1,Integer.parseInt(card_no_field.getText()));
                        st1.executeUpdate();
                        System.out.println("2nd statement processed");
                        JOptionPane.showMessageDialog(null, "Successful payment made by "+name_field.getText()+".", "Successful payment", JOptionPane.PLAIN_MESSAGE);
                        this.dispose();
                        student_option so1 = new student_option();
                        so1.setVisible(true);  
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Already paid!!!!!!", "Payment Error", JOptionPane.PLAIN_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Payment Failed","Payment error", JOptionPane.ERROR_MESSAGE);
                    card_no_field.setText(null);
                    ccv_field.setText(null);
                    name_field.setText(null);
                }
                conn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Please fill in correct details", "Unsuccessful payment", JOptionPane.ERROR_MESSAGE);
                card_no_field.setText(null);
                    ccv_field.setText(null);
                    name_field.setText(null);
            }
            
    }//GEN-LAST:event_pay_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField card_no_field;
    private javax.swing.JLabel card_no_label;
    public javax.swing.JTextField ccv_field;
    private javax.swing.JLabel ccv_label;
    private javax.swing.JLabel hd_name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    public javax.swing.JButton pay_button;
    // End of variables declaration//GEN-END:variables
}
