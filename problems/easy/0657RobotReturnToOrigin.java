class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2==1) return false;
        int ud = 0, lr = 0;
        for(char c : moves.toCharArray()){
            switch(c){
                case 'U':ud++;
                    break;
                case 'D':ud--;
                    break;
                case 'L':lr++;
                    break;
                case 'R':lr--;
                    break;
            }
        }
        return (ud==0 && lr==0);
    }
}
