import java.util.Scanner;
/**
 * Created by pashok on 7/15/17.
 */
public class PrimeFactorExercise {

    public static void printPrimeFactors(int number){
         for(int i=1;i<=number;i++){
             if(isPrimeFactor(i) && number%i==0)
                 System.out.println(i);
         }
    }

    private static boolean isPrimeFactor(int number){
        if(number<=1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPrimeFactors(number);
    }
}
