import java.util.Scanner;

public class CH_3_Stringg {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // Problem 1
        String name = "Paras";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String sentence = "Paras_is_a_good_boy";
        System.out.println(sentence.replace("_", " "));
        System.out.println(sentence);

        // Problem 3
        String letter = "Dear <|name|>, please enter your name";
        System.out.println(letter.replace("<|name|>" ,"Riya"));

        // Problem 4
        String spaces = "These are double and triple spaces in this sentence";
        String spaces1 = "The second sentence  to detect double and triple   spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
        System.out.println(spaces1.indexOf("  "));
        System.out.println(spaces1.indexOf("   "));

        //Problem 5
        String loveLetter = "Dear Paras,\n\t I want to say you something that I love you!;\nYou lover Unknown.";
        System.out.println(loveLetter);

    }


}
