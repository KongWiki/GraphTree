package com.wkk.utils;

import com.wkk.graph.LGraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * @Time: 20-3-20下午3:31
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class BFSTest {
    @Test
    public void all(){
        URL resource = this.getClass().getResource("/tinyCG.txt");
        File file = new File(resource.getFile());
        In in = new In(file);
        LGraph graph = new LGraph(in);
        int s = 0;
        BFS bfs = new BFS(graph, 0);
//        boolean b = bfs.hasPathTo(4);
        Iterable<Integer> integers = bfs.pathTo(4);
        for (int v = 0; v < graph.V(); v++) {
            if (bfs.hasPathTo(v)) {
                System.out.printf("%d to %d:  ", s, v);
                Stack<Integer> stack = bfs.pathTo(v);
                while (!stack.isEmpty()){
                    Integer top = stack.pop();
                    if(top == s){
                        System.out.print(s);
                    }
                    else {
                        System.out.print(" -> " + top);
                    }
                }
                System.out.println();
            }

            else {
                StdOut.printf("%d to %d:  not connected\n", s, v);
            }

        }


    }

}
