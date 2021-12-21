import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrame1 extends JFrame implements ActionListener{
    JFrame frm1;
    JLabel lbl_num1;
    JLabel lbl_num2;
    JLabel lbl_ans;
    JTextField txt_num1;
    JTextField txt_num2;
    JTextField txt_ans;
    JButton btn_add;
    JButton btn_sub;
    JButton btn_mul;
    JButton btn_div;
    JFrame1(){
        frm1 = new JFrame("Welcome to all of you:");
        lbl_num1 = new JLabel("First Number:");
        lbl_num2 = new JLabel("Second Number:");
        lbl_ans = new JLabel("Your answer:");
        txt_num1 = new JTextField(20);
        txt_num2 = new JTextField(20);
        txt_ans = new JTextField(20);
        btn_add = new JButton("Add");
        btn_sub = new JButton("Sub");
        btn_mul = new JButton("Mul");
        btn_div = new JButton("Div");
        frm1.setSize(400, 400);
        frm1.setLayout(null);
        frm1.setVisible(true);
        lbl_num1.setBounds(50, 50, 80, 20);
        lbl_num2.setBounds(50, 100, 80, 20);
        lbl_ans.setBounds(50, 150, 80, 20);
        txt_num1.setBounds(150, 50, 80, 20);
        txt_num2.setBounds(150, 100, 80, 20);
        txt_ans.setBounds(150, 150, 80, 20);
        btn_add.setBounds(80, 200, 50, 20);
        btn_sub.setBounds(140, 200, 50, 20);
        btn_mul.setBounds(200, 200, 50, 20);
        btn_div.setBounds(260, 200, 50, 20);
        frm1.add(lbl_num1);
        frm1.add(lbl_num2);
        frm1.add(lbl_ans);
        frm1.add(txt_num1);
        frm1.add(txt_num2);
        frm1.add(txt_ans);
        frm1.add(btn_add);
        frm1.add(btn_sub);
        frm1.add(btn_mul);
        frm1.add(btn_div);
        btn_add.addActionListener(this);
        btn_sub.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int var1;
        int var2;
        int ans;
        if(e.getSource() == btn_add){
            var1 = Integer.parseInt(txt_num1.getText());
            var2 = Integer.parseInt(txt_num2.getText());
            ans = var1 + var2;
            txt_ans.setText(String.valueOf(ans));
        }
        else if(e.getSource() == btn_sub){
            var1 = Integer.parseInt(txt_num1.getText());
            var2 = Integer.parseInt(txt_num2.getText());
            ans = var1 - var2;
            txt_ans.setText(String.valueOf(ans));
        }
        else if(e.getSource() == btn_mul){
            var1 = Integer.parseInt(txt_num1.getText());
            var2 = Integer.parseInt(txt_num2.getText());
            ans = var1 * var2;
            txt_ans.setText(String.valueOf(ans));
        }
        else if(e.getSource() == btn_div){
            var1 = Integer.parseInt(txt_num1.getText());
            var2 = Integer.parseInt(txt_num2.getText());
            ans = var1 / var2;
            txt_ans.setText(String.valueOf(ans));
        }
        
    }
    public static void main(String args[]){
        JFrame1 obj = new JFrame1();
    }
}