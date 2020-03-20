package com.wkk.utils;

import com.wkk.graph.LGraph;
import com.wkk.utils.impl.Search;
import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * @Time: 20-3-20下午12:27
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class SearchTest {
    @Test
    public void all(){
        URL resource = this.getClass().getResource("/tinyG.txt");
        File file = new File(resource.getFile());
        In in = new In(file);
        LGraph graph = new LGraph(in);
        int s = 0;
        Search search = new Search(graph, s);
        for (int i = 0; i < graph.V(); i++) {
            if(search.marked(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if(search.count() != graph.V()){
            System.out.println("NOT");
        }
        System.out.println("不连通");

    }
}
