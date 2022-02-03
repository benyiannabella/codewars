import java.util.stream.IntStream;

public class Maximum {
    public static int expressionsMatter(int a, int b, int c){
        int[] i = new int[]{(a+b+c), ((a+b)*c), (a*(b+c)),(a+b*c),(a*b*c)};
        return IntStream.of(i)
                .max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(2,1,1));
    }
}
