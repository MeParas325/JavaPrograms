class A{
    void show(){
        System.out.println("I am the method of A class.");
    }

}

class FirstDerivedClass extends A{
    int x, y;

}

class SecondDerivedClass extends FirstDerivedClass{
    void show(){
        System.out.println("I am the show method of SecondDerivedClass.");
    }

}

public class PV_03_VarDemo{
    static  A getObj(int which){
        switch(which){
            case 0:
               return new A();
            case 1:
               return new FirstDerivedClass();
            default:
               return new SecondDerivedClass();
        }
    }
    public static void main(String args[]){

        var obj1 = getObj(0);
        var obj2= getObj(1);
        var obj3 = getObj(2);

        // System.out.println(obj1.x); //this will show you an error because x is not defined in A class
        // System.out.println(obj1.y); //this will show you an error because y is not defined in A class

        // System.out.println(obj2.x); //this will also show you an error because x is not defined in A class
        // System.out.println(obj2.y); //this will also show you an error because y is not defined in A class

        // System.out.println(obj3.x); //this will also show you an error because x is not defined in A class
        // System.out.println(obj3.y); //this will also show you an error because y is not defined in A class
        

        
    
    }

}

