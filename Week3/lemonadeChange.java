package Week3;

class Solution {
    public boolean lemonadeChange(int[] bills){

        int num5 = 0;
        int num10 = 0;
        int num20 = 0;

        for(int i = 0; i < bills.length; i++){

            if(bills[i] == 20){
                if(num10 > 0 & num5 > 0){
                    num5--;
                    num10--;
                    num20++;

                    if(num5 == -1|| num10 == -1){
                        return false;
                    }
                }else if(num5>=3){
                    num5 -=3;
                }else
                    return false;
            }else if(bills[i] == 10){
                if(num5 > 0){
                    num5--;
                    num10++;
                }else
                    return false;

            }else{

                num5++;

            }
        }

        return true;

    }
}
