package pro.sky.homework.calculatorDemintsev.service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.homework.calculatorDemintsev.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double plus(Double num1, Double num2) {
        return num1+num2;
    }

    @Override
    public Double minus(Double num1, Double num2) {
        return num1-num2;
    }

    @Override
    public Double multiply(Double num1, Double num2) {
        return num1*num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        return num1/num2;
    }
}
