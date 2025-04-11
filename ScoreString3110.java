public class ScoreString3110 {
    public static int scoreOfString(String s) {
        int calc = 0;
        for(int i = 0; i<s.length()-1;i++){
            calc += Math.abs(s.codePointAt(i)-s.codePointAt(i+1));
        }
        return calc;
    }

    public static void main (String [] args){
        System.out.println(scoreOfString(""));
    }
}
