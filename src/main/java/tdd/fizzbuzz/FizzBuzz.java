package tdd.fizzbuzz;

import static tdd.fizzbuzz.Constants.*;

public class FizzBuzz {
    public String sortOrderNumber(int orderNumber) {
        String message = "";

        if(isModuloBy(orderNumber, 3)){
            message += FIZZ;
        }

        if(isModuloBy(orderNumber, 5)){
            message += BUZZ;
        }

        if(isModuloBy(orderNumber, 7)){
            message += WHIZZ;
        }

        if(message.isEmpty()) {
            message = String.valueOf(orderNumber);
        }

        return message;
    }

    private boolean isModuloBy(int orderNumber, int x) {
        return orderNumber % x == 0;
    }
}
