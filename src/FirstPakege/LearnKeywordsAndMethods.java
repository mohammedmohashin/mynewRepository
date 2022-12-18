package FirstPakege;

public class LearnKeywordsAndMethods {

    //public -Everyone can see it.access it and use it.
    public static void myMethod(){
        System.out.println("hello everyone");
    }
}
//protected - can be accessed within the class and within the same package that you created

protected static void myProtected(){
    System.out.println("Hi this is protected method exemple");

}
 //private -private method can only be used within the class it was created in
  private static void myPrivate(){
      System.out.println("Hi this is private methode exmple");

  }
  /*
   // Default -declaring a method within any access modifire.
   it was the same characteristics of the protected access modifire
   it can be only accessed within the same class and same packege

   */
   static void myDefault(){
       System.out.println("this is a default method exmple");

   }
   //if we need to return something from a method we need provide the data type we want to return as
    public static int myvoidExample(){
       int x =5;
       int y =10;

       return x +y;

    }

    public static boolean mMethod2(){

       int x=20;
       int y =30;

       return x>y;

    }

       public static int  mIntMethod(){


       int x =100;
       int y =200;

       return x+y;

     }
        public static void mIntMethod(){


       int a =200;
       int b =100;

          System.out.println(a+b);

      }

    public static void main(String[] args) {

       int z =5+mIntMethod();

        System.out.println(z);

    }
      boolean myvalidation(){

       int i =500;
       int j =600;

       return i>j;

      }

