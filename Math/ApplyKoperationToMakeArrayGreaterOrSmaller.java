package Math;

public class ApplyKoperationToMakeArrayGreaterOrSmaller {

  public static int minOperations(int k) {
    int minOps = k-1;
    if (k == 1) {
      return 0;
    }
    for (int i = 2; i < k; i++) {
      int dubops = i - 1;
      int copy = k / i;
      if (k%i != 0) {
        copy++;
      }
      minOps = Math.min(minOps, copy-1 + dubops);
    }
    return minOps;
  }

  public static void main(String[] args) {
    System.out.println(minOperations(11));
  }
}
