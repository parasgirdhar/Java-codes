
class pre{
    int x;
    String y;
    
    pre(int s, String h){
        x=s;
        y=h;
    }
    
    pre(){
        
    }
    
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    
}

class Main{
    public static void main(String []args){
        
        pre ref=new pre(78, "paras");
        ref.display();
         pre ref2=new pre();
        ref2.display();
     
    }
}

