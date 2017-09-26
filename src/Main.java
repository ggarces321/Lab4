import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int timmyApples = 3;
        int userApples;
        int totalApples;

        System.out.println("Timmy has 3 apples. How many do you have?");
        userApples = scnr.nextInt();
        totalApples = timmyApples + userApples;
        System.out.println("Together you have " + totalApples + " apples!");

    }

}
