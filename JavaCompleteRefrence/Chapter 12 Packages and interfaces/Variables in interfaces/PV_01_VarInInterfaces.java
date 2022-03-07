import java.util.Random;

interface SharedConstants{
    int No = 0;
    int Yes = 1;
    int Maybe = 2;
    int Later = 3;
    int Soon = 4;
    int Never = 5;
}

class Questions implements SharedConstants{

    Random rand = new Random();
    int ask(){
        int prob = (int) (100*rand.nextDouble());
        if(prob < 30) return No;
        else if(prob < 60) return Yes;
        else if(prob < 75) return Later;
        else if(prob < 98) return Soon;
        else return Never;
    }
}
public class PV_01_VarInInterfaces{

    static void answer(int result){
        switch(result){
            case 0:
                System.out.println("No");
                break;
            case 1:
                System.out.println("Yes");
                break;
            case 2:
                System.out.println("Maybe");
                break;
            case 3:
                System.out.println("Later");
                break;
            case 4:
                System.out.println("Soon");
                break;
            case 5:
                System.out.println("Never");
                break;

        }

    }
    static public void main(String args[]){
        Questions q = new Questions();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
    
}