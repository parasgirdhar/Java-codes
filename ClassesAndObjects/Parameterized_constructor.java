

// Jahan har object ka data alag ho → wahan parameterized constructor use hota hai


class Student {
    int rollNo;
    String name;
    String className;

    Student(int r, String n, String c) {
        rollNo = r;
        name = n;
        className = c;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + className);
    }
}


class Main{
    public static void main(String []args){
        
        
      Student ref=new Student(87,"paras", "4A1");
      Student ref2=new Student(72,"avinash", "4b");
      Student ref3=new Student(98,"rudar", "3c");
      
      ref.display();
       ref2.display();
        ref3.display();   
    }
}
