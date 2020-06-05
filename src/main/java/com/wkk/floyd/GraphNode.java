package com.wkk.floyd;

/**
 * @Time: 2020/6/5上午10:54
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class GraphNode {
    int val;
    GraphNode next;
    GraphNode[] neighbors;
    boolean visited;
    int kruskalGroup;

    GraphNode(int x) {
        val = x;
        kruskalGroup = 0;
    }

    GraphNode(int x, GraphNode[] n){
        val = x;
        neighbors = n;
        kruskalGroup = 0;
    }

    @Override
    public String toString(){
        return "µã "+ this.val;
    }
}
