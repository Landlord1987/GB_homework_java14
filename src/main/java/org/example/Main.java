package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] m1 = {0, 1, 2, 4, 0, 5, 6};
        int[] m2 = {0, 1, 2, 4, 0, 5, 6, 5, 22, 12};
        int[] m3 = {0, 1, 2, 5, 0, 5, 6};
        try {
            System.out.println(Arrays.toString(getMas(m1)));
            System.out.println(Arrays.toString(getMas(m2)));
            System.out.println(Arrays.toString(getMas(m3)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] m11 = {1, 1, 1, 1, 1, 1, 1};
        int[] m22 = {4, 4, 4, 4, 4, 4, 4};
        int[] m33 = {1, 4, 1, 4, 4, 1, 4};
        int[] m44 = {1, 1, 4, 4, 3, 4, 4};
        System.out.println(getMas2(m11));
        System.out.println(getMas2(m22));
        System.out.println(getMas2(m33));
        System.out.println(getMas2(m44));


    }

    public static int[] getMas(int[] arr) {
        int four = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                four = i;
                break;
            }
        }
        if (four == -1) {
            throw new RuntimeException("В массиве нет ни одной 4: " + Arrays.toString(arr));
        }

        int[] arr1 = new int[arr.length - four - 1];

        for (int i = four + 1, w = 0; i < arr.length; i++, w++) {
            arr1[w] = arr[i];
        }

        return arr1;
    }

    public static boolean getMas2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                if (arr[i] != 4) return false;
            }
            sum += arr[i];
        }
        if (sum == arr.length || sum == (4 * arr.length)) return false;

        return true;
    }
}

