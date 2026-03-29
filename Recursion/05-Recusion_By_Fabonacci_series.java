
class dev{

public static void fetch(int curr, int counter,int next, int resu, int n){


if(counter>=n){
    return ;
}

else{

    resu=curr+next;
System.out.println(resu);
   curr=next;
   next=resu;
fetch(curr, counter+1, next, resu, n);

}
       }
public static void main(String []args){



fetch(0, 0,1, 0  ,8);
}

}

