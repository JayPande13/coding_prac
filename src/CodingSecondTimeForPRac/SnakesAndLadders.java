package CodingSecondTimeForPRac;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class SnakesAndLadders {
    static int currentIndex = 0;
    static int increment;

    static HashMap<Integer,Integer> snakes = new HashMap<>();
    static HashMap<Integer,Integer> ladders = new HashMap<>();
    public static void main(String[] args) {
        snakes.put(98,2);
        ladders.put(67,97);
        Scanner sc = new Scanner(System.in);
        while(currentIndex < 100) {
            System.out.println("Press 'x' to Roll Dice");
            String input = sc.next();
            if (input.equals("x")) {
                    increment = rollDice();
                    System.out.println(increment + " aaya hai madarchod");
                    int newIndex = currentIndex + increment;
                    if (newIndex < 100) {
                        currentIndex = newIndex;
                        System.out.println("You are Progressing : " +  currentIndex);
                        if (snakes.containsKey(currentIndex)) {
                            System.out.println("Bit By a Snake Go to index : " + snakes.get(currentIndex));
                            currentIndex = snakes.get(currentIndex);
                        }
                        if (ladders.containsKey(currentIndex)) {
                            System.out.println("You got lucky, Climb up the Ladder : " + ladders.get(currentIndex));
                            currentIndex = ladders.get(currentIndex);
                        }
                    }else if(Objects.equals(newIndex,100)){
                        System.out.println("You WON!!!!");
                    }
                    else {
                        System.out.println("Roll Dice Again");
                    }
            }
        }
    }

    private static int rollDice(){
        Random random =  new Random();
        int generatedDice = random.nextInt(7);
        return generatedDice == 0? generatedDice+1 : generatedDice;
    }



}
