package FirstPakege;

import java.util.SortedMap;

public class OperatorClass {
    public static void main(String[] args) {
        // + or addition

        System.out.println(4+5);

        // - or subtraction

        System.out.println(6-1);

        // *-or multification

        System.out.println(5*4);

        // Division or /
        System.out.println(5/4);

        //Modulus operator
        System.out.println(100%21);

        //Assainment operator =
        int x=10; //Assigning 10 into x
        x =20; // once we initialize a variable with its data type we don't need to provide the
                //data type anymore

        x=30;
        x=40; //most recent one will be called

        System.out.println(x);

        // Incremental +=
        int y=5;
        y +=4; //y=y+4 same as this line
        System.out.println(y);

        // Decrement -=
        int z=10;
        z -=6;
        System.out.println(z);

        //multiplcation *=
        z *=5;
        System.out.println(z);
        //Division /=
        z /=4;
        System.out.println(z);

        //Modulus %=
        z %=2;
        System.out.println(z);

        //Comparison operator
        //Equal to '=='
        int c=200;
        int d=100;
        System.out.println(c==d);

        //Not Equal to !=
        // ! not
        System.out.println(c!=d);

        //Greater than >(exclusive)
        System.out.println(6>6);

        //Greter than or equal to>=(inclusive)
        System.out.println(6>=6);

        //Less than<
        System.out.println(4<=4);

        //Logical operator
        //And '&&'
        System.out.println(40>50 && 100<200);

        //or '||'
        int currentyear=2022;
        int nextyear=2023;

        if(currentyear<nextyear || currentyear>nextyear){
            System.out.println("you are asome");

            // '!'operator

            boolean u = 5>10;

            System.out.println(!u); //the value of u should be false

        }



    }
}
