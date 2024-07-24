package Math;

import java.util.*;

public class MaxHeigthofTri {
    public static int maxHeightOfTriangle(int red, int blue) {
        int height = 0;
        int level = 1;

        while (red >= 0 && blue >= 0) {
            if (red >= blue) {
                if (red >= level) {
                    red -= level;
                } else {
                    break;
                }
            } else {
                if (blue >= level) {
                    blue -= level;
                } else {
                    break;
                }
            }
            height++;
            level++;
        }

        return height;
    }

    public static void main(String[] args) {
        int red = 2;
        int blue = 4;
        System.out.println(maxHeightOfTriangle(red, blue));
    }
}
