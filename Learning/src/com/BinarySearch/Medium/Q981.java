package com.BinarySearch.Medium;
import java.util.*;

public class Q981 {
    class TimeMap {

        public TimeMap() {

        }

        HashMap<String, List<Node>> map = new HashMap<>();

        public void set(String key, String value, int timestamp) {
            List<Node> curr = map.get(key);

            if (curr == null) {
                curr = new ArrayList<>();
                map.put(key, curr);
            }

            Node node = new Node();
            node.timestamp = timestamp;
            node.value = value;

            curr.add(node);
        }

        public String get(String key, int timestamp) {
            List<Node> list = map.get(key);

            if (list == null) {
                return "";
            }

            int low = 0;
            int high = list.size() - 1;

            if (list.get(low).timestamp > timestamp) {
                return "";
            }

            if (list.get(high).timestamp <= timestamp) {
                return list.get(high).value;
            }

            while (low < high) {
                int mid = (low + high) / 2;

                Node node = list.get(mid);

                if (node.timestamp == timestamp) {
                    return node.value;
                }

                if (node.timestamp > timestamp) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            return list.get(low - 1).value;
        }
    }

    class Node {
        int timestamp;
        String value;
    }
}
