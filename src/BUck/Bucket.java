package BUck;

import java.util.*;

public class Bucket {
    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
        bucketSort(arr);

        System.out.println("Sorted array is:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }

    // Correct insertion sort for individual buckets
    public static void insertionSort(List<Float> bucket) {
        for (int i = 1; i < bucket.size(); ++i) {
            float key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    // Fixed bucket sort
    public static void bucketSort(float[] arr) {
        int n = arr.length;

        // Create empty buckets
        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Distribute elements into buckets
        for (int i = 0; i < n; i++) {
            int bi = (int)(arr[i] * n); // bucket index
            buckets[bi].add(arr[i]);    // keep original value, don't multiply
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            insertionSort(buckets[i]);
        }

        // Concatenate all buckets into original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float val : buckets[i]) {
                arr[index++] = val; // important to increment index
            }
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            bucket[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = n; i>=0 &&  result.size() <= k; i--) {
            result.addAll(bucket[i]); // if bucket[i] is empty, this adds nothing
        }

        int[] list2 = new int[k];
        for (int i = 0; i < k; i++) {
            list2[i] = result.get(i);
        }

        return list2;
    }
}
