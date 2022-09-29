package MyDie;

import MyDie.MyDie;

public class TestMyDice {
    public static void main(String[] args) {

        MyDie firstDie = new MyDie();
        MyDie secondDie = new MyDie();


        System.out.println("Dice 1: "+ firstDie.getValue());
        System.out.println("Dice 2: "+ secondDie.getValue());
    }
}
