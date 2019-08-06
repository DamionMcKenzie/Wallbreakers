package Week1;

class Solution {
    public boolean isPowerOfTwo(double n) {

        boolean  powerOfTwo = false;
        int i =0;

        while( i < 1){

            if(n == 1.0){
                powerOfTwo = true;
                return powerOfTwo;
            }

            if(n == 2.0){
                powerOfTwo = true;
                return powerOfTwo;
            }

            if(n == 3.0){
                return powerOfTwo;
            }


            i++;
        }

        if( n < 1.0){
            return powerOfTwo;
        }else if(n == 1.0){
            powerOfTwo = true;
            return powerOfTwo;
        }else
            return isPowerOfTwo(n /2.0);



    }
}