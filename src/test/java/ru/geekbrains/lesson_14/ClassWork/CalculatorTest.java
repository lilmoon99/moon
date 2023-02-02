package ru.geekbrains.lesson_14.ClassWork;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

//    @CsvSource(value = {
//            "5,7,12",
//            "2,6,7",
//            "20,10,30",
//            "50,14,64"
//    })
    //TODO 2:17:00
    @CsvFileSource(files = {"tests/test_data.csv"})
//    @MethodSource("testDataGenerator")
    @ParameterizedTest
    @Disabled
    void massAddTest(int a,int b,int result){
        Assertions.assertEquals(result,calculator.add(a,b));
    }

    static Stream<Arguments> testDataGenerator(){
        List<Arguments> list = new ArrayList<>(100_000);
        for (int i = 0; i < 100_000; i++) {
            int a = (int)(Math.random() * 100_000);
            int b = (int)(Math.random() * 100_000);
            int result = a+b;
            list.add(Arguments.arguments(a,b,result));
        }
        return list.stream();
    }
    @BeforeAll
    static void initAll(){
        System.out.println("All");
    }

    @BeforeEach
    void initEach(){
        calculator = new Calculator();
        System.out.println("Before each");
    }

    @Test
    void add() {

        int a = 14;
        int b = 4;
        int result = 18;
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    @Test
    void sub() {

        int a = 14;
        int b = 4;
        int result = 10;
        Assertions.assertEquals(result, calculator.sub(a, b));
    }

    @Test
    void mul() {

        int a = 14;
        int b = 4;
        int result = 56;
        Assertions.assertEquals(result, calculator.mul(a, b));
    }

    @Test
    void div() {

        int a = 16;
        int b = 4;
        int result = 4;
        Assertions.assertEquals(result, calculator.div(a, b));
    }
    @AfterEach
    void closeEach(){
        System.out.println("After each");
    }
    @AfterAll
    static void closeAll(){
        System.out.println("Final close");
    }
}