/**
 * AssignCookies
 */
public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int n = s.length-1;
        for (int i = g.length-1; i >= 0; i--) {
            for (int j = n; j >=0; j--) {
                if (s[j] > g[i]) {
                    count++;
                    n = j-1; 
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}