class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch == '-') continue;
            if (a == k) {
                sb.append('-');
                a = 0;
            }
            sb.append(Character.toUpperCase(s.charAt(i)));
            a++;
        }
        return sb.reverse().toString();
    }
}