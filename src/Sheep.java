public class Sheep {

    public static String warnTheSheep(String[] array) {
        String s = null;
        for(int i = 0; i<array.length; i++){
            s = array[i].equals("wolf") ? ((i == array.length - 1) ?
                    "Pls go away and stop eating my sheep" :
                   String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", (array.length-i-1))): "";
            if(!s.equals("")) break;
        }
        return s;

    }
    

    public static void main(String[] args) {
        String[] s = new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"};
        System.out.println("Message: " + warnTheSheep(s));
    }
}
