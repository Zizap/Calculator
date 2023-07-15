import java.util.Scanner;

public class Main {

    static RomanNumeral[] values = RomanNumeral.values();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите арифметическое выражение, если хотите выйти введите \"Exit\": ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");

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

        return symbolSearch(resArabic);
    }

    static String symbolSearch(int num) throws Exception {
        String res = null;

        if (num > 0) {
            for (RomanNumeral value : values) {
                if (num == value.getArabicNumeral()){
                    res = value.getRomanNumeral();
                }
            }
        } else {
            throw new Exception("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
        }

        return res;
    }

    static int symbolSearch(String num) throws Exception {
        int res = 0;

        for (RomanNumeral value : values) {
            if (num.equals(value.getRomanNumeral())){
                res = value.getArabicNumeral();
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