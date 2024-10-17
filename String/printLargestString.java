public class printLargestString {
    //lexicographic comparision 
    //in build function is str1.compareTo(str2)
    // if the inbuit function output is 0 than they are equal
    // if the output is greater than zero than the str1 in bigger
    // the str1 will be smaller if the output is smaller than zero;
    // compareToignore used for ignoring the capital and the smaller;
    public static void main(String[] args) {
        String fruit[]={"mango", "apple","banana"};
        String largest = fruit[0];
        for(int i= 0;i<fruit.length;i++)
        {
            if(fruit[i].compareToIgnoreCase(largest)>0){
                largest =fruit[i];
            }
        }
        System.out.println(largest);
    }

}
