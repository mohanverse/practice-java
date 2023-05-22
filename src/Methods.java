public class Methods {
    public static void main(String args[]) {
        System.out.println("hello shubham");
        sayHello();

        
    }
    public static void sayHello() {
        System.out.println("Hello world");
        System.out.println("How are you");

        int numberOne = 7;
        int numberTwo = 5;

        int result = minimumNumber(numberOne, numberTwo);

        System.out.println(result);

        
    }
    public static int minimumNumber(int num1, int num2){
        int min;
         if(num1 > num2){
            min = num2;
         }else{
            min = num1;
         }

         return min;
    }
    
}
