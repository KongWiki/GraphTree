package com.wkk.utils;

import com.wkk.graph.LGraph;
import org.omg.CORBA.INTERNAL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Time: 20-3-20下午3:16
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class BFS {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BFS(LGraph graph, int s) {
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.s = s;
        bfs(graph, s);
    }

    private void bfs(LGraph graph, int s) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(s);
        marked[s] = true;
        while (!queue.isEmpty()){
            Integer v = queue.poll();
            for (Integer element : graph.adj(v)) {
                if(!marked[element]){
                    edgeTo[element] = v;
                    marked[element] = true;
                    queue.offer(element);
                }
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Stack<Integer> pathTo(int v){
        if (!hasPathTo(v)) {return null;}
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
}
