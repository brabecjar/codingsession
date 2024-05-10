package com.wag.second;

import java.util.List;

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
        //TODO Your implementation -> you are right, the easiest way to loop it twice.
        var secondMax = Integer.MIN_VALUE;
        var max = integers.stream().max(Integer::compareTo).get();
        return integers.stream().filter(i -> i > secondMax && !i.equals(max)).max(Integer::compareTo).get();
    }
}
