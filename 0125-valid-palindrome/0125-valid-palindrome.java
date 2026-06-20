class Solution {
    public boolean isPalindrome(String s) {
        // int l = 0 ;
        // int r = s.length() - 1;

        // while(l < r){
        //     while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
        //         l++;
        //     }
        //     while(l < r && !Character.isLetterOrDigit(s.charAt(r))){
        //         r--;
        //     }
        //     if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(l)) ) return false;
        //     l++;
        //     r--;
        // }

        // return true;

        s = s.trim();

        StringBuilder str = new StringBuilder();


        for(int i = 0 ; i< s.length(); i++){

            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){

                str.append(Character.toLowerCase(s.charAt(i)));

            }

        }

        String string = str.toString();

        String rev = str.reverse().toString();

        if(string.equals(rev)) return true;

        else return false;

    }
}