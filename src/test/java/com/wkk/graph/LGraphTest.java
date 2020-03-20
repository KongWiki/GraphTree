package com.wkk.graph;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import java.io.File;
import java.net.URL;


/**
 * @Time: 20-3-20下午12:24
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class LGraphTest {
    @Test
    public void all(){
        URL resource = this.getClass().getResource("/tinyG.txt");
        File file = new File(resource.getFile());
        In in = new In(file);
        LGraph g = new LGraph(in);
        System.out.println(g);
    }

}
