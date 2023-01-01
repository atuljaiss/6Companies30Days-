class Solution {
    public int evaluate(int a,int b,String ch){
        switch(ch){
            case "+" : return a+b;
            case "-":   return a-b;
            case "*":return a*b;
            case "/": return a/b;
        }
        return 1;
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<tokens.length;i++){
            String ch = tokens[i];
            if(isNumeric(ch)){
                System.out.println("yes");
                s.add(Integer.parseInt(ch));
            }else{
                int op1 = s.pop();
                int op2 = s.pop();
                int res = evaluate(op2,op1,ch);
                System.out.println(op2+" "+op1+" "+res+" ");

                s.add(res);
            }
        }
        return s.pop();
    }
}