package MyDie;

import java.util.Random;

public class MyDie {

    //Attribut

    private int value;

    // Getter Setter

    public void setValue(int diceValue) {
        this.value = diceValue;
    }

    public int getValue() {
        return value;
    }

    // Roll metode

    public void roll() {
        Random rand = new Random();
        value  = rand.nextInt(6) + 1;
       // System.out.println("k"+value);
    }

    // Kontruktør

    public MyDie() {
        roll();
    }

    }





