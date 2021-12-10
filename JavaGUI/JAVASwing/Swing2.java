import javax.swing.*;

public class Swing2 extends JFrame{
    public Swing2(){

    }
    public Swing2(String str){
        super(str);
    }
    static public void main(String args[]){
        Swing2 sg = new Swing2("Welcome to Swing");
        sg.setSize(300, 300);
        sg.setVisible(true);
        sg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}