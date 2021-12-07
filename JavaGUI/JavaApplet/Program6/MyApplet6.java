import java.applet.Applet;
import java.awt.*;
/* <applet code="MyApplet6" width="400" height="200">
    <param name="Paras" value="Tannu"/>
</applet>*/

public class MyApplet6 extends Applet{
    private String defaultMessage = "Hello";
    public void paint(Graphics g){
        String s1 = getParameter("Paras");
        if(s1 == null){
            s1 = defaultMessage;
        }

        g.drawString(s1, 50, 25);
  }
}