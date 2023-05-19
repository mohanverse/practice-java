import java.util.Scanner;

public class FahrenheitTocelSius {

    //Fahrenheit To celSius
    // public static void main(String args[]) {
    //     int temp;
    //     Scanner in = new Scanner(System.in);

    //     System.out.println("enter temp is F: ");

    //     temp = in.nextInt();

    //     temp = ((temp- 32)*5)/9;
    //     System.out.println(temp);
        
    // }


    //Celcius to Farenheit

    public static void main(String args[]) {
            int temp;
            Scanner in = new Scanner(System.in);
    
            System.out.println("enter temp is C: ");

            temp = in.nextInt();

            temp = ((temp*9)/5) +32;
            System.out.println(temp);
    }
}
