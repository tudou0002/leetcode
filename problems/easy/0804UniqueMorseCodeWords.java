class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int counter =0;
        if(words.length==1) return 1;
        Map<String,Integer> word = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                str.append(morse[words[i].charAt(j)-97]);
            }
            String s = str.toString();
            word.putIfAbsent(s,1);
            
        }
        return word.size();
    }
}
