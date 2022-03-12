interface B{
    void meth1();
    void meth2();
    void meth3();
    default String meth4(){
        return "Mein default hoon";
    }
}