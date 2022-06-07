import java.util.Scanner;

public class PV_01_StringPalindrome{
    static boolean palindromeString(int i, int j, String str){
        if(i>=j){
            return true;
        }else if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return palindromeString(i+1, j-1, str);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String:");
        String str = sc.nextLine();

        if(palindromeString(0, str.length() - 1, str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

        sc.close();
    }
}