import java.applet.Applet;
import java.awt.*;
/*<applet code="MyApplet3" width="400" height="300"></applet>*/
public class MyApplet3 extends Applet{
    Label l1, l2;
    Button b2;
    TextField t1, t2;
    public void init(){
        l1 = new Label("1st number");
        l2 = new Label("2nd number");
    
        b2 = new Button("Add");
    
        t1 = new TextField();
        t2 = new TextField();
        setLayout(null);
        l1.setBounds(50, 30, 90, 20);
        l2.setBounds(50, 50, 90, 20);
        t1.setBounds(180, 30, 50, 20);
        t2.setBounds(180, 50, 50, 20);
        b2.setBounds(110, 100, 40, 20);
        add(l1);
        add(l2);
        add(b2);
        add(t1);
        add(t2);
    }
}