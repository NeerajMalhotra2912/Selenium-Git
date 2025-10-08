package One.VikasRanjit.oops;

public class StaticKeyword {
    static int a = 10;             // Global variable
    StaticKeyword(){
        System.out.println("A inside constrcutor is : " + a);
    }
    static void addTwoNumber(){
        int a = 100;
        int b = 150, c = a + b;
        System.out.println("Addition is : " + c);
    }
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.addTwoNumber();
        addTwoNumber();
        System.out.println("A is : " + a);
    }
}
