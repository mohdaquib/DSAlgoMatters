package com.ds.algo.matters.binary_serach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsSubsequence {
    public static void main(String[] args){
        System.out.println(isSubsequenceUsingTwoPointers("abac", "ahbgdac"));
    }

    private static boolean isSubsequenceUsingTwoPointers(String s, String t) {
        if(s.length() == 0) return true;
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }

            if(index >= s.length()){
                return true;
            }
        }

        return false;
    }

    private static boolean isSubsequenceUsingBinarySearch(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            List<Integer> idx = map.getOrDefault(t.charAt(i), new ArrayList<>());
            idx.add(i);
            map.put(t.charAt(i), idx);
        }

        int lastFound = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                return false;
            }

            List<Integer> idxList = map.get(s.charAt(i));
            int idx = binSearchHelper(idxList, lastFound);
            if (idx == -1) {
                return false;
            }
            lastFound = idx;
        }

        return true;
    }

    private static int binSearchHelper(List<Integer> idxList, int lastFound) {
        int start = 0;
        int end = idxList.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (idxList.get(mid) > lastFound) {
                result = idxList.get(mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return result;
    }
}
