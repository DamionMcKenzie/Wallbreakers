package Week4;

import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();


        for(int i = 0; i < ops.length; i++){

            if(getInt(ops[i]) != null){

                stack.push(Integer.parseInt(ops[i]));

            }else if(ops[i].equals("+")){

                Integer I = stack.pop();
                Integer J = stack.pop();
                stack.push(J);
                stack.push(I);
                stack.push(I +J);

            }else if(ops[i].equals("D")){

                Integer doubled = stack.pop();
                stack.push(doubled);
                stack.push(doubled * 2);

            }else if(ops[i].equals( "C")){

                stack.pop();
            }
        }

        return findSum(stack);
    }



    private int findSum(Stack<Integer> s){

        int sum = 0;

        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }

    private Integer getInt(String s){
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }


}
