package org.webler.zsolt.collections;

public abstract class BinarySearchTree<T extends Comparable<T>> {

    public abstract IBinarySearchTreeNode<T> getRoot();
    public abstract void addNode(IBinarySearchTreeNode<T> node);

    public abstract boolean containsNode(IBinarySearchTreeNode<T> node);


    public abstract void printTree();



}
