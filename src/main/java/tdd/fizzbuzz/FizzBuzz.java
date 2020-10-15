package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String sortOrderNumber(int orderNumber) {
        boolean isModulo3 = orderNumber % 3 == 0;
        boolean isModulo5 = orderNumber % 5 == 0;
        boolean isModulo7 = orderNumber % 7 == 0;

        if(isModulo3 && isModulo5 && isModulo7){
            return FIZZ+BUZZ+WHIZZ;
        }

        if(isModulo3 && isModulo5){
            return FIZZ.concat(BUZZ);
        }

        if(isModulo3 && isModulo7){
            return FIZZ.concat(WHIZZ);
        }

        if(isModulo5 && isModulo7){
            return BUZZ.concat(WHIZZ);
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

        return null;
    }
}
