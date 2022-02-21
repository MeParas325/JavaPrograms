class PV_03_Bytes{
    static public void main(String args[]){
        byte b = 10;
        // b = b*2; //This will give you an error that possible lossy conversion from int to byte
        b = (byte)(b*2);
        System.out.println(b);
    }
}