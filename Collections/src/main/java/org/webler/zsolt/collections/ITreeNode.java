package org.webler.zsolt.collections;

import java.util.List;

public interface ITreeNode<T> {

    T getValue();
    ITreeNode<T> getParent();
    List<ITreeNode<T>> getChildren();

    boolean isRoot();
    boolean isLeaf();

    void addChild(ITreeNode<T> childNode);
    void setValue(T value);
    void removeParent();

    void printTree();

}
