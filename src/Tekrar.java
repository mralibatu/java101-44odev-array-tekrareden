import java.util.Arrays;

public class Tekrar {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if ( i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 4, 8, 5, 2, 2, 3, 9, 4, 6, 23, 25, 6};
        int[] ciftsayi = new int[list.length];
        int a = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if(!isFind(ciftsayi,list[i])){
                        ciftsayi[a++] = list[i];
                        break;
                    }
                    ciftsayi[a++] = list[i];
                    break;
                }
            }
        }
        for (int i : ciftsayi){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}
