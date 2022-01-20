// Расчет площади круга и длины его окружности

import java.util.Scanner;
public class Main {
    static final double pi = 3.14;

    public static void lenght(double r) { // метод вычисления длины окружности
        double lenght = 2 * pi * r;
        System.out.println("Длина окружности равна: " + lenght + " см");
    }

    public static void area(double r) { // метод вычисления площади круга
        double a = pi * r * r;
        System.out.println("Площадь круга равна: " + a + " кв.см");
        }

    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах: ");
        double r = load.nextDouble();
        area(r);
        lenght(r);
    }
}