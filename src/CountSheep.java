import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CountSheep {

    public static String countingSheep(int num) {
        AtomicInteger counter= new AtomicInteger(1);
        return Arrays.stream(new String[num])
                .map(x->num!=0 ?  counter.getAndIncrement() +" sheep..." : "")
                        .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}

