public class shortestPath {
    public static void shortestPath(String a)
    {
        int x=0,y=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='E'){
                x+=1;
            }
            if(a.charAt(i)=='W'){
                x-=1;
            }
            if(a.charAt(i)=='N'){
                y+=1;
            }
            if(a.charAt(i)=='S'){
                y-=1;
            }
        }
        float shortpath = (float)Math.sqrt((x*x)+(y*y));
        System.out.println("Shortest path: "+shortpath);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        shortestPath(path);
    }
    
}
