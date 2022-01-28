class Thread1 extends Thread{
    public void run(){
        int num1 = 100, num2 = 200;
        try{
            for(int i = num1; i<num2; i++){
                int check, rem, sum = 0;
                check = i;
                while(check!=0){
                    rem = check %10;
                    sum = sum + (rem * rem *rem);
                    check = check / 10;
                }
                if(sum == i){
                    Thread.sleep(1000);
                    System.out.println(""+i+" is an armstrong number!");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
public class Thread2 extends Thread{
    public void run(){
        try{
            for(int i = 1; i<=100; i++){
                Thread.sleep(1000);
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.start();
        Thread1 t2 = new Thread1();
        t2.start();
    }
}

