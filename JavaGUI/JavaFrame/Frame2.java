public class Frame2 extends Frame implements ActionListener{
     Frame frm1;
     Label lbl_msg;
     Label lbl_msg_e;
     Label lbl_msg_e2;
     TextField txt_msg;
     Button btn_click;

     Frame2(){
         frm1 = new Frame("First Program");
         lbl_msg = new Label("Enter message:");
         lbl_msg_e = new Label("Message Entered:");
         lbl_msg_e2 = new Label("");
         txt_msg = new TextField(30);
         btn_click = new Button("Click");

         FlowLayout f1 = new FlowLayout();
         frm1.setSize(300, 300);
         frm1.setLayout(f1);
         frm1.setVisible(true);
         frm1.add(lbl_msg);
         frm1.add(lbl_msg_e);
         frm1.add(lbl_msg_e2);
         frm1.add(txt_msg);
         frm1.add(btn_click);

         public void actionPerformed(ActionEvent e){
             String str = txt_msg.getText();
             lbl_msg_e2.setText(str);
         }
     }

     static public void main(String args[]){
         Frame2 obj = new Frame2(); 
     }
}