package com.company;

public class Figure {
    private String num = "";

    public Figure(String num) {
        this.num = num;
    }

    public static boolean isNumeric(String str) {
        try {
            int intValue = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isArabic(String[] array) throws IncorrectExpressionException {
        int countOfArabic = 0;
        for (String s : array) {
            if (isNumeric(s)) {
                countOfArabic++;
            }
        }
        if (countOfArabic < array.length && countOfArabic != 0) {
            throw new IncorrectExpressionException("разные форматы чисел");
        }
        return countOfArabic == array.length;
    }

    public static double calculationsArab(String sign, String[] num) {
        double result = 0;
        switch (sign) {
            case ("/"):
                result = Double.parseDouble(num[0]) / Double.parseDouble(num[1]);
                break;
            case ("*"):
                result = Double.parseDouble(num[0]) * Double.parseDouble(num[1]);
                break;
            case ("+"):
                result = Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
                break;
            case ("-"):
                result = Double.parseDouble(num[0]) - Double.parseDouble(num[1]);
                break;
        }
        return result;
    }

   /* public static String calculationsRoman(String sign, String[] num){
        String result="";

        switch (sign){
            case ("/"):

                break;
            case ("*"):

                break;
            case ("+"):

                break;
            case ("-"):

                break;
        }
        return result;
    }


    */
}