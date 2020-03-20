package com.wkk.a;

/**
 * @Time: 20-3-21上午12:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class MapInfo {
    // 二维数组的地图
    public int[][] maps;
    //地图的宽
    public int width;
    // 地图的高
    public int hight;
    // 起始结点
    public Node start;
    // 最终结点
    public Node end;

    public MapInfo(int[][] maps, int width, int hight, Node start, Node end) {
        this.maps = maps;
        this.width = width;
        this.hight = hight;
        this.start = start;
        this.end = end;
    }
}
