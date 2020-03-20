package com.wkk.graph;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

/**
 * @Time: 20-3-20上午11:52
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class LGraph {
    /**
     * 无向图邻接矩阵的存储方式
     */
    // 顶点数
    private final int V;
    // 边
    private int E;
    // 邻接表
    private Bag<Integer>[] adj;


    public LGraph(int V) {
        this.V = V;
        this.E = 0;
        // 创建邻接表
        adj = (Bag<Integer>[]) new Bag[V];
        // 将所有链表初始化为空
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public LGraph(In in) {
        // 读取V 并将图初始化
        this(in.readInt());
        // 读取E
        int E = in.readInt();
        for (int i = 0; i < E; i++) {
            // 读取一个顶点
            int v = in.readInt();
            // 读取另一个顶点
            int w = in.readInt();
            // 添加一条连接他们的边
            addEdge(v, w);
        }
    }

    public int E() {
        return E;
    }

    public int V() {
        return V;
    }

    public void addEdge(int v, int w) {
        // 将w添加到v的链表中
        adj[v].add(w);
        // 将v添加到w的链表中
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + "个顶点 " + E + "条边" + "\n");
        for (int v = 0; v < V; v++) {
            s.append(v + " : ");
            for (int w : this.adj(v)) {
                s.append(w + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
