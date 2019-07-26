class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder str = new StringBuilder();
        int counter = 0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c == ')'){
                counter--;
                if(counter>0) str.append(')');   
            } else {
                counter++;
                if(counter>1) str.append('(');                  
            }
        }           
        return str.toString();
    }
}
