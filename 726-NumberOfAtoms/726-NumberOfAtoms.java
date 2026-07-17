// Last updated: 7/17/2026, 11:56:07 PM
import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>());

        int i = 0;
        while (i < formula.length()) {
            char c = formula.charAt(i);

            if (c == '(') {
                stack.push(new TreeMap<>());
                i++;
            } else if (c == ')') {
                i++;
                int start = i;
                while (i < formula.length() && Character.isDigit(formula.charAt(i)))
                    i++;
                int mult = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> top = stack.pop();
                Map<String, Integer> map = stack.peek();

                for (String key : top.keySet()) {
                    map.put(key, map.getOrDefault(key, 0) + top.get(key) * mult);
                }
            } else {
                int start = i++;
                while (i < formula.length() && Character.isLowerCase(formula.charAt(i)))
                    i++;
                String atom = formula.substring(start, i);

                start = i;
                while (i < formula.length() && Character.isDigit(formula.charAt(i)))
                    i++;
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> map = stack.peek();
                map.put(atom, map.getOrDefault(atom, 0) + count);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String atom : stack.peek().keySet()) {
            sb.append(atom);
            int count = stack.peek().get(atom);
            if (count > 1)
                sb.append(count);
        }

        return sb.toString();
    }
}