package ch11.practice;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[][] mulArr = new int[10][5];

        for(int[] arr : mulArr)
        {
            Arrays.fill(arr, 9);
        }

        System.out.println(Arrays.deepToString(mulArr)); //다차원 배열 toString

        int[] arr1 = {1,3,5};
        int[] arr2 = {1,3,5};

        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("같음 여부 : " + equals);

        int a = 13;
        int b = 1;

        //검사 주체가 작으면 -1, 같으면 0, 크면 1

        System.out.println(  compare(a,b));


    }

    public static int compare(int tv, int av) {

        return (tv < av ? -1 : (tv > av ? 1 : 0));
    }
}
