package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String sortOrderNumber(int orderNumber) {
        if(orderNumber % 3 == 0){
            return FIZZ;
        }

        if(orderNumber % 3 == 0){
            return BUZZ;
        }
        return null;
    }
}
