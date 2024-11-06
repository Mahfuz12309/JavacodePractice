public class Opps {
    public static void main(String[] args) {
        pen p1= new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Mahfuzur Rahman";
        myAcc.setPassword("abcdefgdxd");
        

    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
    public void getPassword(String pwd)
    {
        password = pwd;
    }
}
// getter and setter 
class pen{
    private String color;
    private int tip;
    String getColor()
    {
        return this.color;
    }
    int getTip()
    {
        return this.tip;

    }
    void setColor(String newColor){
        this.color=newColor;

    }
    void setTip(int newTip)
    {
       this.tip=  newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

}