class Main{
    public static void main(String []args){
        int a =10;
        int b=0;
        int c;
        try{
            System.out.println("Exception occur");
            c=a/b;
            
        }
        catch(Exception e){
            System.out.println("exception solved");
        }
    }
}