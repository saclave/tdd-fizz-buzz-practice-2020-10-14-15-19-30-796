package tdd.fizzbuzz;

import static tdd.fizzbuzz.Constants.*;

public class FizzBuzz {
    public String sortOrderNumber(int orderNumber) {
        boolean isModulo3 = orderNumber % 3 == 0;
        boolean isModulo5 = orderNumber % 5 == 0;
        boolean isModulo7 = orderNumber % 7 == 0;

        if(isModulo3 && isModulo5 && isModulo7){
            return FIZZ_BUZZ_WHIZZ;
        }

        if(isModulo3 && isModulo5){
            return FIZZ_BUZZ;
        }

        if(isModulo3 && isModulo7){
            return FIZZ_WHIZZ;
        }

        if(isModulo5 && isModulo7){
            return BUZZ_WHIZZ;
        }

        if(isModulo3){
            return FIZZ;
        }

        if(isModulo5){
            return BUZZ;
        }

        if(isModulo7){
            return WHIZZ;
        }

        return String.valueOf(orderNumber);
    }
}
