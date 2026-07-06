import java.sql.*;

public class Main{

    //create connection ....

private static final String url = "jdbc:mysql://127.0.0.1:3306/MyLocalDataBase";

    private static final String username = "root";

    private static  final String password = "Paras@12345";

    public static void main(String[] args) {
        try{                                       // Load Drivers ......
       Class.forName("com.mysql.cj.jdbc.Driver");
       } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url , username, password); // create connection ...
            Statement statement = connection.createStatement();  // create statement ..
             String query =  String.format("INSERT INTO Students (name , age, marks) VALUES('%s' , %d , %f)", "manoj" , 67 , 89.4);
             // this line is used to insert data into existing table ...


//            String query = "select * from Students" ; // query to print and take data from database .....
//
//            ResultSet resultset= statement.executeQuery(query);   // it is used when we want to retrive data .....
//            statement.executeUpdate(); // It is used when we insert , delete or update data .....
//                      while(resultset.next()){
//                          int age = resultset.getInt("age");
//                          Double marks = resultset.getDouble("marks");
//                          String name = resultset.getString ("name");
//
//                          System.out.println("age :" + age);
//
//                          System.out.println("marks :" + marks);
//                          System.out.println("name :" + name);
//                      }

int rowsAffected = statement.executeUpdate (query);

   if(rowsAffected>0){
       System.out.println("data updated succesfully");
   }else{
       System.out.println("Data is not updated");
   }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
