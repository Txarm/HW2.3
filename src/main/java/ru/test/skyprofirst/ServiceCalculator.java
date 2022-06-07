package ru.test.skyprofirst;

import org.springframework.stereotype.Service;


@Service
public class ServiceCalculator {
    public String checkNull(int a, int b) {
        if (a == Integer.parseInt(null)) {
            return "ERROR";
        } else if (b == Integer.parseInt(null)) {
            return "ERROR";
        }
        return "OK";
    }

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator(int a, int b) {
            int c = a + b;
            return a + " + " + b + " = " + c;

    }

    public String minusCalculator(int a, int b) {
            int c = a - b;
            return a + " - " + b + " = " + c;
        }
    public String multiplyCalculator(int a, int b) {
            int c = a * b;
            return a + " * " + b + " = " + c;
        }
    public String divideCalculator(int a, int b) {
        if (b == 0) {
            return "Нельзя делить на 0";
        } else {
            int c = a / b;
            return a + " / " + b + " = " + c;
        }
    }
}
