import javax.swing.*;

public class Swing3 extends JFrame{
    JLabel lab_Head;
    JLabel lab_num1;
    JLabel lab_num2;
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
        lab_num1  = new JLabel("First Number");
        lab_num2  = new JLabel("Second Number");
        txt_num1  = new JTextField(20);
        txt_num2  = new JTextField(20);
        btn = new JButton("Click");

        setLayout(null);
        lab_Head.setBounds(60, 40, 100, 30);
        lab_num1.setBounds(40, 80, 100, 30);
        lab_num2.setBounds(38, 110, 100, 30);
        txt_num1.setBounds(160, 80, 100, 25);
        txt_num2.setBounds(160, 110, 100, 25);
        btn.setBounds(105, 160, 70, 25);
        add(lab_Head);
        add(lab_num1);
        add(lab_num2);
        add(txt_num1);
        add(txt_num2);
        add(btn);
    }
    static public void main(String args[]){
        Swing3 sg = new Swing3("Welcome to Swing");
        sg.components();
        sg.setSize(400, 400);
        sg.setVisible(true);
        sg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}