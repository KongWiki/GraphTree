package com.wkk.utils;

import com.wkk.graph.LGraph;

/**
 * @Time: 20-3-20下午2:53
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class DFS {
    private boolean[] marked;
    private int count;
    public DFS(LGraph graph, int v){
        marked = new boolean[graph.V()];
        dfs(graph, v);
    }

    public void  dfs(LGraph graph, int v){
        marked[v] = true;
        count++;
        for (Integer w : graph.adj(v)) {
            if(!marked[w]){
                dfs(graph, w);
            }

        }
    }

    public boolean marked(int w){
        return marked[w];
    }
    public int count(){
        return count;
    }
}
