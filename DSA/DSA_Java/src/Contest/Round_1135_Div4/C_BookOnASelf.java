package Contest.Round_1135_Div4;

import java.util.*;

public class C_BookOnASelf {
    static Map<Integer, Integer> getFrequency(int[] a) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int value : a) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            Map<Integer, Integer> frequency = getFrequency(arr);

            List<Integer> left = new ArrayList<>();
            List<Integer> middle = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            int max = arr[n - 1];

            for (int height : new TreeSet<>(frequency.keySet())) {
                int count = frequency.get(height);

                if (height == max) {
                    for (int i = 0; i < count; i++) {
                        middle.add(height);
                    }
                } else {
                    left.add(height);
                    count--;

                    if (count > 0) {
                        right.add(height);
                        count--;
                    }

                    for (int i = 0; i < count; i++) {
                        middle.add(height);
                    }
                }
            }

            Collections.reverse(right);

            List<Integer> answer = new ArrayList<>();
            answer.addAll(left);
            answer.addAll(middle);
            answer.addAll(right);

            int visible = 0;
            int tallest = Integer.MIN_VALUE;

            for (int height : answer) {
                if (height > tallest) {
                    visible++;
                    tallest = height;
                }
            }

            tallest = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if (answer.get(i) > tallest) {
                    visible++;
                    tallest = answer.get(i);
                }
            }

            if (frequency.get(max) == 1) {
                visible--;
            }

            System.out.println(visible);
            for (int height : answer) {
                System.out.print(height + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}