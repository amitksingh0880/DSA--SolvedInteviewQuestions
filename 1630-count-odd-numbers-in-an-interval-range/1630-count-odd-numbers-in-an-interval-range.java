class Solution {
    public int countOdds(int low, int high) {
        int count = 0 ;
        int dif = high - low;
        if(dif %2 == 0 && low %2 == 1)
        {
            return (dif/2)+1;
        }
        else if(dif %2 == 1){
            return (dif/2)+1;
        }else{
              return (dif/2);
        }
    }
}