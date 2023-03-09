import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int partOf = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter percentage:");
        isNumber(input);
        partOf = input.nextInt();
        System.out.println("Enter number:");
        isNumber(input);
        int number = input.nextInt();
        int hundred = 100;
        final float form = (float)partOf/hundred * number;
        System.out.println(partOf + "%" + " of " + number + " = " + (int)form);
        //System.out.println(form);
    }

    private static void isNumber(Scanner input) {
        while(!input.hasNextInt() || !input.hasNextDouble())
        {
            System.out.println("Enter Valid number!!");
            //reads input until it sees a " "
            input.next();

        }
    }
}