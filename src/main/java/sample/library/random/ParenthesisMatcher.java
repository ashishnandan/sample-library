package sample.library.random;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class ParenthesisMatcher {

    private static final Map<Character, Character> closeOPenParenthesisPair = new HashMap<>();

    static {
        closeOPenParenthesisPair.put(']', '[');
        closeOPenParenthesisPair.put('}', '{');
        closeOPenParenthesisPair.put(')', '(');
    }

    public boolean matchParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        for (char a : input.toCharArray()) {
            if (closeOPenParenthesisPair.containsValue(a)) {
                stack.push(a);
            }

            if (closeOPenParenthesisPair.containsKey(a)) {
                if (stack.contains(closeOPenParenthesisPair.get(a))) {
                    Character lastParen = stack.pop();
                    if (!lastParen.equals(closeOPenParenthesisPair.get(a))) return false;
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}
