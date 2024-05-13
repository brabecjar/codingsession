package com.wag.second;

import java.util.List;
import java.util.Objects;

public class SecondLargest {

    /**
     * You are given a list of integers, and you need to implement a function that returns the second-largest number in the list.
     * Validate that list has at least two elements.
     * <ul>
     * <li>You may assume that the input list contains only integers.</li>
     * <li>You may not use any built-in sorting functions.</li>
     * <li>You should aim for an efficient algorithm that runs in O(n) time complexity..</li>
     * </ul>
     */
    public static int findSecondLargest(List<Integer> integers) {
        //TODO Your implementation -> you are right, the easiest way to loop it twice:
//        if (Objects.isNull(integers) || integers.isEmpty()) return 0;
//        var max = integers.stream().max(Integer::compareTo).orElse(0);
//        return integers.stream().filter(i -> !i.equals(max)).max(Integer::compareTo).orElse(0);

        // but no need to go through whole loop 2 times (e.g. what if 10m items - less efficient):
        // first let's check edge cases:
        if (Objects.isNull(integers) || integers.isEmpty()) return 0;

        if (integers.size() < 2) return integers.get(0);

        if (integers.size() == 2) {
            return integers.get(0) > integers.get(1) ? integers.get(1) : integers.get(0);
        }
        // secondly main logic:
        return getSecondLargest(integers);
    }

    private static int getSecondLargest(List<Integer> integers) {
        boolean isFirstValBigger = integers.get(0) > integers.get(1);
        int max = integers.get(isFirstValBigger ? 0 : 1);
        int goal = integers.get(isFirstValBigger ? 1 : 0);

        for (int i = 2; i < integers.size(); i++) {
            int current = integers.get(i);
            if (max < current) {
                goal = max;
                max = current;
            }
            if(current > goal && current < max){
                goal = current;
            }
        }
        return goal;
    }
}
