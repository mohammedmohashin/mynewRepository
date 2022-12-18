package FirstPakege;

public class DataType{
    public static void main(String[] args) {
        //primitive data type: it specifies the size and type of variable value

        //Byte -1 byte-store whole number from -128 to 127

        byte k=100;
        System.out.println(k);

        //short- 2 byte - store whole number from - 32,768 to 32,767
        short q=2000;
        System.out.println(q);

        // int- 4 byte - store whole number from -2,147,483,648 to 2,147,483,647
        int a=50000000;
        System.out.println(a);

        //long - 8 byte -store whole number from -9,223,372,836,854,775,808 to 9,223,372,836,854,775,807
        long b=5l;
        System.out.println(b);

        //primitive -numeric-floating point data type
         //float- 4 byte -sufficient for storing 6 to 7 decimal digits
        int x=10;
        int y=20;
        System.out.println(x/y);

        float f=10.10f;
        System.out.println(f);

        //double-8 bytes-sufficient for storing 15 decimal digits
        double d=1.12345678912342213;
        System.out.println(d);

        //primitive- non numeric data type
        // char- 2 bytes store a single character/letter or ascciding value
         char c= 'A';
        System.out.println(c);

         //boolean - true/false
        int n1=100;
        int n2=200;
        System.out.println(n1>n2);
    }


}
