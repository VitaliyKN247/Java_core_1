package test;

public class Decorator {

    /**
     * красивый вывод результата
     * @param result результат арифмитеческих действий
     * @return оформленный вывод
     */
    public static String decorate (int result){
        return String.format("Number is: " + result);
    }
}
