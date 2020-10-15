package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String sortOrderNumber(int orderNumber) {
        boolean isModulo3 = orderNumber % 3 == 0;
        boolean isModulo5 = orderNumber % 5 == 0;
        boolean isModulo7 = orderNumber % 7 == 0;

        if(isModulo3){
            return FIZZ;
        }

        if(isModulo5){
            return BUZZ;
        }

        if(orderNumber % 7 == 0){
            return WHIZZ;
        }

        return null;
    }
}
