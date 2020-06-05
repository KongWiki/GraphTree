package com.wkk.floyd;

/**
 * @Time: 2020/6/5上午10:55
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Queue {
    GraphNode first, last;

    public void enqueue(GraphNode n){
        if(first == null){
            first = n;
            last = first;
        }else{
            last.next = n;
            last = n;
        }
    }

    public GraphNode dequeue(){
        if(first == null){
            return null;
        }else{
            GraphNode temp = new GraphNode(first.val, first.neighbors);
            first = first.next;
            return temp;
        }
    }
}
