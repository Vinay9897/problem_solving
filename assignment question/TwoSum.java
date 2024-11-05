import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {

        List<Pair> l = new ArrayList<>();
        int len = list.length;

        // Add each element as a Pair (index, value)
        for (int i = 0; i < len; i++) {
            l.add(new Pair(i, list[i]));
        }

        // Sort the list of pairs based on the `value`
        Collections.sort(l, Comparator.comparingInt(Pair::getValue));

        int start = 0;
        int end = len - 1;

        // Use two pointers to find the two-sum
        while (start < end) {
            Pair pair1 = l.get(start);
            Pair pair2 = l.get(end);

            int currentSum = pair1.getValue() + pair2.getValue();
            if (currentSum == sum) {
                return new int[] { pair1.getIndex(), pair2.getIndex() };
            } else if (currentSum < sum) {
                start++;
            } else {
                end--;
            }
        }

        // Return empty array if no two elements sum to the target
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}

// Helper class for holding value and index
class Pair {
    private final int value;
    private final int index;

    Pair(int index, int value) {
        this.value = value;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }
}
