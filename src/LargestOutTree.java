// find the Largest out of 3 numbers

import java.util.Scanner;

public class LargestOutTree {
    public static void main( String args[]) {
        int numOne , numTwo, numThree;
        System.out.println("please enter three numbers");
        Scanner in = new Scanner(System.in);
        numOne = in .nextInt();
        numTwo = in .nextInt();
        numThree = in .nextInt();

        if (numOne> numTwo && numOne>numThree){
            System.out.println(numOne +"numOne is gteater");
        }
        if (numTwo> numTwo && numTwo>numThree){
            System.out.println(numTwo +"numTwo is gteater");
        }
        if (numThree> numOne && numThree>numTwo){
            System.out.println(numThree +"numThree is gteater");
        }
        else{
            System.out.println("all numbers  are equil");
        }
        
    }
    
}
