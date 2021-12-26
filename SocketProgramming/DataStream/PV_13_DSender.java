import java.net.*;
public class PV_13_DSender {
    static public void main(String args[]) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String str = "or bhai kaisa hai";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 2002);

        ds.send(dp);
        ds.close();
    }
}
