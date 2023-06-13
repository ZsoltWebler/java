package org.webler.zsolt.collections;

public interface IBinarySearchTreeNode<T extends Comparable<T>> {

    IBinarySearchTreeNode<T> getLeft();
    IBinarySearchTreeNode<T>getRight();
    IBinarySearchTreeNode<T> getParent();

    void setLeft(IBinarySearchTreeNode<T> leftChild);
    void setRight(IBinarySearchTreeNode<T> rightChild);
    void setParent(IBinarySearchTreeNode<T> parent);

    T getValue();

    boolean isLeaf();
    boolean isRoot();

}
