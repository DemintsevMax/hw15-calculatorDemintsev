package pro.sky.homework.calculatorDemintsev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    @GetMapping("calculator")
    public String welcom() {
        return " Добро пожаловать в калькулятор";
    }
}
