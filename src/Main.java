import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array =  new int[3];
        for(int i = 0;i < array.length; i++){
            System.out.println("Введите " + i + " Элемент");
            array[i] = input.nextInt();
        }
        int count = 0;
        for(int i = 0;i < array.length; i++){
            if(array[i] >= 0){
                count++;
            }
        }

        int[] plus_array = new int[count];
        int arrik[] = new int[count];
        count = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] >= 0){
                plus_array[count] = array[i];
                count++;
            }
        }
        quickshort(plus_array,0,plus_array.length - 1);
        System.out.println(Arrays.toString(plus_array));

    }
    public static void quickshort(int[] array, int low, int hight){
        if(array.length == 0) return;
        if(low >= hight) return;
        int middle = low + ((hight - low) / 2);
        int opora = array[middle];
        int i = low, j = hight;
        while (i <= j){
            while(array[i] <  opora){
                i++;
            }
            while(array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if(low < j) quickshort(array,low,j);
        if(hight > i) quickshort(array,i,hight);

    }
}
