public class subString {
    public static String subsString(String str, int si,int ei)
    {
        String substr = "";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.err.println(s.substring(0, 5));
        System.err.println(subsString(s, 0, 5));
        
    }
    
}
