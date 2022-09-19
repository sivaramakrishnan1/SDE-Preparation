public class detectingCaptial {
    public static void main(String[] args) {
        String s = "Flag";
        detectingCaptial obj = new detectingCaptial();
        System.out.println(obj.detectCaptial(s));
    }

    public boolean detectCaptial(String word) {
        boolean allCaps = true;
        boolean allSmall = true;
        boolean firstCap = (word.charAt(0) > 64 && word.charAt(0) < 91);

        for (int i = word.length() - 1; i >= 0 ; i--) {
            if(i==0 && allSmall == true && firstCap == true) return true;
            if(word.charAt(i) > 64 && word.charAt(i) < 91) allSmall = false;
            if(word.charAt(i) > 96 && word.charAt(i) < 123) allCaps = false;
        }

        return (allCaps && allSmall);
    }
}
