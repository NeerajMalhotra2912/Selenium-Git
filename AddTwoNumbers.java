package One.VikasRanjit.oops;

public class AddTwoNumbers extends MethodExample {

    void addNumbers(){                                  // non-parameterised method
        int a = 10, b = 20, c = a +b;
        System.out.println("Addition is : " + c);
    }

    int addIntNumber(){                                 // non-parameterised method
        int a = 20, b = 20, c = a + b;
        return c;
    }

    void subtractTwoNumbers(int a, int b){              // parameterised method
        int c = a -b;
        int d = a +b;
        int e = a *b;
        System.out.println("Subtraction is : " + c +"   " + d +"   "+ e);
    }

    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addNumbers();
//        addTwoNumbers.addIntNumber();
        addTwoNumbers.subtractTwoNumbers(25,10);
//        addTwoNumbers.subtractTwoNumbers(45,40);
//        addTwoNumbers.subtractTwoNumbers(65,20);
//        addTwoNumbers.welcome();

    }

}


//Heridity