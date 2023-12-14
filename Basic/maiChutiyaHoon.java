package Basic;
public class maiChutiyaHoon {
    public static double calculateDistance(int[][] points) {
        double totalDistance = 0.0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] point1 = points[i];
            int[] point2 = points[i + 1];
                                                                                                    
            int x1 = point1[0];
            int y1 = point1[1];
            int x2 = point2[0];
            int y2 = point2[1];

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            totalDistance += distance;
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        int[][] pointsArray = {{1,1},{3,4},{-1,0}};

        double distance = calculateDistance(pointsArray);
        System.out.println("Total distance between the points: " + distance);
    }
}
