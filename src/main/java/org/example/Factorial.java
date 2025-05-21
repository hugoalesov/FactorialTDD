package org.example;

public class Factorial {
    int result = 1;
    public static final int MIN_SAFE_VALUE = 0;
    public static final int MAX_SAFE_VALUE = 12;

    public int compute(int value) {
        if(value < MIN_SAFE_VALUE){
            throw new NegativeValueException("El valor es negativo" + value);
        }
        if(value > MAX_SAFE_VALUE){
            throw new ExceededValueException("El valor es demasiado grande" + value);
        }else{
            for(int i = 2; i <= value; i++){
                result = result * i;
            }
        }

        return result;
    }
}
