package com.wkk.genrate;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.*;
/**
 * @Time: 20-3-6上午11:05
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Example {

    public static void main(String[] args) throws IOException {
//        Graph g = graph("example").directed()
//                // 图的方向 从左到右
//                .graphAttr().with(Rank.dir(Rank.RankDir.LEFT_TO_RIGHT))
//                .with(
//                        // 设置节点与边 以及着色问题
//                        node("点1").with(Color.RED).link(node("点2")),
//                        node("点2").link(to(node("点3")).with(Style.DASHED))
//                );
//        Graphviz.fromGraph(g).height(100).render(Format.PNG).toFile(new File("generatePic.png"));

        MutableGraph g = mutGraph("example1").setDirected(true).add(
                mutNode("a").add(Color.RED).addLink(mutNode("b")));

        Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("ex1m.png"));


    }
}
