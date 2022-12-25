package src.FirstPakege.objectorientedprograming.inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        // int x = 10;

        //type //reference //instance
        Brand br = new Bread();
        Apples a = new Apples();

        //because the instance new Food() doesnot have any knowledge of salmon data type
        //salmon s2 = new Food();

        //we' are buying a new bread
        //these are coming parent class

        br.name ="wonder";
        br.size =12;
        br.weight =500;

        //This is coming from child class
        br.madeBy = "HomeMade";

        //we are buying apples from store
        //these are coming parent class
        a.name ="Red Apples";
        a.size =4;
        a.weight =1000;

        //this is coming from child class
        a.isRed =true;
        a.drinkingjuiceOfApple();

    }
}
