class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(isBalanced(s));
        }
    
    
    }
    
    public static String isBalanced(String str) {
    
        Stack<Character> stack = new Stack<>();
        char c;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            count++;
    
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
    
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return String.valueOf(count);
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return String.valueOf(count);
                }
            }
        }
    
        if (!stack.isEmpty()) {
            return String.valueOf(str.lastIndexOf(stack.peek()));
        }
    
        return "Success";
    
    }
    }