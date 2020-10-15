package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";

    public String sortOrderNumber(int orderNumber) {
        if(orderNumber % 3 == 0){
            return FIZZ;
        }
        return null;
    }
}
