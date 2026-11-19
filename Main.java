/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Shi Qi
*****************************************************************************************************
*/

public class Main {
    public static void main(String[] args) {
        int methodOne = add(5,7);
        System.out.println(methodOne);
        int methodTwo = add (5,7,6,6);
        System.out.println(methodTwo);
        String methodThree = morningGreeting("Toby Fox");
        System.out.println(methodThree);
        String methodFour = afternoonGreeting("Mac Miller");
        System.out.println(methodFour);
        String text = "oohbaby";
        String methodFive = triple(text);
        System.out.println(methodFive);
        double methodSix = half(19);
        System.out.println(methodSix);
        int methodSevenOne = roundPositiveValueToNearestInteger(8.5);
        int methodSevenTwo = roundPositiveValueToNearestInteger(8.49);
        System.out.println(methodSevenOne);
        System.out.println(methodSevenTwo);
        int methodEightOne = roundNegativeValueToNearestInteger(-8.5);
        int methodEightTwo = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(methodEightOne);
        System.out.println(methodEightTwo);
    }

    // 1. add
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    // 2. add
    public static int add(int num1, int num2, int num3, int num4){
        return add(add(num1,num2), add(num3, num4));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting (String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple (String text){
        return ( text + text + text);
    }

    // 6. half
    public static double half (int num1){
        return num1 / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger(double num1) {
       return (int) (num1 + 0.5);
        }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num1) {
        return (int) (num1 - 0.5);
    }

}
