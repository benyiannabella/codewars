import java.util.Arrays;
import java.util.stream.Collectors;

public class ToCamelCase {

    static String toCamelCase(String s){
        String[] arr = s.contains("_") ? s.split("_") : s.split("-");
        return Arrays.stream(arr)
                .map(x-> (x == arr[0]) ? x : (x.substring(0,1).toUpperCase().concat(x.substring(1))))
                .collect(Collectors.joining());

        }


    public static void main(String[] args) {
        System.out.println(toCamelCase("down_Blue_down_mountain_Street_right_side_desert_Blue"));
    }

}


