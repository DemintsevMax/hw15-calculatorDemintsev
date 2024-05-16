package pro.sky.homework.calculatorDemintsev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework.calculatorDemintsev.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return " Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public String plus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1, num2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + "-" + num2 + "=" + calculatorService.minus(num1, num2);
    }
    @GetMapping("multiply")
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1, num2);
    }
    @GetMapping("divide")
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2);
    }


}