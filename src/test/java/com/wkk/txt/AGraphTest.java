package com.wkk.txt;

import com.wkk.graph.AGraph;
import org.junit.Test;

import java.util.List;

/**
 * @Time: 20-3-6上午11:43
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class AGraphTest {
    @Test
    public void AGraph(){
        int n=4,e=4;//分别代表结点个数和边的数目
        String labels[]={"V1","V1","V3","V4"};//结点的标识
        AGraph graph=new AGraph(n);
        for(String label:labels) {
            graph.insertVertex(label);//插入结点
        }
        //插入四条边
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(2, 3, 1);
        graph.insertEdge(3, 0, 1);

        System.out.println("结点个数是："+graph.getNumOfVertex());
        System.out.println("边的个数是："+graph.getNumOfEdges());
        int[][] edges = graph.getEdges();

        List<String> vertexCollection = graph.getVertexCollection();
        for (String s : vertexCollection) {
            System.out.println(s.charAt(1) + " " +s.charAt(3));
        }
    }
}
