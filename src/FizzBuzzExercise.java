import java.util.Scanner;

/**
 * Created by pashok on 7/15/17.
 */
public class FizzBuzzExercise {

    public static void printFizzBuzz(){
        for(int number=1; number<=100; number++){
            if(number%3==0 && number%5==0)
                System.out.println("FizzBuzz");
            else {
                if(number%3==0)
                    System.out.println("Fizz");
                else {
                    if(number%5==0)
                        System.out.println("Buzz");
                    else
                        System.out.println(number);
                }
            }
        }
    }

    public static void main(String[] args) {
        printFizzBuzz();

    }
}
