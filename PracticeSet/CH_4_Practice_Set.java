import java.util.Scanner;

class CH_4_Practice_Set{
    public static void main(String[] args) {
        // Problem 1
        // int a = 10;
        // if(a == 11){
        //     System.out.println("Yes a is 11");
        // }
        // else{
        //     System.out.println("Yes a is not 11");
        // }

        // Problem 2
        // Scanner student = new Scanner(System.in);
        // System.out.println("Enter the marks of student:");
        // float a = student.nextFloat();
        // float b = student.nextFloat();
        // float c = student.nextFloat();
        
        // if(a>33 && b>33 && c>33){
        //         System.out.println("Pass");
        // }
        // else{
        //         System.out.println("Fail");
        // }
                
        //Problem 3
        // Scanner student = new Scanner(System.in);
        // System.out.println("Enter your income");
        
        //Problem 4
        // Scanner student = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = student.nextLine();
        // System.out.println("Enter your roll no:");
        // byte roll_no = student.nextByte();
        // System.out.println(name);
        // System.out.print(roll_no);

        // Problem 5
        // System.out.println("Enter your income");
        // Scanner employee = new Scanner(System.in);
        // float income = employee.nextFloat();
        // float tax;

        // if(income>= 250000 && income<=500000){
        //     tax = (income *5)/100;
        //     System.out.println("Tax you have to paid is:"+tax);
        // }
        // else if(income>= 500000 && income<=1000000){
        //     tax = (income *20)/100;
        //     System.out.println("Tax you have to paid is:"+tax);
        // }
        // else if(income>1000000){
        //     tax = (income * 30)/100;
        //     System.out.println("Tax you have to paid is:"+tax);
        // }
        // else{
        //     System.out.println("You entered Below 2Lakh 50 thousand");
        // }

        // Problem 6
        // System.out.println("Enter the day of the week:");
        // Scanner sc = new Scanner(System.in);
        // int week = sc.nextInt();
        // if(week == 1){
        //     System.out.println("Monday");
        // }
        // ese if(week == 2){
        //     System.out.println("Tuesday");
        // }
        // else if(week == 3){
        //     System.out.println("Wednesday");
        // }
        // else if(week == 4){
        //     System.out.println("Thrusday");
        // }
        // else if(week == 5){
        //     System.out.println("Friday");
        // }
        // else if(week == 6){
        //     System.out.println("Saturday");
        // }
        // else if(week == 7){
        //     System.out.println("Sunday");
        // }
        // else{
        //     System.out.println("Your input is invalid");
        // }

        // Problem 7
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();
        // if(year%400 == 0){
        //     System.out.println("Year is a leap year");
        // }
        // else if(year%100 == 0){
        //     System.out.println("YEar is not a leap year");
        // }
        // else if(year%4 == 0){
        //     System.out.println("Year is a leap year");
        // }

        // Problem 8
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Your website is not in our range");
        }


    }
}