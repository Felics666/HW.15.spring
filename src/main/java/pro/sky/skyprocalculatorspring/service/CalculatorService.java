package pro.sky.skyprocalculatorspring.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Float plus(Float num1, Float num2) {
        return num1 + num2;
    }

    public Float minus(Float num1, Float num2) {
        return num1 - num2;
    }

    public Float multiply(Float num1, Float num2) {
        return num1 * num2;
    }

    public Float divide(Float num1, Float num2) {
        return num1 / num2;
    }
}
