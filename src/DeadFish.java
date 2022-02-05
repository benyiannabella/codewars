import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class DeadFish {
    public static int[] parse(String data) {
    /*  i increments the value (initially 0)
        d decrements the value
        s squares the value
        o outputs the value into the return array*/

        String[] s = data.split("", data.length());
        int num = 0;
        var list = new ArrayList<Integer>();
        int i = 0;
        while (i < s.length) {
            if (s[i].equals("i")) ++num;
            else if(s[i].equals("s")) num*=num;
            else if (s[i].equals("d")) --num;
            else list.add(num);
            i++;
        }
       return list.stream().mapToInt(x->x).toArray();

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(parse("iiisdoso")));
    }
}
