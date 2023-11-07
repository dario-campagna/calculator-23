package sdm.calculator;

public class Calculator {

    public int compute(String...args) {
        if (args.length == 1){
            return Integer.parseInt(args[0]);
        }
        return Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
    }
    
}
