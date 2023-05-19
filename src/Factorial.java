import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int number;
        int Factorial = 1;
        System.out.print("Enter your number for Factorial: ");

        Scanner in =new Scanner(System.in);
        number = in.nextInt();

        if(number<0){
            System.out.println("please enter a greater than zero");
        }
        else{
            for(int i=1; i<=number; i++){
                Factorial = Factorial*i;
            }
            System.out.println("factorial is " + Factorial);
        }

        
        
    }

    
}
