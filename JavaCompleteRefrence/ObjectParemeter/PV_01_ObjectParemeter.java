class Test{
    int i, j;
    Test(int i, int j){
        this.i = i; 
        this.j = j;
    }

    boolean equalto(Test o){
        if(o.i == i && o.j == this.j)return true;
        else return false;
    }

}
public class PV_01_ObjectParemeter{
    static public void main(String args[]){
        Test obj1 = new Test(100, 1);
        Test obj2 = new Test(100, 1);
        Test obj3 = new Test(-1, 9);

        System.out.println("obj1 == obj2:"+obj1.equalto(obj2));
        System.out.println("obj1 == obj3:"+obj1.equalto(obj3));
    }
}