 
// Topic => Here we Learn about variables , data-types there initilization Conversions into Binary,octal , hexa-deciaml , ...



/*  In java datatypes are divided into two types....

 primitive and non primitve 

 primitive => Integer , Real no , Character , Boolean

 Integer => byte , short , int , long

 Real no => float , double

 charcter => char

 Boolean => boolean


 how range is classified in Integer

 for example the range of byte is -128 to 127  lets convert this into binary the size of byte is in byte is 1

 Formula hota hai:

Minimum = -2ⁿ⁻¹
Maximum = 2ⁿ⁻¹ - 1

👉 yahan n = 8

Minimum = -2⁷ = -128
Maximum = 2⁷ - 1 = 127


✔️ Actually:

8 bits → total combinations = 2⁸ = 256
But half negative, half positive hota hai (due to Two’s Complement)


So:

128 negative numbers
128 non-negative (0 included)

👉 Final range:
-128 to 127

*/

class hlo{
    public static void main(String []args){

  float a= 10;
  float c=78.9f;
  System.out.println(a);   

    }

}

 /*  output => 10.0

=== Code Execution Successful ===

if want to use decimal value in float than use (f) after assigning value....like in 61 no. line

float nu kehnde hai single precision ..
double nu kehnde hai double precision ...

float da ke seen hai ke jdo appa kai wada industry level project bnandy aa na ta apa float nu totally avoi dhi krdy aa kyoo kyuki float jo hai oho (. decimal wale value accept hi ni krdaa) forex=> agr appa pta krne dollar da price 86.34 => ta appa float use hi ni kr skty or ek chij jo pehle de processor se oho float lyii optimize se pur hun dy double lyi hai ta always use double instead of float in decimal values..



char =>
*/


    class Main{
    public static void main(String []args){
        char a='c';
        System.out.println(a);
    }
}

/* 
output => c

=== Code Execution Successful ===


char is mostly use in =>

    Use:

vowels count karna
palindrome check
password validation



🔹 2. Input Validation

Forms mein ek character check karna ho

👉 Example:

char gender = 'M';

📌 Use:

'M' / 'F'
'Y' / 'N'
grade ('A', 'B', 'C')


but mostly instead of char (String) is mostly used ......


what is identifier and what is literal forEx =>

    int a = 15;  =>   // hun ethy apne kol jo a hai oho hai identifier jis nal identity ho rhi hai or jo apna 15 hai oho hai literal ... Ehy coding terms hai 



    use over all saree.....
*/

    class Main{
    public static void main(String []args){
      byte b = 5;
      int i = 10;
      short s = 4000;
      long l = 10_000;
      System.out.println("value of byte is "+ b + " value of int is " +  i + " value of short is "+ s + " value of long is " + l);
      
      char c ='R';
      System.out.println("char c is  " + c);
      
      float f = 56.98f;
      double d = 67.43;
      System.out.println("value of float f is "+  f);
       System.out.println("value of double d is "+  d);
      
      boolean bool = true;
      System.out.println(bool);
    }
}



  /* byte b = 0b111;   using in binary...zero,b da matlab hai binary compiler smjh jauga menu value binary vich detii aa apne app decimal vich convert krugaa...
      
  int i = 07;   agr mein   octal   likhna chana ta menu pta hai octal 0-7 tak hunda hai agr mein ethy 07 likha ta shi hai compiler nu pta lg ju ke octal de rhy hai ta 7 print hoo ju pur agr mein 08 deen de koshish kra ta error augaa oho kyo kyoki 08 vich 8 de aggy 0 likhy ohnu pta lg gya ke octal de rhy hai pur oho khu gaa ke octal ta 0 to 7 hi hunda hai fir 8 kyoo de rhy hai ta error aauga...

for Hexa we use 0x(zero , x) we know hexa allow values 0-9 A-B-C-D-E-F 
SO if we type int s = 0xf ... it print 15 , 0xE it print 14 use this a to e in small letter or Either capiltal doesn't matter....
 




Keywords are reserved words in Java that have a predefined meaning and cannot be used as identifiers (like variable names, class names, etc.). 

IMP => There are total 68 ketwords in java which are reserved....
 
*/ 

