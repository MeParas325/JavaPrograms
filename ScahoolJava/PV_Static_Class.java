class Solution {
    static int clg_id = 3536;
    void get_data(){
        System.out.println("Get data called");
    }
    static class Student{
        int student_id;
        void display(){
            System.out.println(clg_id);
        }
    }

class PV_Static_Class
{
    public static void main(String[] args) {
        Solution c1 = new Solution();
        System.out.println(clg_id);
        c1.get_data();
        Solution.Student c2 = new Solution.Student();
        c2.display();

    }
  }
}
