package FirstPakege;

public class LearningMethods {

    //Method with parameter.

      static int myAddition(int number1, int number2){

          return number1+number2;

    }
       static int myAdd2(){

          int c =600;
          int d =600;

          return c+d;
       }

           static int myA3(){

              int e =700;
              int f =800;

              return e+f;

           }

           static int myNum(int number1, int number2){

            return number1+number2; //Return keyword needs to be the last line of code inside a method
               //Anything after the return keyword will not be executed or read by java.
              // System.out.println(number1);
               //System.out.println(number2);


           }

              //  Nested Method
               // Method #1

              public static int myMulti(){
               int a =5;
               int b =10;

               return a*b;

              }

              //Method #2
               public static int myMulti2(){

                return 5+myMulti();

               }
               //Method #3

               public static int myMulti3(){
                return 100+myMulti2();

                // in this method we want to do equation as 4*5+5+100+1000

                   public static int myMulti4(){

                       return 1000+myMulti3();


                   }
               }

               /*
                   it helps coders/users to understand what a method does.
                   it provides documentation that is easily viewable when hovering over a method invocation
                   @param a provide any integer value
                   @param b provide any integer value
                   @return a+b
                   */

                */
                   static int docstrExmple(int a,int b){

                    return a+b;
                   }

                   //Main method is the starting point for jvm to start execution of a java program

    public static void main(String[] args) {
        System.out.println(myMulti4());

        docstrExmple(500,600);

        myMethodEx2(500,500);


    }
    //Method
    static void methodExmple(){
        System.out.println("Hello");
    }

    /*

      this method calculatoin two number
       @param-num 1: an int number need to be added
       @param -num-2: int number needs to be added
       @return num 1+num 2;
       */

       public static int methodEx2(int num1,int num2){

           return num1+num2;

       }
}



