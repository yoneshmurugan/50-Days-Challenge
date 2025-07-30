class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(')','(', '}','{' , ']','[');
        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }
}