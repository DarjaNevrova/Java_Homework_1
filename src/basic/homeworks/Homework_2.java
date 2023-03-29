package basic.homeworks;

import java.util.Scanner;

public class Homework_2 {

    public static void main(String[] args) {
        //TASK_1
        Scanner sc = new Scanner(System.in);
        System.out.println(twoWords(sc));
        //TASK_2
        System.out.println(addition(2, 2));
        System.out.println(subtraction(10, 2));
        System.out.println(multiplication(10, 2));
        System.out.println(division(20, 7));
        //TASK_3
        System.out.println(usdToEur(500, 0.923));
        //TASK_4 *
        pizzaCaloriesDifference();
        //TASK_4_MY *
        System.out.println(pizzaCaloriesDifference_2(24, 28));

    }

    //TASK_1
    public static String twoWords(Scanner sc) {
        System.out.println("Enter first word");
        String firstWord = sc.nextLine();
        System.out.println("Enter second word");
        String secondWord = sc.nextLine();
        return firstWord.substring(0, firstWord.length() / 2)
                + secondWord.substring(secondWord.length() / 2);
    }

    //TASK_2
    public static int addition(int a, int b) {
        return (a + b);
    }

    public static int subtraction(int a, int b) {
        return (a - b);
    }

    public static int multiplication(int a, int b) {
        return (a * b);
    }

    public static double division(int a, int b) {
        return ((double) a / b);
    }

    //TASK_3
    public static double usdToEur(double usd, double exchangeCourse) {
        return (usd * exchangeCourse);
    }

    //TASK_4 *
    public static void pizzaCaloriesDifference() {

        double firstPizzaArea = (24 / 2) * (24 / 2) * 3.14;
        double secondPizzaArea = (28 / 2) * (28 / 2) * 3.14;
        double resultCalories = (secondPizzaArea - firstPizzaArea) * 40;
        System.out.println(resultCalories);
    }


    //TASK_4_MY *
    public static double pizzaCaloriesDifference_2(double diameterOne, double diameterTwo) {

        double firstPizzaArea = (diameterOne / 2) * (diameterOne / 2) * 3.14;
        double secondPizzaArea = (diameterTwo / 2) * (diameterTwo / 2) * 3.14;
        return (secondPizzaArea - firstPizzaArea) * 40;
    }
}
