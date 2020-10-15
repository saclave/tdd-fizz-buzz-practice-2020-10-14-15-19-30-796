package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String sortOrderNumber(int orderNumber) {
        if(orderNumber % 3 == 0){
            return FIZZ;
        }

        if(orderNumber % 5 == 0){
            return BUZZ;
        }

        if(orderNumber % 7 == 0){
            return WHIZZ;
        }

        return null;
    }
}
