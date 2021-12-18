import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="PV_22_Calculator" width="400" height="400"></applet>*/
public class PV_22_Calculator extends Applet implements ActionListener{
    Label lbl_num1;
    Label lbl_num2;
    Label lbl_ans;
    TextField txt_num1;
    TextField txt_num2;
    TextField txt_ans;
    Button btn_add;
    Button btn_sub;
    Button btn_mul;
    Button btn_div;
    public void init(){
        lbl_num1 = new Label("First Number:");
        lbl_num2 = new Label("Second Number:");
        lbl_ans = new Label("Your answer:");
        txt_num1 = new TextField(20);
        txt_num2 = new TextField(20);
        txt_ans = new TextField(20);
        btn_add = new Button("Add");
        btn_sub = new Button("Sub");
        btn_mul = new Button("Mul");
        btn_div = new Button("Div");
        setLayout(null);
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
        add(lbl_num1);
        add(lbl_num2);
        add(lbl_ans);
        add(txt_num1);
        add(txt_num2);
        add(txt_ans);
        add(btn_add);
        add(btn_sub);
        add(btn_mul);
        add(btn_div);
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
}