package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/sqrt.csv")
    public void testLookingForSqrt(int limit1, int limit2) {
        SQRService service = new SQRService();
        int expected = 11;
        int actual;
        actual = service.calcSqrt(limit1, limit2);


        Assertions.assertEquals(expected, actual);
    }
}

