class butterfly_pattern{
    public static void main(String[] args) {
        
int n=4;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }


// making of spaces...


int space =2*(n-i);{
    for(int j=1;j<=space;j++){
        System.out.print(" ");
    }


for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();

}

}

// now move to lower portion...

for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }


// making of spaces...


int space =2*(n-i);{
    for(int j=1;j<=space;j++){
        System.out.print(" ");
    }


for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();

}

}



    }
}