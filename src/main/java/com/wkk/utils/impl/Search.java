package com.wkk.utils.impl;

import com.wkk.graph.LGraph;
import com.wkk.utils.GraphSearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * @Time: 20-3-20下午12:16
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Search implements GraphSearch {
    private WeightedQuickUnionUF uf;
    private int s; //  起点
    private int v; //  顶点总数

    public Search(LGraph g, int s){
        uf = new WeightedQuickUnionUF(g.V());
        this.s = s;
        this.v = g.V();

        for(int i=0; i<g.V(); i++){
            for(int w: g.adj(i)){
                uf.union(w, i);
            }
        }
    }

    public void search(LGraph graph, int s) {

    }

    public boolean marked(int v) {
        return uf.connected(v, s);
    }

    public int count() {
        int count = 0;
        for(int i = 0; i< v; i++){
            if(marked(i)){
                count ++;
            }
        }
        return count;
    }
}
