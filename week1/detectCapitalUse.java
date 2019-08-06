package Week1;

class Solution {
    public boolean detectCapitalUse(String word){
        boolean value = false;


        if(word.length() == 1){
            value = true;
            return value;
        }else if(Character.isUpperCase(word.charAt(0))){
            value = detect(word.substring(1), true) || detect(word.substring(1), false);
        }else if(Character.isLowerCase(word.charAt(0))){
            value = detect(word.substring(1), false);
        }
        return value;
    }

    public boolean detect(String s, boolean b){
        for(char c: s.toCharArray()){

            if(Character.isUpperCase(c) != b) return false;
        }
        return true;
    }
}