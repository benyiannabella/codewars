import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vowels {

    public static int getCount(String str) {

        // a, e, i, o, u
        List<Character> c = new ArrayList<>(Arrays.asList('a', 'e', 'o', 'i' ,'u'));
        List<Character> chr = str.chars()
                .filter(x-> c.contains((char)x))
                .mapToObj(x-> (char)x)
                .collect(Collectors.toList());

        System.out.println(chr.toString());
        return chr.size();
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

}