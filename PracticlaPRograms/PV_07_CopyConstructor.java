class PV_07_CopyConstructor
{
    String name;
    long rollNo;
    PV_07_CopyConstructor(String name, long rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    PV_07_CopyConstructor(PV_07_CopyConstructor s)
    {
        System.out.println("Copy constructor  !! ");
        name = s.name;
        rollNo = s.rollNo;
    }

    public static void main(String[] args) {
        PV_07_CopyConstructor s1 = new PV_07_CopyConstructor("Paras", 20041184);
        PV_07_CopyConstructor s2 = new PV_07_CopyConstructor(s1);
        System.out.println("Name  : " + s2.name);
        System.out.println("Roll Number : " + s2.rollNo);
    }
}
