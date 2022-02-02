import java.util.Arrays;

public class TotalPoints {

    public static int points(String[] games) {
//        return Arrays.stream(games)
//                .map(x -> x.split(":"))
//                .mapToInt((x) -> ((Integer.parseInt(x[0]) > Integer.parseInt(x[1]))  ? 3 :
//                        ((Integer.parseInt(x[0]) < Integer.parseInt(x[1])) ? 0 : 1)))
//                .sum();

        return Arrays.stream(games)
                .mapToInt(x-> x.charAt(0)>x.charAt(2) ? 3 :
                              x.charAt(0)<x.charAt(2) ? 0 : 1)
                .sum();

    }

    public static void main(String[] args) {
        String[] s = new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        System.out.println(points(s));
    }

}