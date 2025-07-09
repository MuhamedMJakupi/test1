import javax.print.DocFlavor;
import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /* ->35:00
    public static void main(String[] args) {
        int age =30;
        System.out.println("Hello World");
        System.out.println(age);
        long viewcount = 3_123_456_789L; // it takes it as int so we write L in end;
        double price = 10.99;
        float price2 = 10.99F;
        char letter = 'A';
        boolean bool = true;

    }
    */
    /* -> 40:00
     public static void main(String[] args) {
         byte age =30;
         Date now = new Date();
         //now.getTime();
         //System.out.println(now);
         System.out.println(now);
     }

     */
    public static void main(String[] args) {
       /*
        byte x = 1;
        byte y = x;
        x=2;
        System.out.println(x);
        System.out.println(y);

        */
        /* ->44:00
        Point point1 = new Point(1, 1);
        System.out.println(point1);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 2;
        System.out.println(point1);
        System.out.println(point2);
        */
        //String message = new String("Hello World");
        /* -> 53:30
        String message = "Hello world"+"!!";
        System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!","*"));
        System.out.println(message.trim()); // take unnecesary spaces
        String message2 = " Hello \"Mosh\"";
        System.out.println(message2);
        */

        /* -> 1:16:00
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3;

        System.out.println(Arrays.toString(numbers));

        int[] numeros = {2,3,5,1,4};
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        System.out.println();

        int numrat [][] = new int [2][3];
        numrat[0][0] = 1;
        System.out.println(Arrays.toString(numrat));
        System.out.println(Arrays.deepToString(numrat));

        System.out.println();

        //constants
        final float pi =3.14F;

        double results = (double) 10/ (double)3;
        System.out.println(results);
        System.out.println();
        //type conversion
        // byte>short>int>long>float>double
        short x=1;
        int y=x+2;
        System.out.println(y);

        double m=1.1;
        int n = (int)m +2;
        System.out.println(n);

        String k="3.3";
        float l = Float.parseFloat(k)+2;
        System.out.println(l);
        */
        /*
        int rez = Math.max(1,2); //min,ceil,round,random(bettwen 0-1)
        System.out.println(rez);
        System.out.println();

        NumberFormat currency = NumberFormat.getCurrencyInstance(); //getPercentInstance
        String result = currency.format(1234567.891);
        System.out.println(result);
        */

        /* ->1:33:40
        Scanner scanner = new Scanner(System.in);
        //byte age = scanner.nextByte();
        //System.out.println(("You are" + age));
        System.out.println("How old are you?");
        byte age = scanner.nextByte();
        //System.out.println(age);
        System.out.println("you are : "+age+" y old");

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine().trim();
        System.out.println("Your name is : " + name);
         */

        //Mortgage Calculator
        /*
        final byte months =12;
        final byte percent=100;

        Scanner sc = new Scanner(System.in);

        System.out.println("Principal:");
        int principal = sc.nextInt();

        System.out.println("Anual interest rate:");
        float anualInterest = sc.nextFloat();
        float monhtlyInterest = anualInterest /percent/months;

        System.out.println("Period (years) : ");
        byte years = sc.nextByte();
        int nOFpayments = years * months;

        double mortgage = principal *
                (monhtlyInterest * Math.pow(1+monhtlyInterest,  nOFpayments))
                / (Math.pow(1+monhtlyInterest, nOFpayments )-1) ;

        String mortgageFormated = NumberFormat.getCurrencyInstance().format( mortgage );
        System.out.println("Mortgage : " + mortgageFormated);
        */
        // if else ... didn't write.
        // switch
        /*
        String role ="admin";
        switch (role) {
            case "admin" :
                System.out.println("admin");
                break;

            case  "user" :
                System.out.println("user");
                break;

            default:
                System.out.println("guest");
                break;
        }

         */

        //Exercise : FizzBuzz ->2:00
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Put a number : ");
        //int number = sc.nextInt();

        //opt1
        /*
        if(number % 5==0 && number % 3 ==0) {
            System.out.println("FizzBuzz");
        }
        else
        if(number % 5 == 0)
        {
            System.out.println("Fizz");
        }
        else if(number % 3 == 0)
        {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
        */


        // opt2
        /*
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else
                System.out.println("Fizz");
        }
        else if(number % 3 == 0)
        {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }

         */

        //for loops
        //while
        // shortcut ctrl+"/"
//        String input = "";
//        Scanner sc = new Scanner(System.in);
//        while(!input.equals("quit")) {
//            System.out.print("Input : ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        }
        // do while
//        String input = "";
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Input : ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        } while(!input.equals("quit"));

        // break and continue
//        String input = "";
//        Scanner sc = new Scanner(System.in);
//        //or use true in while condition
//        while(!input.equals("quit")) {
//            System.out.print("Input : ");
//            input = sc.next().toLowerCase();

            // opt1 so it doesn't write quit after again
            //if(!input.equals("quit"))

            //opt2 using break and continue
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//              }

            //for each loop
//            String[] fruits = {"Apple","Mango","Banan","Pear"};
//
//            for (int i=0;i<fruits.length;i++)
//                System.out.println(fruits[i]);
//
//        System.out.println();
//
//            for (String fruit : fruits)
//                System.out.println(fruit);

        //Mortgage calculator full
        /*
        final byte months =12;
        final byte percent=100;

        int principal = 0;
        float monhtlyInterest = 0;
        int nOFpayments = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Principal:");
            principal = sc.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1K and 1M");
        }

        while(true) {
            System.out.print("Annual interest rate:");
            float anualInterest = sc.nextFloat();
            if(anualInterest >= 1 && anualInterest <= 30) {
                 monhtlyInterest = anualInterest /percent/months;
                break;
            }

            System.out.println("Enter a value between 1 and 30");
        }


        while(true) {
            System.out.print("Period (years) : ");
            byte years = sc.nextByte();

            if(years >= 1 && years <= 30) {
                nOFpayments = years * months;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal *
                (monhtlyInterest * Math.pow(1+monhtlyInterest,  nOFpayments))
                / (Math.pow(1+monhtlyInterest, nOFpayments )-1) ;

        String mortgageFormated = NumberFormat.getCurrencyInstance().format( mortgage );
        System.out.println("Mortgage : " + mortgageFormated);


         */

    }
}
