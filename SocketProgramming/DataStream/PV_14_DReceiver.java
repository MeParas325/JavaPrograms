import java.net.*;
public class PV_14_DReceiver {
    static public void main(String args[])throws Exception{
         DatagramSocket ds = new DatagramSocket(2002);
         byte[] by = new byte[1000];

         DatagramPacket dp = new DatagramPacket(by, 1000);
         ds.receive(dp);
         String str = new String(dp.getData(), 0, dp.getLength());
         System.out.println(str);
         ds.close();

    }
}
