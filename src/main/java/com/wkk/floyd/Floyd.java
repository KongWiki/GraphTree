package com.wkk.floyd;

/**
 * @Time: 2020/6/5上午1:47
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Floyd {
    static int max = 66666;// 别Intege.max 两个相加越界为负
    public static void main(String[] args) {
        int dist[][] = {
                { 0, 2, 3, 6, max, max },
                { 2, 0, max, max,4, 6 },
                { 3, max, 0, 2, max, max },
                { 6, max, 2, 0, 1, 3 },
                { max, 4, max, 1, 0, max },
                { max, 6, max, 3, max, 0 } };// 地图
        // 6个
        int n = 6;
        int[][] path = new int[6][6];
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int tmp = dist[i][j];
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    if(tmp != dist[i][j]){
                        path[i][j] = k;
                    }
                }
            }
        }


        // 输出
        for (int i = 0; i < 6; i++) {
            System.out.print("节点"+(i+1)+" 的最短路径");
            for (int j = 0; j < 6; j++) {
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }

        String path1 = getPath(path, 0, 5);
        System.out.println(path1);
    }

    public static String getPath(int[][] path, int i, int j) {
        if (path[i][j] == 0) {
            return " "+i+" "+j;
        } else {
            int k = path[i][j];
            return getPath(path, i, k)+" "+getPath(path, k, j)+" ";
        }
    }
}
