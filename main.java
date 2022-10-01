import java.util.Scanner;

public class employer {
    public static void main(String[] args) {
        int i, j, tmp1 = 0, tmp2;

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        // Inputting array elements
        arr = new int[]{2, 5, 1, 74, 9, 3, 56, 7, 6, 11};
//        for (i=0; i<=9; i++){
//            arr[i] = sc.nextInt();
//        }

        System.out.println();
        i = 0;

        // bubble sort
        for (j=0; j<= arr.length; j++) {
            for (i = 0; i <= 9; i++) {
                tmp1 = arr[i];
                if( i == 9){
                    tmp2 = arr[i];
                }
                else {
                    tmp2 = arr[i + 1];
                }
                if (tmp1 > tmp2) {
                    arr[i] = tmp2;
                    arr[i + 1] = tmp1;
                }
            }
        }
        System.out.println();

        // Printing array elements
        System.out.println();
        i =0;
        for (i=0; i<=9; i++){
            System.out.println(arr[i]);
        }

        // Finding elements by LINEAR SEARCH
//        System.out.println("enter number to find");
//        int inp = sc.nextInt();
//
//        i =0;
//        tmp1 = 0;
//        for (i=0; i<=9; i++){
//            if (inp == arr[i]) {
//                tmp1 = 1;
//            }
//        }
//        if (tmp1 == 1) {
//            System.out.println("number found");
//        }
//        else {
//            System.out.println("num not found ");
//        }

        // Finding elements by BINARY SEARCH
        int l = 0, u = 9, mid = (u + l)/2, res = 0;

        System.out.println("enter number to find");
        int inp = sc.nextInt();

        while (mid > 0) {
            if(inp == arr[mid]){
                res = 1;
                break;
            }
            if(inp > arr[mid])  {   l = mid ;   }
            if(inp < arr[mid])  {   u = mid ;   }
            if(l==u)    {   break;      }
            mid = (u + l)/2;
            System.out.println(l + " " + u);
        }
        if (res == 1){
            System.out.println("number found :)  at => ");

        }
        else{
            System.out.println("number not found :(");
        }

    }
}
