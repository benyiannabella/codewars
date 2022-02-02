public class Test {
    public static int findEvenIndex(int[] arr) {
        int result = 0;

        for(int i = 0; i < arr.length; i++){
                int left = 0;
                for(int j = 0;  j < i; j++){
                    left += arr[j];
                }

                int right = 0;
                for(int z = (arr.length-1); z > i; z--){
                    right+=arr[z];
                }

            if(left == right){
                result = i;
                break;
            } else result = -1;

            if (i == (arr.length - 1)) break;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Test.findEvenIndex(new int[]{1,2,3,4,3,2,1});
    }
}

