package FirstPakege;

public class Phone {

    //This is the blueprint of all the the phone that ever existed/will exist
     String color;
     String brand;
     int size;
     int weight;

     static String typeofphone= "smart phone";

     void turnOn() {
         System.out.println("turn on the phone");

         void turnoff () {
             System.out.println("turn off phone");

             void phonecall () {


                 System.out.println("macaing phone call");

             }
         } void send Text() {
             System.out.println("sending a text");

         }
     }
    public static void main(String[] args) {

         //Every instance that i create for the phone class there are separate copy these
           //variable and methods


        phone myphone= new phone();

        phone myphone2 =new phone();

        //phone one
        myphone.brand = "apple";

        System.out.println(myphone.brand);


        //static member of the class does't belong to any object/instance
        //rather it belong to class itself.we could change the assigned value as we want
        //without calling any instances
        //to change assigned values of the non-static member of class we need to craete instance
        // any by calling different instance we can change the value

        System.out.println( typeofphone);

        /*
        when should we declare static variable /methods vs when not to??
        Ans.static member we create if we want the value to be static /non -change

         */
    }