class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> code = new HashMap<Character,String>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<26;i++){
            code.put((char)('a'+i),morse[i]);
        }
       
        Map<String,Integer> word = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                str.append(code.get(words[i].charAt(j)));
            }
            String s = str.toString();
            word.putIfAbsent(s,1);
            System.out.print(s);
        }
        return word.size();
    }
}
