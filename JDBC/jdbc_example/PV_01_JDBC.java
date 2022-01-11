import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class PV_01_JDBC extends JApplet implements ActionListener
{
     Label lblroll;
     Label lblname;
     Label lbladdress;
     TextField txtroll;
     TextField txtname;
     TextField txtaddress;
     Button btn;
     Button btnSave;
     public void init(){
        lblroll=new Label("Roll");
        lblname=new Label("Name");
        lbladdress=new Label("Address");
        txtroll=new TextField(20);
        txtname=new TextField(20);
        txtaddress=new TextField(20);
        btn=new Button("Display");
        btnSave=new Button("Save");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(lblroll);
        add(txtroll);
        add(lblname);
        add(txtname);
        add(lbladdress);
        add(txtaddress);
        add(btn);
        add(btnSave);
        btn.addActionListener(this);
        btnSave.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==btn){
            try{
               Class.forName("com.mysql.jdbc.Driver"); // for driver registration step1
               Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/collegenew1","root",""); // step 2 connection
               Statement stmt=cn.createStatement(); //step 3 execution of a query
               ResultSet rs_dept=stmt.executeQuery("select * from student where roll='1'"); // step 4 stroing the result set rs_dept.next();
               txtroll.setText(rs_dept.getString(1));
               txtname.setText(rs_dept.getString(2));
               txtaddress.setText(rs_dept.getString(3)); 
               while(rs_dept.next()) {
                    txtroll.setText(rs_dept.getString(1));
                    txtname.setText(rs_dept.getString(2));
                    txtaddress.setText(rs_dept.getString(3));
               }

           } 
           catch(Exception e){
                System.out.println(e.getMessage());
           }
        }
       else{
            try{
                String s="CSE";
                Class.forName("com.mysql.jdbc.Driver"); // for driver registration step1
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/studentbca","root",""); // step 2 connection
                Statement stmt=cn.createStatement(); //step 3 execution of a query
                stmt.executeUpdate("insert into student values('"+txtroll.getText()+"','"+txtname.getText()+"','"+txtaddress.getText()+"','"+s+"')"); // step 4 stroing the result set
            }           
            catch(Exception e){
                System.out.println(e);
            }
      }
   }
}