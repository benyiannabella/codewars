import java.util.Arrays;

public class Greed {

    /* Three 1's => 1000 points
    Three 6's =>  600 points
    Three 5's =>  500 points
    Three 4's =>  400 points
    Three 3's =>  300 points
    Three 2's =>  200 points
    One   1   =>  100 points
    One   5   =>   50 point*/
    public static int greedy(int[] dice){
        int sum = 0;
        int one = (int)Arrays.stream(dice).boxed().filter(x->x==1).count();
        int two = (int)Arrays.stream(dice).boxed().filter(x->x==2).count();
        int three = (int)Arrays.stream(dice).boxed().filter(x->x==3).count();
        int four = (int)Arrays.stream(dice).boxed().filter(x->x==4).count();
        int five = (int)Arrays.stream(dice).boxed().filter(x->x==5).count();
        int six = (int)Arrays.stream(dice).boxed().filter(x->x==6).count();

        return sum = (int) ((one<3 ? one*100 : ((one%3)==0 ? (one/3)*1000 : (Math.floor(one/3)*1000 +(one%3)*100)))
                        + (two<3 ? 0 : ((two%3)==0 ? (two/3)*200 : (Math.floor(two/3)*200)))
                        + (three<3 ? 0 : ((three%3)==0 ? (three/3)*300 : (Math.floor(three/3)*300)))
                        + (four <3 ? 0 : ((four %3)==0 ? (four/3)*400 : (Math.floor(four/3)*400)))
                        + (five<3 ? five*50 : ((five%3)==0 ? (five/3)*500 : (Math.floor(five/3)*500 +(five%3)*50)))
                        + (six<3 ? 0 : ((six%3)==0 ? (six/3)*600 : (Math.floor(six/3)*600))));
    }

    public static void main(String[] args) {
        System.out.println(Greed.greedy(new int[]{3,3,3,3,3,3,3,4,2,}));
    }
}
