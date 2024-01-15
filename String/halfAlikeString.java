package String;

//LC1704. Determine if String Halves Are Alike

public class halfAlikeString {
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int mid = s.length()/2;
        String[] halfs = {s.substring(0 ,mid), s.substring(mid)};
        
        if (solve(halfs[0], 0)  == solve(halfs[1], 0)) {
            return true;
        }
        return false;
    }

    static int solve(String a, int count) {
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
