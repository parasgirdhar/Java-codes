// print both larger and smaller value and their index value......

public class index_value{
  public static void main(String[] args) {
    

int larger=Integer.MIN_VALUE;
int smaller=Integer.MAX_VALUE;

int indexofsmaller=-1;
int indexoflarger=-1;

int num[]={3,4,5,7,9,1,7,-7,-8,0,9};

for(int i=0;i<num.length;i++){
   if(num[i]>larger){
    larger=num[i];
    indexoflarger=i;
   }

 if(num[i]<smaller){
    smaller=num[i];
    indexofsmaller=i;
   }
}

System.out.println("this is smaller" + smaller  + " this is index : " + indexofsmaller);
System.out.println("this is larger" + larger  + " this is index : " + indexoflarger);

  }
}
