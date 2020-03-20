package com.wkk.a;

/**
 * @Time: 20-3-21上午12:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (obj instanceof Coord)
        {
            Coord c = (Coord) obj;
            return x == c.x && y == c.y;
        }
        return false;
    }
}
