import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string you want to reverse: ");

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String reverse = "";

        // reverse string
        for( int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }


        System.out.println("!gnirts desrever ruoy si ereH");
        System.out.println("Just kidding, here it is, for real: " + reverse);
    }
}
