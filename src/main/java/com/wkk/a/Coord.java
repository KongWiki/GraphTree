package com.wkk.a;

/**
 * @Time: 20-3-21上午12:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Coord {
    /**
     * 坐标原点在左上角 所以y是高 x是宽
     * y向下递增 x向右递增
     * 将x和y封装成一个类 方便传参
     * 重写equals方法比较坐标(x,y)是不是同一个。
     */
    public int x;
    public int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Coord) {
            Coord c = (Coord) obj;
            return x == c.x && y == c.y;
        }
        return false;
    }
}
