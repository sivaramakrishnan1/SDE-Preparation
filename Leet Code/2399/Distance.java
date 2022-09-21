public class Distance {
    public static void main(String[] args) {
       Distance d = new Distance();
       String s = "abaccb";
       int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
       System.out.println(d.checkDistances(s, distance)); 
    }

    public boolean checkDistances(String s, int[] distance) {
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            int dis = distance[s.charAt(i) - 97];
            if(dis == Integer.MAX_VALUE) continue;
            distance[s.charAt(i) - 97] = Integer.MAX_VALUE;

            if((i + dis + 1) < s.length() && s.charAt(i) == s.charAt(i + dis + 1)) continue;
            else return false;
        }

        return true;
    }
}
