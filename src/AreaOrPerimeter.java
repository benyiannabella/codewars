public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
      return l==w ? l*w : ((l*2)+(w*2));
    }

    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(6,10));
    }
}
