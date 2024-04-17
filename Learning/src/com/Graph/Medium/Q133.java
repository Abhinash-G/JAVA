package com.Graph.Medium;

import com.Graph.Node;

import java.util.*;

public class Q133 {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        if(node.neighbors.isEmpty())
            return new Node(node.val);
        Queue<Node> queue=new LinkedList<>();
        HashMap<Node,Node> map=new HashMap<>();

        Node newNode=new Node(node.val);
        map.put(node,newNode);
        queue.offer(node);

        while(!queue.isEmpty()){
            Node current=queue.poll();

            for (Node neighbor : current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    Node clonedNeighbor = new Node(neighbor.val);
                    map.put(neighbor, clonedNeighbor);
                    queue.offer(neighbor);
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }
        return newNode;
    }
}
