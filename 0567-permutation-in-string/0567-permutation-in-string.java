class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false ;

        int[] freq = new int[26];
        int[] winfreq = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){
            freq[s1.charAt(i) - 'a']++;
            winfreq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq,winfreq)) return true;

        for(int i = s1.length() ; i< s2.length() ; i++){

            winfreq[s2.charAt(i) - 'a']++;
            winfreq[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(freq,winfreq)) return true;
        }

        return false;

        
    }
}