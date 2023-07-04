package com.example.testcalculation.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatonServiceTest {
CalcService calcService = new CalcService();
 static Stream<Arguments> dataForPlus(){
     return  Stream.of(
             Arguments.of(2,6,8),
             Arguments.of(200,6,206),
             Arguments.of(-444,4,-440),
             Arguments.of(-111,-11,-122)
     );
 }
@ParameterizedTest
    @MethodSource("dataForPlus")
    void plus(int n1, int n2, int expected){
     assertEquals(expected, calcService.plus(n1,n2));
}
    static Stream<Arguments> data(){
        return  Stream.of(
                Arguments.of(2,6),
                Arguments.of(200,6),
                Arguments.of(-444,4),
                Arguments.of(-111,-11)
        );
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int n1, int n2){
     int expected=n1-n2;
        assertEquals(expected, calcService.minus(n1,n2));
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int n1, int n2){
        int expected=n1*n2;
        assertEquals(expected, calcService.multiply(n1,n2));
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int n1, int n2){
        int expected=n1/n2;
        assertEquals(expected, calcService.divide(n1,n2));
    }
}
