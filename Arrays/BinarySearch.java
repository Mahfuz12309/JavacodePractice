public class BinarySearch {
    public static int BinSearch(int number[], int key){
        int start =0, end=number.length;
        while(start<end){
            int mid = (start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(key>number[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key =100;
       
        System.out.println("Index for key is : "+ BinSearch(numbers,key));

    }
    
}
