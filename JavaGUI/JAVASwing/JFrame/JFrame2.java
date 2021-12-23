import javax.swing.*;
public class JFrame2 extends JFrame{
    JFrame frm1;
    JLabel lbl_reg;
    JLabel lbl_roll_no;
    JLabel lbl_name;
    JLabel lbl_address;
    JLabel lbl_dept;
    JLabel lbl_course;
    JLabel lbl_gender;
    JLabel lbl_subjects;
    JLabel lbl_sem;
    JCheckBox jcb_check1;
    JCheckBox jcb_check2;
    JCheckBox jcb_check3;
    JCheckBox jcb_check4;
    JRadioButton rb_Male;
    JRadioButton rb_Female;
    JTextField txt_roll_no;
    JTextField txt_name;
    JComboBox jcb_course;
    JComboBox jab_sem;
    JComboBox dept;
    JButton btn_save;
    JButton btn_exit;
    JTextArea jt_address;
    JFrame2(){
        frm1 = new JFrame("Welcome to all of you:");
        lbl_reg = new JLabel("Registeration form:");
        lbl_roll_no = new JLabel("Roll no:");
        lbl_name = new JLabel("Name:");
        lbl_gender = new JLabel("Gender:");
        txt_roll_no = new JTextField(20);
        txt_name = new JTextField(20);
        rb_Male = new JRadioButton("Male");
        rb_Female = new JRadioButton("Female");
        lbl_address = new JLabel("Address:");
        jt_address = new JTextArea(4, 0);
        lbl_course = new JLabel("Course:");
        String []str = {"BCA", "MCA", "Btech"};
        jcb_course = new JComboBox(str);
        String []str1 = {"1st", "2nd", "3rd"};
        jab_sem = new JComboBox(str1);
        lbl_dept = new JLabel("Dept:");
        lbl_subjects = new JLabel("Subjects:");
        lbl_sem = new JLabel("Sem:");
        String []str3 = {"BCA", "MCA", "Btech", "MTech"};
        dept = new JComboBox(str3);
        jcb_check1 = new JCheckBox("C", false);
        jcb_check2 = new JCheckBox("JAVA", false);
        jcb_check3 = new JCheckBox("C++", false);
        jcb_check4 = new JCheckBox("Python", true);
        btn_save = new JButton("Save");
        btn_exit = new JButton("Exit");

        frm1.setSize(600,1000);
        frm1.setLayout(null);
        frm1.setVisible(true);

        lbl_roll_no.setBounds(20, 80, 80, 20);
        lbl_name.setBounds(20, 110, 80, 20);
	    lbl_reg.setBounds(50,50,80,20);
        txt_roll_no.setBounds(150, 80, 80, 20);
        txt_name.setBounds(150, 110, 80, 20);
        lbl_gender.setBounds(20, 140, 50, 20);
        rb_Male.setBounds(90, 140, 60, 20);
        rb_Female.setBounds(170, 140, 80, 20);
        lbl_address.setBounds(20, 170, 80, 20);
        jt_address.setBounds(130, 170, 80, 80);
        lbl_course.setBounds(20, 200, 80, 20);
        jcb_course.setBounds(130, 200, 120, 20);
        lbl_sem.setBounds(20, 230, 80, 20);
        jab_sem.setBounds(130, 230, 120, 20);
        lbl_dept.setBounds(20, 260, 80, 20);
        dept.setBounds(130, 260, 120, 20);
        lbl_subjects.setBounds(20, 290, 80, 20);
        jcb_check1.setBounds(130, 290, 40, 20);
        jcb_check2.setBounds(190, 290, 80, 20);
        jcb_check3.setBounds(270, 290, 60, 20);
        jcb_check4.setBounds(330, 290, 70, 20);
        btn_save.setBounds(20, 320, 60, 30);
        btn_exit.setBounds(110, 320, 60, 30);

        frm1.add(lbl_reg);
        frm1.add(lbl_roll_no);
        frm1.add(lbl_name);
        frm1.add(lbl_address);
        frm1.add(lbl_dept);
        frm1.add(lbl_course);
        frm1.add(lbl_gender);
        frm1.add(lbl_subjects);
        frm1.add(lbl_sem);
        frm1.add(jcb_check1);
        frm1.add(jcb_check2);
        frm1.add(jcb_check3);
        frm1.add(jcb_check4);
        frm1.add(rb_Male);
        frm1.add(rb_Female);
        frm1.add(txt_roll_no);
        frm1.add(txt_name);
        frm1.add(jcb_course);
        frm1.add(jab_sem);
        frm1.add(dept);
        frm1.add(btn_save);
        frm1.add(btn_exit);
        frm1.add(jt_address);
    }

    public static void main(String[] srgs)	
		{
            JFrame2 obj =new JFrame2();
		}
}