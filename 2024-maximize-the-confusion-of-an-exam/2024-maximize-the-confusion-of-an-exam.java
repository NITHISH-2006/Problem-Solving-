class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        return Math.max(longwin(answerKey,'F',k),longwin(answerKey,'T',k));
    }

    public int longwin(String s,char flip ,int k){
        int left = 0;
        int maxlen = 0;
        int count = 0;
        char[] arr = s.toCharArray();

        for(int right = 0 ;right < s.length() ;right++){
            
            if(arr[right]== flip) count++;
            
            while(count > k){
                if(arr[left] == flip) count--;
                left++;
            }
            maxlen = Math.max(right - left +1, maxlen);
        }

        return maxlen;
    }
    
}