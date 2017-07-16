import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by pashok on 7/15/17.
 */
public class PrimeFactorExercise {

    public static void printPrimeFactors(int number){
        Set primeFactors = new HashSet();

        while(number%2==0){
            primeFactors.add(2);
            number/=2;
        }

        for(int i=3;i<=(int)Math.sqrt(number);i+=2){
            while (number%i==0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        if (number>2)
            primeFactors.add(number);
        System.out.println("Prime factors are : "+primeFactors);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        printPrimeFactors(number);
    }
}
