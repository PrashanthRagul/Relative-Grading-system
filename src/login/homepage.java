package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import login.staff_login;
import login.student_login;
class homepage extends JFrame
{
    JButton student;
    JButton staff;
	homepage()
	{
		//font
		Font f = new Font("algerian",Font.BOLD,50);		
                Font f1 = new Font("cambria",Font.BOLD,20);
		//header
		JPanel hd = new JPanel();
		hd.setBackground(new Color(0,0,0,80));
		hd.setBounds(0,0,1368,100);
		JLabel hd_name = new JLabel("Relative Grading System");
		hd_name.setBounds(720,50,200,50);
		hd_name.setFont(f);
		hd.add(hd_name);

		//login panel
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(500,250,400,250);

		student = new JButton("STUDENT");
		student.setBounds(50,50,300,50);
                student.setFont(f1);
		student.setBackground(new Color(50,182,45));
		login.add(student);

		staff = new JButton("STAFF");
		staff.setBounds(50,150,300,50);
                staff.setFont(f1);
		staff.setBackground(new Color(50,182,45));
		login.add(staff);
                
                //performing action
                thehandler handler = new thehandler();
                student.addActionListener(handler);
                staff.addActionListener(handler);
                
		//frame
		this.setSize(1368,768);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Relative Grading System For Students");
		this.add(login);
		this.add(hd);
                //head context
                JLabel head = new JLabel("Welcome to the Grading System Portal");
                head.setBounds(530,140,900,50);
                head.setFont(f1);
                this.add(head);
		this.setVisible(true);	
	}
        
        private class thehandler implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                String string = "";
                if(event.getSource() == student)
                {
                    string = event.getActionCommand();
                    student_login stu_l = new student_login();
                    stu_l.setVisible(true);
                }
                else if(event.getSource() == staff)
                {
                    string = event.getActionCommand();
                    staff_login s_l = new staff_login();
                    s_l.setVisible(true);
                }
            }
        }
	
	public static void main(String arr[])
	{
		homepage h = new homepage();		
	}
}
