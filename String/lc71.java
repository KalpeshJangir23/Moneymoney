package String;

import java.util.ArrayList;

public class lc71 {
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        ArrayList<String> simplifiedPath = new ArrayList<>();

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("..")) {
                if (!simplifiedPath.isEmpty()) {
                    simplifiedPath.remove(simplifiedPath.size() - 1);
                }
            } else if (!part.isEmpty() && !part.equals(".")) {
                simplifiedPath.add(part);
            }
        }

        StringBuilder resultPath = new StringBuilder("/");
        for (int i = 0; i < simplifiedPath.size(); i++) {
            resultPath.append(simplifiedPath.get(i)).append("/");
        }

        if (resultPath.length() > 1) {
            resultPath.setLength(resultPath.length() - 1); // Remove the trailing '/'
        }

        return resultPath.toString();
    }

    public static void main(String[] args) {
        String path = "/bnk/../lkjk";
        // Expected result: "/c"
        System.out.println(simplifyPath(path));
    }
}
