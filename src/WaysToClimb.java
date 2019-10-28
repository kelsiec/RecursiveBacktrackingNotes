import java.util.ArrayList;
import java.util.List;

public class WaysToClimb {
    public static void waysToClimb(int numStairs) {
            waysToClimbHelper(new ArrayList<>(), numStairs);
    }

    private static void waysToClimbHelper(
            List<Integer> path, int numStairs) {
        if (numStairs == 0) {
            System.out.println(path);
        } else {
            //Copy method
//            List<Integer> path1 = new ArrayList<>(path);
//            path1.add(1);
//            waysToClimbHelper(path1, numStairs - 1);
//
//            if (numStairs >= 2) {
//                List<Integer> path2 = new ArrayList<>(path);
//                path2.add(2);
//                waysToClimbHelper(path2, numStairs - 2);
//            }


            // Try and revert method
            path.add(1);
            waysToClimbHelper(path, numStairs - 1);
            path.remove(path.size() - 1);

            if (numStairs >= 2) {
                path.add(2);
                waysToClimbHelper(path, numStairs - 2);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        waysToClimb(3);
    }
}
