class Experiment{
    String sen = "I am the variable of experiment class.";

    void show(){
        System.out.println("Showing the method of experiment class.");
    }

}
public class PV_04_DefaultMethodInterface extends Experiment implements B{
    public void meth1(){
        System.out.println("I am the method 1.");
    }
    public void meth2(){
        System.out.println("I am the method 2.");
    }
    public void meth3(){
        System.out.println("I am the method 3.");
    }

    public void show(){
        System.out.println("I am the show method of PV_04 class.");
    }
    
    static public void main(String argsp[]){
        Experiment obj = new PV_04_DefaultMethodInterface();
        System.out.println(obj.sen);
        obj.show();
        // obj.meth1(); //This will give you an error because you didnt defined the meth1 in experiment class

    }
}
