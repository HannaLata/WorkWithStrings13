package com.mainacad.service;

public class NumberManipulationService {

    public static int getSumByDivision(int number) { // 12345
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }

        return result;
    }

    public static Integer getSumByTypeManipulation(int number) { // 12345
        Integer result = 0;
        String numberAsString = String.valueOf(number);


        char[] symbols = numberAsString.toCharArray();

        for (char symbol : symbols) {

            result += Character.getNumericValue(symbol);
        }
        return result;
    }



}




