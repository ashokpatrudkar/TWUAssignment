import java.util.Scanner;

/**
 * Created by pashok on 7/15/17.
 */
public class TriangleExercise {

    static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public static void drawSingleAsterisk(){
        System.out.println("*");
    }

    public static void drawHorizontalLine(){
        System.out.println("\nEnter no of asterisk in a horizontal line ");
        int number = scanner.nextInt();
        for(int index=1; index<=number; index++){
            System.out.print("*");
        }
    }

    public static void drawVerticalLine(){
        System.out.println("\nEnter no of asterisk in a vertical line ");
        int number = scanner.nextInt();
        for(int index=1; index<=number; index++){
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(){
        System.out.println("\nEnter number ");
        int number = scanner.nextInt();
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawSingleAsterisk();
        drawHorizontalLine();
        drawVerticalLine();
        drawRightTriangle();
    }

}
