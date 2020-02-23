import java.util.Scanner;

public class MyClass {
    public static void main(String[] $args){
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int i = 1;
        String template =  "Summ %,.2f + %,.2f = %,.2f";
        try {
            userInput(i++);
            num1 = input.nextDouble();
            userInput(i);
            num2 = input.nextDouble();
            System.out.printf(template, num1, num2, num1+num2);
        } catch(Exception e) {
            System.out.println("Wrong number " + e.getMessage());
        }
    }

    /**
     * Format of user input.
     * @param  num int
     */
    private static void userInput(int num){
        System.out.printf("Please, enter num%d: ", num);
    }
}
