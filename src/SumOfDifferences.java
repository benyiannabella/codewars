import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class SumOfDifferences {
    public static int sumOfDifferences(int[] arr) {

        return arr.length > 1
                ? Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt(): 0;

//        int[] a = Arrays.stream(arr)
//                .boxed()
//                .sorted((x, y) -> y - x)
//                .mapToInt(x -> x)
//                .toArray();
//
//        return IntStream.range(0, a.length-1)
//                .map(i-> a[i] - a[i+1])
//                .sum();

//        int sum = 0;
//        if (arr.length <= 1) return 0;
//        else
//            for (int i = 0; i < arr.length; i++) {
//                if(i != arr.length-1) sum -= arr[i]-arr[i+1];
//            }
//        return abs(sum);

    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{6,4,7}));
    }
}

