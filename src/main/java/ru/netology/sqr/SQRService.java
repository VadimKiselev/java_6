package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int limit1, int limit2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int num = i * i;
            if (num >= limit1 && num <= limit2) {
                count++;
            }
        }
        return count;
    }
}
