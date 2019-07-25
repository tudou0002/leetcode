class Solution {
    public String toLowerCase(String str) {
        char[] s = new char[str.length()];
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c>64 && c<91){
                s[i] = (char)(c +32);
            } else{
                s[i] = c;
            }
        }
        return new String(s);
    }
}
