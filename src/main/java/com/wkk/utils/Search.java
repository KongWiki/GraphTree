package com.wkk.utils;

import com.wkk.graph.LGraph;
import com.wkk.utils.GraphSearch;
import edu.princeton.cs.algs4.In;
import guru.nidi.graphviz.model.Graph;

/**
 * @Time: 20-3-20下午12:16
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Search {
    public LGraph graph;
    public int s;
    public Search(LGraph graph, int s){
        this.graph = graph;
        this.s = s;
    }

    public boolean marked(int v) {
        return false;
    }

    public int count() {
        return 0;
    }

    public static void main(String[] args) {
        LGraph G = new LGraph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        Search search = new Search(G, s);
        for (int i = 0; i < G.V(); i++) {
            if(search.marked(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if(search.count() != G.V()){
            System.out.println("NOT ");
        }
        System.out.println("connected");

    }
}
