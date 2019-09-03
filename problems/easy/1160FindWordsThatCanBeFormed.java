class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] temp = new int[26];
        boolean contain=true;
        for(Character cha : chars.toCharArray()){
            temp[cha-'a']++;}
        
        for(int i=0;i<words.length;i++){
            if(words[i].length()>chars.length())
                continue;
            int[] tmp = temp.clone();
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                if(tmp[c-'a']!=0){
                    tmp[c-'a']--;
                }
                else{
                    contain=false;
                    break;
                }
            }
            if(contain)
                result += words[i].length();
            else
                contain=true;
        }
        return result;
    }
}
