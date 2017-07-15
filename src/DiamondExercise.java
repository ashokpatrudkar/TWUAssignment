import java.util.Scanner;

/**
 * Created by pashok on 7/15/17.
 */
public class DiamondExercise {

    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void printIsoscelesTriangle(){
        System.out.println("Enter number");
        int n = scanner.nextInt();
        int space = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n*2-space;j++){
                if(j>space)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space--;
        }
    }

    public static void printDiamond(){
        System.out.println("Enter number");
        int n = scanner.nextInt();
        int space = n-1;

        for(int i=1;i<=n*2;i++){
            for(int j=1;j<n*2-space;j++){
                if(j>space)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(i<n)
                space--;
            else if(i==n)
                    space = 1;
                else
                    space++;
        }

    }

    public static void printDiamondWithName() {
        System.out.println("Enter number");
        int n = scanner.nextInt();
        System.out.println("Enter your name");
        String name = scanner.next();
        int space = n - 1;

        for(int i=1;i<=n*2;i++){

            if (i==n){
                space = 1;
                System.out.println(name);
                continue;
            }

            for(int j=1;j<n*2-space;j++){
                if(j>space)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(i<n)
                space--;
            else
                space++;
        }
    }

    public static void main(String[] args) {
        printIsoscelesTriangle();
        printDiamond();
        printDiamondWithName();
    }
}
