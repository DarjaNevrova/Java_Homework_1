package basic.homeworks;

import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) {
        checkFigure("triangle");
        checkFigure("circle");
        checkFigure("rectangle");
    }
        private static void checkFigure(String shape) {
            Scanner scanner = new Scanner(System.in);
            String figure = shape.toLowerCase();
            switch (figure) {
                case "triangle" -> triangleSquare(scanner);
                case "circle" -> circleSquare(scanner);
                case "rectangle" -> rectangleSquare(scanner);
            }
        }

        private static void triangleSquare(Scanner scanner) {
            System.out.println("Вы выбрали треугольник.");
            System.out.println("Введите размер стороны А:");
            double a = scanner.nextDouble();
            System.out.println("Введите размер стороны B:");
            double b = scanner.nextDouble();
            System.out.println("Введите размер стороны C:");
            double c = scanner.nextDouble();

            double halfP = (a + b + c) / 2;

            double square = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
            System.out.printf("Площадь треугольника равна %f\n",  square);
        }

        private static void circleSquare(Scanner scanner) {
            System.out.println("Вы выбрали треугольник.");
            System.out.println("Введите радиус:");
            double r = scanner.nextDouble();

            double square = Math.PI * r * r;

            System.out.printf("Площадь круга с радиусом %f равна %f\n", r, square);
        }

        private static void rectangleSquare(Scanner scanner) {
            System.out.println("Вы выбрали треугольник.");
            System.out.println("Введите размер стороны А:");
            double a = scanner.nextDouble();
            System.out.println("Введите размер стороны B:");
            double b = scanner.nextDouble();

            double square = a * b;

            System.out.printf("Площадь прямоугольника равна %f\n", square);
        }
    }
