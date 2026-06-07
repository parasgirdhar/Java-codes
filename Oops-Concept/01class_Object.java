class demo{
    int a= 10;
    String b="paras";

    void show(){
        System.out.println(a+b);
    }
}

class Main{
    public static void main(String []args){
        demo ref = new demo();
        ref.show();
    }
}