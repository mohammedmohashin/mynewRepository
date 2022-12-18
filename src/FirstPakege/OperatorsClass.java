package FirstPakege;

import java.sql.SQLOutput;

public class OperatorsClass {
    public static void main(String[] args) {
        //+ or addition
        int x = 4;
        int y = 5;
        System.out.println(x + y);

        //- or subtraction

        int a = 6;
        int b = 4;
        System.out.println(a - b);

        //* or multiplication

        int n = 3;
        int m = 4;
        System.out.println(n * m);

        //Division or /

        int p = 10;
        int q = 5;
        System.out.println(p / q);

        //Modulus operator or % give a remaining balance
        System.out.println(100 % 21);

        // Assignment Operator
        //  = Operator

        p = 10;
        p = 20;
        p = 40;
        System.out.println(p);

        //Incremental Operator +=
        int s = 100;
        s += 100;
        System.out.println(s);

        //Decrement Operator -=
        int z = 10;

        z -= 5;
        System.out.println(z);

        //Multiplication *=

        z *= 5;
        System.out.println(z);

        //Division /=
        z /= 4;
        System.out.println(z);

        //Modulus operator %=
        z %= 2;
        System.out.println(z);

        //Comparison operator
        //Equal to '=='
        int c = 100;
        int d = 200;

        System.out.println(c == d);

        //Not Equal to !=
        // ! not
        System.out.println(c != d);

        //Greater than>(exclusive)

        int e = 6;
        int f = 6;
        System.out.println(e > f);

        //Greater than or equal to >=(inclusive)

        System.out.println(e >= f);

        //  Logical operator
        // And '&&'
        int g = 100;
        System.out.println(40 > 50 && 100 < 200);

        // Or Operator
        // '||'

        int currentYear= 2022;
        int nextYear= 2023;
          if (currentYear<nextYear || currentYear>2011)
              System.out.println("you are great");

          // '!' Not Operator

          boolean u =5>10;//the value of u should false
        System.out.println(!u);


        }

    }
























