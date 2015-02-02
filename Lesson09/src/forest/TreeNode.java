package forest;

import java.util.ArrayList;
import java.util.List;

public class TreeNode implements ValueContainer {

    // variables
    private Integer value;
    private ValueContainer parent;
    private ValueContainer left;
    private ValueContainer right;
    private int height;

    // constructors
    public TreeNode(Integer value, ValueContainer parent) {
        this.setValue(value);
        this.parent = parent;
    }

    // methods
    @Override
    public String toString() {
        Integer value = this.getValue();
        return (value == null) ? "empty" : value.toString();
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
        // update the height and empty nodes
        if (value == null)  {
            height = 0;
            this.setLeft(null);
            this.setRight(null);
        } else {
            if (height >= 1) return;
            height = 1;
            this.setLeft(new TreeNode(null, this));
            this.setRight(new TreeNode(null, this));
        }
    }

    @Override
    public ValueContainer getParent() {
        return parent;
    }

    @Override
    public void setParent(ValueContainer parent) {
        this.parent = parent;
    }

    @Override
    public ValueContainer getLeft() {
        return left;
    }

    @Override
    public void setLeft(ValueContainer left) {
        this.left = left;
        if (left != null) left.setParent(this);
    }

    @Override
    public ValueContainer getRight() {
        return right;
    }

    @Override
    public void setRight(ValueContainer right) {
        this.right = right;
        if (right != null) right.setParent(this);
    }

    @Override
    public int getHeight() {
        return height;
    }

//    @Override
//    public void setHeight(int height) {
//        this.height = height;
//    }

    @Override
    public boolean isBalanced() {
        return (balanceFactor() >= -1) && (balanceFactor() <= 1);
    }

    @Override
    public boolean isEmpty() {
        return (value == null);
    }

    @Override
    public boolean isLeft() {
        return (parent != null) && (value != null) && value < parent.getValue();
    }

    @Override
    public int getLeftHeight() {
        return (left == null) ? -1 : left.getHeight();
    }

    @Override
    public int getRightHeight() {
        return (right == null) ? -1 : right.getHeight();
    }

    @Override
    public List<ValueContainer> asList() {
        List<ValueContainer> list = new ArrayList<>();
        if (this.isEmpty()) return list;//null;
        asList(list, this);
        // ***********************************
//        List<ValueContainer> list = new ArrayList<>();
//        if (!this.getLeft().isEmpty()) {
//            list.addAll(this.getLeft().asList());
//        }
//        list.add(this);
//        if (!this.getRight().isEmpty()) {
//            list.addAll(this.getRight().asList());
//        }
        // ***********************************
        return list;
    }

    @Override
    public int balanceFactor() {
        return this.getRightHeight() - this.getLeftHeight();
    }

    @Override
    public void updateHeight() {
//        height = (Math.max(this.getRightHeight(), this.getLeftHeight()) + 1);
        height = this.getRightHeight() > this.getLeftHeight() ? this.getRightHeight() + 1 : this.getLeftHeight() + 1;
    }



    // *** Private methods ***

    private void asList(List<ValueContainer> list, ValueContainer treeNode) {
        if (!treeNode.getLeft().isEmpty()) {
            asList(list, treeNode.getLeft());
        }
        list.add(treeNode);
        if (!treeNode.getRight().isEmpty()) {
            asList(list, treeNode.getRight());
        }
    }

}
