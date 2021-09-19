public class Exercise6_20 {
    static int[] shuffle(int[] arr){
        if(arr == null || arr.length==0){
            return arr;
        }

        int ran = 0;
        int num = 0;

        for(int i=0; i<arr.length; i++){
            ran = (int)(Math.random()*arr.length);
            num = arr[i];
            arr[i] = arr[ran];
            arr[ran] = num;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
