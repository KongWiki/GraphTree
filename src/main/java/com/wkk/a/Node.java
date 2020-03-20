package com.wkk.a;

/**
 * @Time: 20-3-21上午12:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Node implements Comparable<Node> {
    // 坐标
    public Coord coord;
    // 父结点
    public Node parent;
    // G：是个准确的值，是起点到当前结点的代价
    public int G;
    // H：是个估值，当前结点到目的结点的估计代价
    public int H;

    public Node(int x, int y) {
        this.coord = new Coord(x, y);
    }

    public Node(Coord coord, Node parent, int g, int h) {
        this.coord = coord;
        this.parent = parent;
        G = g;
        H = h;
    }


    public int compareTo(Node o) {
        if (o == null) {
            return -1;
        }
        if (G + H > o.G + o.H) {
            return 1;
        } else if (G + H < o.G + o.H) {
            return -1;
        }
        return 0;
    }

}
