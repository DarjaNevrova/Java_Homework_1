package basic.homeworks;

import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args){
        //Task 1
        int a = 54;
        int b = 16;
        System.out.println(a + b);

        //Task 2
        int c = 50;
        int d = 3;
        System.out.println(c / d);

        //Task 3
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);

        //Task 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите переменную");
        int n = scanner.nextInt();
        System.out.println(n * n);

        //Task 5
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int var5 = 4;
        int var6 = 5;
        int var7 = 6;
        int var8 = 7;
        int var9 = 8;
        int var10 = 9;

        int sum = var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
        double average = (double)sum / 10.0;

        System.out.println("Среднее значение: " + average);

        //Task 6
        int priceA = 1000;
        int priceB = 500;
        int totalPrice = priceA + priceB;
        int discount = 100;
        double discountPercentage = ((double) discount / totalPrice) * 100;
        System.out.println("Скидка выходит " + discountPercentage + "% от исходной стоимости.");
    }
}