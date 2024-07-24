        package DP_Practice;

        import java.util.HashSet;

        public class NumberofUniqueSubSequence {
            
            public static void main(String[] args) {
                String binary = "101";
                System.out.println(countUniqueGoodSubsequences(binary));
            }
            
            public static int countUniqueGoodSubsequences(String binary) {
                HashSet<String> uniqueSubsequences = new HashSet<>();
                generateSubsequences(binary, 0, "", uniqueSubsequences);
                return uniqueSubsequences.size();
            }

            private static void generateSubsequences(String binary, int index, String current, HashSet<String> uniqueSubsequences) {
                if (index == binary.length()) {
                    if (!current.isEmpty() && isValidGoodSubsequence(current)) {
                        uniqueSubsequences.add(current);
                    }
                    return;
                }
                
                generateSubsequences(binary, index + 1, current + binary.charAt(index), uniqueSubsequences);
                
                generateSubsequences(binary, index + 1, current, uniqueSubsequences);
                
            }
            
            private static boolean isValidGoodSubsequence(String subsequence) {
                if (subsequence.equals("0")) {
                    return true;
                }
                return !subsequence.startsWith("0");
            }
        }
