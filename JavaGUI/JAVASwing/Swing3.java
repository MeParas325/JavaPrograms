import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing3 extends JFrame implements ActionListener{
    JLabel lab_Head;
    JLabel lab_num1;
    JLabel lab_num2;
    JLabel lab_det;
    JLabel lab_ans;
    JTextField txt_num1;
    JTextField txt_num2;
    JButton btn;

    public Swing3(){

    }
    public Swing3(String str){
        super(str);
    }
    public void components(){
        lab_Head  = new JLabel("Add two numbers");
        lab_num1  = new JLabel("First Number:");
        lab_num2  = new JLabel("Second Number:");
        lab_ans = new JLabel("");
        lab_det = new JLabel("Answer is:");
        txt_num1  = new JTextField(20);
        txt_num2  = new JTextField(20);
        btn = new JButton("Click");

        setLayout(null);
        lab_Head.setBounds(60, 40, 100, 30);
        lab_num1.setBounds(40, 80, 100, 30);
        lab_num2.setBounds(38, 110, 100, 30);
        lab_det.setBounds(90, 140, 100, 30);
        lab_ans.setBounds(160, 140, 40, 30);
        txt_num1.setBounds(160, 80, 100, 25);
        txt_num2.setBounds(160, 110, 100, 25);
        btn.setBounds(105, 180, 70, 25);
        btn.addActionListener(this);
        add(lab_Head);
        add(lab_num1);
        add(lab_num2);
        add(txt_num1);
        add(txt_num2);
        add(lab_ans);
        add(lab_det);
        add(btn);
    }

    public void actionPerformed(ActionEvent e){
        int var1, var2, ans;
        if(e.getSource() == btn){
            var1 = Integer.parseInt(txt_num1.getText());
            var2 = Integer.parseInt(txt_num2.getText());
            ans = var1 + var2;
            lab_ans.setText(String.valueOf(ans));
        }
    }
    static public void main(String args[]){
        Swing3 sg = new Swing3("Welcome to Swing");
        sg.components();
        sg.setSize(400, 400);
        sg.setVisible(true);
        sg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}