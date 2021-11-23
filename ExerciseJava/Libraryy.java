import java.util.Scanner;
class MyBooks{
    static String Books[] = {"Java", "C++", "Python", "JS", "HTML&CSS"};
    static int n = Books.length;
    public void showBooks(){
        int i;
        for (i= 0; i < n; i++) {
            System.out.println(Books[i]);
        }
    }

    public void issueBooks(String user){
        int i;
        if(user == "HTML&CSS"){
            System.out.println("Books issued by you is:"+user);
            System.out.println("Remaining books are:");
            for (i= 0; i < Books.length; i++) {
                System.out.println(Books[i]);
            }
            Books.length = n - 1;
        }
        else{
            for(i = 0, i < n; i++){
                if(Books[i] == user){
                    System.out.println("Book issued by you is:"+Books[i]);
                }
            }
            if(i==n){
                System.out.println("Book is not found");
            }
        }
    }

    public void returnBooks(String user){
        int i;
        Books.length = n + 1;
        for (i= 0; i < n+1; i++) {
            System.out.println(Books[i]);
        }
    }

}

class Libraryy {
 public static void main(String[] args) {
        while(true){
            System.out.println("Enter your choice:");
            System.out.println("1.You want to issue any book:");
            System.out.println("2.You want to return any book:");
            System.out.println("3.You want to see all library books:");
            System.out.println("4.Quit!");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    
                    break;

                case 2:
                    break;
            
                case 3:
                    
                    break;
                
                case 4:
                    default:
                        break;
                
                default:
                   System.out.println("Your choice is wrong!");
                   break;
            }



        }
    }
}
