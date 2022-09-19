
package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int expected = 11;
        int result = service.calcSqrt(324, 784);

        System.out.println(result);

    }
}