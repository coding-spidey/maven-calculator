package com.ion.app;

public class Calculator {
    Validator tradingHours;
    public Calculator(Validator tradingHours) {
        this.tradingHours = tradingHours;
    }
    public int sum(int number_one, int number_two) {
        if(!tradingHours.validate()) return 0;
        int sum = number_one+number_two;
        return (sum);
    }

    public int subtract(int number_one, int number_two) {
        int result = number_one - number_two;
        return result;
    }
}
