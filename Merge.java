import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first arary:");
        int n1=sc.nextInt();
        int []arr1=new int[n1];
        System.out.println("Enter the element of the 1st array:");
        for(int i=0;i<n1;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int n2=sc.nextInt();
        int[]arr2=new int[n2];
        System.out.println("Enter the element of the 2nd array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] merged=new int[n1+n2];
        System.arraycopy(arr1,0,merged,0,n1);
        System.arraycopy(arr2,0,merged,n1,n2);
        System.out.println("The merged array is: ");
        for(int num: merged){
            System.out.println(num+" ");

        }
    }
}
