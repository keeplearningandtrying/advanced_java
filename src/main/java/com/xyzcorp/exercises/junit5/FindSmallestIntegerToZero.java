package com.xyzcorp.exercises.junit5;

import java.util.List;
import java.util.Optional;

public class FindSmallestIntegerToZero {
    public static Optional<Integer> find(List<Integer> list) {
        if (list.isEmpty()) return Optional.empty();
        else {
            int distanceWinner = Math.abs(list.get(0));
            int result = list.get(0); //-2
            for (int i : list.subList(1,list.size())) {
                int distance = Math.abs(i);
                if (distanceWinner == distance) {
                    distanceWinner = Math.abs(distance);
                    result = Math.abs(result);
                }
                else if (distance < distanceWinner) {
                    distanceWinner = Math.abs(distance);
                    result = i;
                }
            }
            return Optional.of(result);
        }
    }
}
