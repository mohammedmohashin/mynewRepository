package src.FirstPakege.objectorientedprograming.inheritance;

import static java.lang.System.*;

public class TestMain {
    public static void main(String[] args) {

        //when we are inheriting from the parent class to child class,
        //As soon as we create an object for the child class we are also
        //creating an object  for parent class

           TunaFoodChild myTuna= new TunaFoodChild(true, 5,10,"Tuna");

          out.println(myTuna.isItfrozen);
          out.println(myTune.weight);
          out.println(myTune.size);
          out.println(myTuna.isItfrozen);

        myTuna.eatingMyTuna();




    }
}
