package com.test.altimetrik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class StatePlanningMST {
    static class Edge implements Comparable<Edge> {
        int from;
        int to;
        int type;

        public Edge(int from, int to, int type) {
            this.from = from;
            this.to = to;
            this.type = type;
        }
        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.type, other.type);
        }
    }

    public static List<Integer> statePlanning(int numOfCities, List<String> fromCity, List<String> toCity, List<Integer> roadType) {
        List<Edge> edges = new ArrayList<>();

        // Populate the list of edges
        for (int i = 0; i < fromCity.size(); i++) {
            int from = Integer.parseInt(fromCity.get(i));
            int to = Integer.parseInt(toCity.get(i));
            int type = roadType.get(i);
            edges.add(new Edge(from, to, type));
        }
        // Sort the edges by road type
        Collections.sort(edges);

        // Initialize the parent array for disjoint set
        int[] parent = new int[numOfCities];
        for (int i = 0; i < numOfCities; i++) {
            parent[i] = i;
        }

        List<Integer> demolitions = new ArrayList<>();

        // Kruskal's algorithm
        for (Edge edge : edges) {
            int rootFrom = find(parent, edge.from);
            int rootTo = find(parent, edge.to);

            // If the roots are not the same, add this edge to the minimum spanning tree
            if (rootFrom != rootTo) {
                union(parent, rootFrom, rootTo);
            } else {
                demolitions.add(edge.type);
            }
        }

        return demolitions;
    }

    private static int find(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]);
        }
        return parent[node];
    }

    private static void union(int[] parent, int a, int b) {
        int rootA = find(parent, a);
        int rootB = find(parent, b);
        parent[rootA] = rootB;
    }

    public static void main(String[] args) {
        int numCities = 4;
       List<String> fromCity = Arrays.asList("3", "0", "0", "2", "1");
        List<String> toCity = Arrays.asList("2", "3", "2", "1", "2");
        List<Integer> roadType = Arrays.asList(1, 0, 0, 1, 0);
        /*List<String> fromCity = Arrays.asList("3", "0", "0", "2", "1");
        List<String> toCity = Arrays.asList("2", "3", "2", "1", "3");
        List<Integer> roadType = Arrays.asList(1, 0, 0, 1, 1);*/

        List<Integer> result = statePlanning(numCities, fromCity, toCity, roadType);
        System.out.println(result);

        /*List<String> fromCity = Arrays.asList("0", "0", "3", "3");
        List<String> toCity = Arrays.asList("1", "3", "2", "1");
        List<Integer> roadType = Arrays.asList(0, 0, 1, 1);

        List<Integer> result = statePlanning(numCities, fromCity, toCity, roadType);
        System.out.println(result);*/
    }
}