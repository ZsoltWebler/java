package org.webler.zsolt;

import org.webler.zsolt.collections.ITreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> implements ITreeNode<T> {

    private T value;
    private ITreeNode<T> parent;
    private List<ITreeNode<T>> children;

    public TreeNode(T value, ITreeNode<T> parent) {
        this.value = value;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public TreeNode(T value) {
        this(value, null);
    }

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public ITreeNode<T> getParent() {
        return this.parent;
    }

    @Override
    public List<ITreeNode<T>> getChildren() {
        return this.children;
    }

    @Override
    public boolean isRoot() {
        return this.parent == null;
    }

    @Override
    public boolean isLeaf() {
        return this.children.isEmpty();
    }

    @Override
    public void addChild(ITreeNode<T> childNode) {
        this.children.add(childNode);
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public void removeParent() {
        this.parent = null;
    }

    @Override
    public void printTree() {

    }
}
