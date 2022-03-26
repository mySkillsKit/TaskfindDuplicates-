package com.devskiller;

import java.util.*;
import java.util.stream.Collectors;


public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        Set<Integer> duplicates = findDuplicatesSet(integers);
        List<Integer> list  = new ArrayList<>(duplicates);
        list.removeAll(Collections.singleton(null));
        return list;
        
    }

    private <T> Set<T> findDuplicatesSet(Collection<T> collection) {
        Set<T> elements = new HashSet<T>();
        return collection.stream()
                .filter(e -> !elements.add(e))
                .collect(Collectors.toSet());
    }

}
