package ru.test.skyprofirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler {
    public final ServiceCalculator serviceCalculator;
    public CalculatorControler(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            return serviceCalculator.plusCalculator(a, b);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return serviceCalculator.minusCalculator(a,b);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return serviceCalculator.multiplyCalculator(a, b);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return serviceCalculator.divideCalculator(a, b);
    }
}
