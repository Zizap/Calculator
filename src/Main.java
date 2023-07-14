import java.util.Scanner;

public class Main {

    static RomanNumeral[] values = RomanNumeral.values();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String input = scanner.nextLine();
        String[] parts;

        parts = input.split(" ");

        if (parts.length != 3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        String operand1 = parts[0];
        String operator = parts[1];
        String operand2 = parts[2];

        try {
            System.out.println(
                    "Результат: " + arabicCalc(Integer.parseInt(operand1),Integer.parseInt(operand2),operator)
            );
        } catch (NumberFormatException e) {
            System.out.println(
                    "Результат: " + romanCalc(operand1,operand2,operator)
            );
        }
    }

    static int arabicCalc(int num1,int num2,String operator) throws Exception {
        if (num1 > 10 || num2 > 10){
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Exception("Неподдерживаемая операция");
        };
    }

    static String romanCalc(String num1,String num2,String operator) throws Exception {

        int number1 = symbolSearch(num1);
        int number2 = symbolSearch(num2);

        int resArabic = arabicCalc(number1,number2,operator);

        String resRoman = null;

        if (resArabic > 0) {
            for (RomanNumeral value : values) {
                if (resArabic == value.arabicNumeral){
                    resRoman = value.romanNumeral;
                    System.out.println(value.romanNumeral);
                }
            }
        } else {
            throw new Exception("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
        }

        return resRoman;
    }

    static int symbolSearch(String num) throws Exception {
        int res = 0;

        for (RomanNumeral value : values) {
            if (num.equals(value.romanNumeral)){
                res = value.arabicNumeral;
                break;
            }
        }

        if (res == 0){
            throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        } else {
            return res;
        }

    }

}