
/* Topic => Learn about type conversion two type of conversion Implicit and Explicit  */

class Demo{
    public static void main(String []args){
        
        float f = 0.7f;
        System.out.printf("%.20f%n",f); // apa nu pta hai float boht choota ya boht vada number hold nhi krda ta jy apa ehnu normal print krey taa ehy appa nu 0.7 print ta krke de duu pur appa ess tareke real vich memory vicho value vekheyy ta value 0.69 yani kee 0.7 dee ass pass hai ehda matlab java apne app apa nu value round off krke return krda hai jyada chhote ja vaddi value..
     
        
//   byte b;
       
//        float f = 300;
//        b = f;
       System.out.println(b);  // ehy kehndey ke mein float too byte vich convert nhi kr sakda kyoki kyoki float da size vada h 4 byte ty byte da size chhota hai 1 byte jo ke hai -128 to 127 tak pur value h 300 ta oho hold nhi kr sakd.... TA Ethy kam andi hai Explicit conversion (casting)... 

 byte b;
       
       float f = 300;
       b = (byte)f;    // solved by casting .....
       System.out.println(b);  


       // 2nd =>

        char c = 'a';
       int i = c;
       System.out.println(i);  // it print 97 beacuse the value of A in ascii is 97....

      // 3rd =>

          int i;
       float f = 16.25f;
       i = (int)f;
       System.out.println(i); // converting float into int output => 16...
    }
}

// output => 0.69999998807907100000


/*  Implicit Conversion (Widening)

Implicit conversion is the automatic conversion of a smaller data type into a larger data type by the compiler without any data loss.

👉 Example:

int i = 10;
double d = i;   // automatic conversion
🔹 Explicit Conversion (Narrowing)

Explicit conversion is the manual conversion of a larger data type into a smaller data type using type casting, which may cause data loss.

👉 Example:

double d = 10.5;
int i = (int) d;   // manual conversion
*/