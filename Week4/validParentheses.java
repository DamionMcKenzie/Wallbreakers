package Week4;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        if(s.equals("")){
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char [] ch = s.toCharArray();

        int paren = 0;
        int braces = 0;
        int bracket = 0;

        for(int i = 0; i < ch.length; i++){

            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{'){

                if(ch[i] == '('){
                    paren++;
                }else if(ch[i] == '['){
                    bracket++;
                }else if(ch[i] == '{'){
                    braces++;
                }

                stack.push(ch[i]);

                if(i == ch.length -1){
                    if(paren % 2 == 0 || braces % 2 == 0 || bracket % 2 == 0){
                        return false;
                    }

                }


            }else if(ch[i] == ')' || ch[i] == ']' || ch[i] == '}'){

                if(stack.isEmpty()){
                    return false;
                }

                char c = stack.peek();

                if(c == '(' && ch[i] == ')' ){

                    paren++;
                    stack.pop();


                }else if(c == '(' && (ch[i] == ']' || ch[i] == '}')){


                    return false;

                }else if(c == '[' && ch[i] == ']'){

                    bracket++;
                    stack.pop();

                }else if(c == '[' && (ch[i] == ')' || ch[i] == '}')){


                    return false;

                }else if(c == '{' && ch[i] == '}'){

                    braces++;
                    stack.pop();
                }else if(c == '{' && (ch[i] == ')' || ch[i] == ']')){


                    return false;

                }


                if(i == ch.length -1){
                    if(paren % 2 != 0 || braces % 2 != 0 || bracket % 2 != 0){
                        return false;
                    }
                }

            }


        }

        return true;
    }
}
