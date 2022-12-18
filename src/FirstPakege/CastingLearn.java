package FirstPakege;

import java.sql.SQLOutput;

public class CastingLearn {
    public static void main(String[] args) {


        int i =50;// smallar
        short s =5;
        long I =10l;
        float f =5.5f;
        double d=7.999;//bigger

        int convToint =(int) (d);  //(int) type we want to convart it to,(d) we want to convert from

       double convToint = (double) (i);

       float convTofloat =(long)(f);

        System.out.println(convToint);//Narowing



        System.out.println(convToDouble);// widening


        System.out.println(convTofloat);//narowing

        int a= 10;//smaller
       long b= 6546544l; //bigger 2147483647
        int c =(int) (b);
        System.out.println(c);//1016387450

        float j =4.5f;
        double k =5.21321321;
        System.out.println((float) (k));

        //primitive to non -primitive
        //concat

        String str= "helo";
        String str2= "this is java";

        System.out.println(str+str2);

        String str3 ="5+5";

        System.out.println(str3);

        int int1 =40;// "40"+5=45
        String convertTostr2 =String.valueOf(int1);

        System.out.println(5+ convertTostr2);

        int additionint =100+100; //200
        //Lets convert it to String

        String conTostr2 = String.valueOf(additionint);//200 is a String at this point

        System.out.println(5+conTostr2);

        boolean b1 =false;


        System.out.println(String.valueOf(b1)+"yes");

        char ch ='H';

        System.out.println(String.valueOf(ch));

        //String to char

        String str4 ="helo";

        System.out.println(str4.charAt(4));

        //Non-primitive to primitive

        int io= 5; // int is a data type

        String mystr5 ="5";

        Object integer ;

        System.out.println(integer.parseint(mystr5)+5);

    }

}
