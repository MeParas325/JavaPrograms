interface A{
    void meth1();
    default String meth2(){
        return "Default String";
    }
}