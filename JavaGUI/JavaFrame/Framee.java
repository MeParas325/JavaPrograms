import java.awt.*;
class Frameee extends Frame{
     Frame frm1;
     Label lbl_roll;
     TextField txt_roll;
     Button btn_click;

     Frameee(){
         frm1 = new Frame("Welcome to GUI");
         lbl_roll = new Label("Roll No");
         txt_roll = new TextField(20);
         btn_click = new Button("Click");
         FlowLayout f1 = new FlowLayout();
         frm1.setSize(300, 300);
         frm1.setLayout(f1);
         frm1.setVisible(true);
         frm1.add(lbl_roll);
         frm1.add(txt_roll);
         frm1.add(btn_click);

     }
}

public class Framee {
    static public void main(String agrs[]){
        Frameee obj = new Frameee();
    }
}