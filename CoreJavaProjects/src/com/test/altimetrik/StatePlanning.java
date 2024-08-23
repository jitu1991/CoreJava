package com.test.altimetrik;

import java.util.*;

public class StatePlanning {
    public static List<Integer> statePlanning(int numOfCities, List<String> fromCity, List<String> toCity, List<Integer> roadType) {
        Map<String, List<Integer>> roadMap = new HashMap<>();

        // Create a map to store the road type for each pair of connected cities
        for (int i = 0; i < fromCity.size(); i++) {
            String key = fromCity.get(i) + "-" + toCity.get(i);
            roadMap.put(key, roadMap.getOrDefault(key, new ArrayList<>()));
            roadMap.get(key).add(roadType.get(i));
        }

        List<Integer> demolitions = new ArrayList<>();

        // Iterate through the roadMap to find the maximum number of occurrences for each road type
        for (int type = 0; type < numOfCities; type++) {
            int maxOccurrences = 0;

            // Count occurrences of the current road type for all pairs of cities
            for (List<Integer> types : roadMap.values()) {
                int occurrences = Collections.frequency(types, type);
                maxOccurrences = Math.max(maxOccurrences, occurrences);
            }

            // Add the number of demolitions required for the current road type
            demolitions.add(maxOccurrences);
        }

        return demolitions;
    }

    public static void main(String[] args) {
        int numCities = 4;
        /*List<String> fromCity = Arrays.asList("3", "0", "0", "2", "1");
        List<String> toCity = Arrays.asList("2", "3", "2", "1", "2");
        List<Integer> roadType = Arrays.asList(1, 0, 0, 1, 0);

        List<Integer> result = statePlanning(numCities, fromCity, toCity, roadType);
        System.out.println(result);*/

        List<String> fromCity = Arrays.asList("0", "0", "3", "3");
        List<String> toCity = Arrays.asList("1", "3", "2", "1");
        List<Integer> roadType = Arrays.asList(0, 0, 1, 1);

        List<Integer> result = statePlanning(numCities, fromCity, toCity, roadType);
        System.out.println(result);
    }
}
