import java.util.Scanner;

public class AddtwoNumbers {
    public static void main(String args[]){
        int myFirstNum;
        int mySecNum;
        int result;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        myFirstNum = in.nextInt();

        System.out.print("Enter num 2: ");
        mySecNum = in.nextInt();

        System.out.print("your added value is: ");
        result = myFirstNum + mySecNum;

        System.out.println(result);
    }
}
