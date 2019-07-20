class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='M') result+=1000;
            if(c=='D') result+=500;
            if(c=='C'){
                if(i+1<s.length()){
                if(s.charAt(i+1)=='D'){
                    result+=400;
                    i++;
                    continue;
                }else if(s.charAt(i+1)=='M'){
                    result+=900;
                    i++;
                    continue;
                }else{
                    result+=100;
                    continue;
                }
            }result+=100;}
            if(c=='L') result+=50;
            if(c=='X') {
                if(i+1<s.length()){
                if(s.charAt(i+1)=='L'){
                    result+=40;
                    i++;
                    continue;
                }else if(s.charAt(i+1)=='C'){
                    result+=90;
                    i++;
                    continue;
                }else{
                    result+=10;
                    continue;
                }
            }result+=10;}
            if(c=='V') result+=5;
            if(c=='I'){
                if(i+1<s.length()){
                if(s.charAt(i+1)=='V'){
                    result+=4;
                   
                    break;
                }else if(s.charAt(i+1)=='X'){
                    result+=9;
                    
                    break;
                }else{
                    result+=1;
                    continue;
                }
            }result+=1;}
        }
        return result;
    }
}
