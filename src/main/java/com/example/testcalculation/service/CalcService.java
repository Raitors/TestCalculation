package com.example.testcalculation.service;

import com.example.testcalculation.exceptions.DivisionByZeroExcepton;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroExcepton();
        }
        return a / b;
    }
}
