
package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int result = service.calcSqrt(324, 784, 11);

        System.out.println(result);

    }
}