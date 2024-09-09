/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Elliott Lam
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        // adding two integers
        int sumTwo = add(4,10);
        System.out.println("The sum of 4 and 10: " + sumTwo);

        // adding four integers
        int sumFour = add(4,10,9,12);
        System.out.println("The sum of 4, 10, 9, and 12: " + sumFour);

        // morning greeting
        String morningGreet = morningGreeting("Elliott");
        System.out.println(morningGreet);

        // afternoon greeting
        String afternoonGreet = afternoonGreeting("Elliott");
        System.out.println(afternoonGreet);

        // tripling a string
        String tripled = triple("Triple me! ");
        System.out.println(tripled);

        // halving an integer
        double halved = half(8);
        System.out.println("Half of 8: " + halved);

        // rounding a positive value to the nearest integer
        int roundedPositive = roundPositiveValueToNearestInteger(8.49);
       System.out.println("Rounded 8.49: " + roundedPositive);

        // rounding a negative value to the nearest integer
        int roundedNegative = roundNegativeValueToNearestInteger(-8.51);
        System.out.println("Rounded -8.51: " + roundedNegative);

    }

    // 1. adding two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. adding four integers
    public static int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }

    // 3. morning greeting
    public static String morningGreeting(String name) {
        return "Good morning, " + name + "!";
    }

    // 4. afternoon greeting
    public static String afternoonGreeting(String name) {
        return "Good afternoon, " + name + "!";
    }

    // 5. tripling a string
    public static String triple(String input) {
        return input + input + input;
    }

    // 6. halving an integer
    public static double half(int value) {
        return value / 2.0;
    }

    // 7. rounding a positive value to the nearest integer
    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) Math.round(a);
    }

    // 8. rounding a negative value to the nearest integer
    public static int roundNegativeValueToNearestInteger(double b) {
        return (int) Math.round(b);
    }

}
