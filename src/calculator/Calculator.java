package calculator;

import java.util.Stack;

public class Calculator {
    public static String ExpressionToPostfixNotation(String expression) {
        String current = "";
        char prev = '\0';
        Stack<Character> stack = new Stack<>();
        int priority;

        for (int i = 0; i < expression.length(); i++) {
            priority = getPriority(expression.charAt(i));

            if (priority == 0) current += expression.charAt(i);
            if (priority == 1) stack.push(expression.charAt(i));
            if (priority == -1) {
                current += ' ';
                while (getPriority(stack.peek()) != 1) current += stack.pop();
                stack.pop();
            }
            if (priority > 1) {
                current += ' ';

                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority)
                        current += stack.pop();
                    else break;
                }

                if (expression.charAt(i) == '-' && (prev == '\0' || (getPriority(prev) > 0))) {
                    stack.push('u');
                } else stack.push(expression.charAt(i));

            }
            prev = expression.charAt(i);
        }

        while (!stack.empty()) current += stack.pop();

        return current;
    }

    public static double PostfixNotationToResult(String postfixNotation) {
        String operand = "";
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < postfixNotation.length(); i++) {
            if (postfixNotation.charAt(i) == ' ') continue;

            if (getPriority(postfixNotation.charAt(i)) == 0) {
                while (postfixNotation.charAt(i) != ' ' && getPriority(postfixNotation.charAt(i)) == 0) {
                    operand += postfixNotation.charAt(i++);
                    if (i == postfixNotation.length()) break;
                }
                stack.push(Double.parseDouble(operand));
                operand = "";
            }

            if (getPriority(postfixNotation.charAt(i)) > 1) {
                switch (postfixNotation.charAt(i)) {
                    case '*': stack.push(stack.pop()*stack.pop()); break;
                    case '/': {
                        double a = stack.pop(), b = stack.pop();
                        if (a == 0) throw new ArithmeticException("Деление на ноль");
                        stack.push(b/a); break;
                    }
                    case '+': stack.push(stack.pop()+stack.pop()); break;
                    case '-': {
                        double a = stack.pop(), b = stack.pop();
                        stack.push(b-a); break;
                    }
                    case 'u': stack.push(-stack.pop()); break;
                }
            }
        }
        return stack.pop();
    }

    private static int getPriority (char token) {
        if (token == '*' || token == '/')      return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(')                 return 1;
        else if (token == ')')                 return -1;
        else if (token == 'u')                 return 4;
        else return 0;
    }
}
