package com.wkk.utils;

import com.wkk.graph.LGraph;

/**
 * @Time: 20-3-20下午12:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface GraphSearch {
    // 找到和起点 s 连通的所有顶点
    void search(LGraph graph, int s);
    // v 和 s 是连通的吗
    boolean marked(int v);
    // 与s联通的所有顶点
    int count();

}
