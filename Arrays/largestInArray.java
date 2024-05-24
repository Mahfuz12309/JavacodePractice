public class largestInArray {
    public static int GetLarge(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            if(largest<numbers[i])
            {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1 ,2 ,3,4,5,6,7,8,9};
        System.out.println("Largest value in the array is : "+GetLarge(number));
    }
    
}
