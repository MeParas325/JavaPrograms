class Monkey{

    void jump(){
        System.out.println("Monkey is Jumping");
    }

    void bite(){
        System.out.println("Monkey will bite you definitely");
    }
}

interface BaseAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BaseAnimal{

    public void eat(){
        System.out.println("Human can eat anything");
    }

    public void sleep(){
        System.out.println("We have to sleep at least 8hours");
    }

    public void exercise(){
        System.out.println("I am doing exercise now");
    }
}

public class EX_4_Abstract2 {
    public static void main(String[] args) {
        BaseAnimal obj = new Human();
        obj.eat();
        obj.sleep();
        
        Human obj2 = new Human();
        obj2.eat();
        obj2.sleep();
        obj2.exercise();
        obj2.jump();
        obj2.eat();

    }
}
