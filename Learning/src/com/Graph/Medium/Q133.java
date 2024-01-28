package com.Graph.Medium;

import com.Graph.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Q133 {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        Stack<Node> stack= new Stack<>();
        HashMap<Integer,Node> visited=new HashMap<>();
        Node newNode=new Node(node.val,new ArrayList<>());
        if(!node.neighbors.isEmpty())
            stack.push(node);
        while(!stack.isEmpty()){
            Node tempNode=stack.pop();
            Node tempNode2= new Node(tempNode.val);
            visited.put(tempNode.val,tempNode2);
            for(int i=0;i<tempNode.neighbors.size();i++){
                Node neighbor=tempNode.neighbors.get(i);
                if(!visited.containsKey(neighbor.val))
                    stack.push(neighbor);
                else {
                    visited.get(neighbor.val).neighbors.add(tempNode);
                }
            }
        }
        return newNode;//not correct.
    }
}
