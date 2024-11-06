 

public class binaryOperator {
    public static void main(String[] args) {
        //binary and
        // normal adding result should be 11 but as we are performing binary and so the result is changing on the bit level
        
        System.out.println(5&6);

        // binary Or
        System.out.println(5|6);

        // binary xor
        System.out.println(5^6);

        // binary One's Complement
        // by the one's complement we get the change one to zero and zero to one 
        // by plusing one to the one's complement we get the negative value of a number
        System.out.println(~0+1);
        // binary left shift
        // a<<b == a*2^b to check the value
        // 
        System.out.println(5<<2);
        // binary right shift
        // a>>b = a / 2^b to check the value
        System.out.println(6>>1);
    }
}
