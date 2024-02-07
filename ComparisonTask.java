package HomeTask;

public class ComparisonTask {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 6;
        boolean result = number1 > number2;
        System.out.println(result);
        int number3 = 5;
        int number4 = 5;
        boolean result2 = number3 >= number4;
        System.out.println(result2);
        int number5 = 20;
        int number6 = 10;
        boolean result3 = number5 < number6;
        System.out.println(result3);
        int number7 = 35;
        int number8 = 50;
        boolean result4 = number7 <= number8;
        System.out.println(result4);
        int number9 = 25;
        int number10 = 25;
        boolean result5 = number9 == number10;
        System.out.println(result5);
        int number11 = 50;
        int number12 = 50;
        boolean result6 = number11 != number12;
        System.out.println(result6);
        String city1 = "city";
        String city2 = "-city";
        boolean result7 = city1 == city2;
        System.out.println(result7);
        String city3 = "City";
        String city4 = "citY";
        boolean result8 = city3.equalsIgnoreCase(city4);
        System.out.println(result8);

    }
}
