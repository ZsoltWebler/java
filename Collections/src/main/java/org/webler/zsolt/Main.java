package org.webler.zsolt;

import org.webler.zsolt.collections.IMatrix2D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        TreeNode<String> tree = new TreeNode<>("Szülő");
        tree.addChild(new TreeNode<>("Gyerek_1",tree));
        tree.addChild(new TreeNode<>("Gyerek_2",tree));
        tree.addChild(new TreeNode<>("Gyerek_3",tree));





        System.out.println();


    }
}