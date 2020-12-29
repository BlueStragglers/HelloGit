package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
//        printHelloWorld(5);
//        bubbleSort();
//        playMergeSort();
        System.out.println("更新一");
        System.out.println("修改");
        String s = "hello world";
        System.out.println("s = " + s);
    }

    private static void playMergeSort() {
        int[] nums = getInts();
        int left = 0, right = nums.length - 1;
        mergeSort(nums, left, right);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0, p1 = left, p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            help[i++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
        }
        while (p1 <= mid) {
            help[i++] = nums[p1++];
        }
        while (p2 <= right) {
            help[i++] = nums[p2++];
        }
        for (int k = 0; k < help.length; k++) {
            nums[left + k] = help[k];
        }
    }

    private static void bubbleSort() {
        int[] nums = getInts();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static int[] getInts() {
        int[] nums = new int[]{1, 5, 3, 2, 4};
        return nums;
    }

    private static int printHelloWorld(int n) {
        sayHelloWorld(n);
        return 0;
    }

    private static void sayHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }
}