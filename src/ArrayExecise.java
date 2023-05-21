public class ArrayExecise {
    
    public static void main(String args[]) {

        //declare int Array
        int[] exerciseArray = {3,1, 4,2,7,3,5,22,33,66};

        // print array elment
        for (int i = 0; i<exerciseArray.length; i++){
            System.out.println(exerciseArray[i]);
        }
        //find largest number
         int largest = exerciseArray[0];
         for(int i=1; i<exerciseArray.length; i++){
            if(exerciseArray[i] > largest){
                largest = exerciseArray[i];
            }
         }
         System.out.println("Largest element in Array: " + largest);


        //smallest element in Array
        int smallest = exerciseArray[0];
        for(int i = 1; i<exerciseArray.length; i++){
            if(exerciseArray[i] < smallest){
                smallest = exerciseArray[i];

            }
        }
        System.out.println("smallest element in Array: " + smallest);


        //sum up all element

        int sum = 0;
        for(int i=0; i<exerciseArray.length; i++){
            sum = sum + exerciseArray[i];
        }
        System.out.println(sum);





        
    }
}
