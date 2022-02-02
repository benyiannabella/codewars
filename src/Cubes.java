
import java.util.Arrays;
import java.util.Comparator;

public class Cubes {

    public static int[] flip(char dir, int[] arr) {

           return Arrays.stream(arr)
                    .boxed()
                    .sorted(dir=='R' ? Comparator.comparingInt(a -> a) : (a, b)->b-a)
                    .mapToInt(x->x)
                    .toArray();

    }

    public static void main(String[] args) {
        int[] arr = {6,1,5,8,4};
        System.out.println(Arrays.toString(flip('R', arr)));
    }
}