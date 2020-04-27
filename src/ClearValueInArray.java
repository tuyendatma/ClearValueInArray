import java.util.Arrays;
import java.util.Scanner;

public class ClearValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[]{1,2,3,4,5,6,9,8};
        String show = Arrays.toString(arr);
        System.out.println("chuoi khi chua xoa");
        System.out.println(show);
        System.out.println("nhap so ban can xoa:");
        int num = scanner.nextInt();
        int index =findIndexValue(arr,num);
        if(index!= -1){
            int[] arr2= clearValue(arr,index);
            System.out.println(Arrays.toString(arr2));
        }
        else {
            System.out.println("chuoi khong co so ban nhap");
        }
    }
    public static int findIndexValue(int[] arr,int num){
        int index =-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                index=i;
            }
        }
        return index;
    }
    public static int[] clearValue(int[] arr, int index){
        int num=0;
        for (int i=index; i <arr.length-1 ; i++) {
            arr[i] =arr[i+1];
            arr[i+1]=num;
        }
        return arr;
    }
}
