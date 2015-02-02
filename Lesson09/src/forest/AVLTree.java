package forest;

import java.util.List;

public class AVLTree implements Treeish {

    private ValueContainer top = new TreeNode(null, null);

    public AVLTree() {}

    @Override
    public void add(Integer value) {
        if (value == null) return;
        if (top.isEmpty()) {
            top.setValue(value);
            return;
        }

        // search for an empty node
        ValueContainer treeNode = getTreeNode(value, top);
        // if the tree already contains the value
        if (!treeNode.isEmpty()) return;
        // set the value
        treeNode.setValue(value);
        // update heights
        updateHeights(treeNode.getParent());
    }

    @Override
    public void remove(Integer value) {
        if (value == null) return;

        // search the node to delete
        ValueContainer nodeToDelete = getTreeNode(value, top);
        if (nodeToDelete.isEmpty()) return;

        // search a MAX value in the left subtree
        ValueContainer nodeToCopy = getTreeNode(nodeToDelete.getValue(), nodeToDelete.getLeft()).getParent();

        // *** CASES ***
        if (nodeToCopy == nodeToDelete && nodeToDelete.getParent() == null) {
            // *** BORDERLINE CASE:
            // left leaf is empty (nodeToCopy == nodeToDelete),
            // right leaf is NOT empty
            // and the nodeToDelete is a top
            // ***

            setTop(nodeToDelete.getRight());
//            nodeToDelete = null;

        } else if (nodeToCopy == nodeToDelete && !nodeToCopy.getRight().isEmpty()) {
            // *** BORDERLINE CASE:
            // left leaf is empty (nodeToCopy == nodeToDelete),
            // right leaf is NOT empty
            // ***

            // copy a value from the right leaf
            nodeToDelete.setValue(nodeToDelete.getRight().getValue());
            // delete right leaf
            nodeToDelete.getRight().setValue(null);
            updateHeights(nodeToDelete);

        } else if (nodeToCopy == nodeToDelete) {
            // *** BORDERLINE CASE:
            // nodeToDelete is a leaf
            // ***

            nodeToDelete.setValue(null);
            updateHeights(nodeToDelete.getParent());

        } else {
            // copy a MAX value from the left tree
            nodeToDelete.setValue(nodeToCopy.getValue());

            if (nodeToCopy == nodeToDelete.getLeft()) {
                // *** BORDERLINE CASE:
                // the nodeToCopy is on the left of the nodeToDelete
                // ***
                nodeToDelete.setLeft(nodeToCopy.getLeft());
            } else {
                // save a left node of the nodeToCopy (if it is not empty)
                nodeToCopy.getParent().setRight(nodeToCopy.getLeft());
            }

            updateHeights(nodeToCopy.getLeft());
//            nodeToCopy = null;
        }
    }

    @Override
    public boolean contains(Integer value) {
        return value != null && !getTreeNode(value, top).isEmpty();
    }

    // TEST METHODS
    @Override
    public ValueContainer getTop() {
        return top;
    }

    @Override
    public List<ValueContainer> asList() {
        return top.asList();
    }

    @Override
    public void updateAllHeights() {
        if (top == null || top.isEmpty()) return;
        updateAllHeights(top);
        // *** как реализовать рекурсивное к обращение к treeNode? ***
//        ValueContainer treeNode = top;
//        if (!treeNode.getLeft().isEmpty()) {
//            treeNode = treeNode.getLeft();
//        }
//        if (!treeNode.getRight().isEmpty()) {
//            treeNode = treeNode.getRight();
//        }
//        treeNode.updateHeight();
    }



    // *** Private methods ***

    private void updateAllHeights(ValueContainer treeNode) {
        if (!treeNode.getLeft().isEmpty()) {
            updateAllHeights(treeNode.getLeft());
        }
        if (!treeNode.getRight().isEmpty()) {
            updateAllHeights(treeNode.getRight());
        }
        treeNode.updateHeight();
    }

    private ValueContainer getTreeNode(int value, ValueContainer parent) {
        while (!parent.isEmpty()) {
            if (value < parent.getValue()) {
                parent = parent.getLeft();
            } else if (value == parent.getValue()) {
                return parent;
            } else {
                parent = parent.getRight();
            }
        }
        return parent;
    }

    /**
     * Method updates heights and check if a rotate is needed
     * @param treeNode is a low level {@code ValueContainer}
     */
    private void updateHeights(ValueContainer treeNode) {
        while (treeNode != null) {
            treeNode.updateHeight();
//            int bFactor = treeNode.balanceFactor();
            if (treeNode.balanceFactor() > 1) {
                if (treeNode.getRight().balanceFactor() >= 0) {
                    singleRotateLeft(treeNode);
                } else {
                    singleRotateRight(treeNode.getRight());
                    singleRotateLeft(treeNode);
                }
                return;
            } else if (treeNode.balanceFactor() < -1) {
                if (treeNode.getLeft().balanceFactor() <= 0) {
                    singleRotateRight(treeNode);
                } else {
                    singleRotateLeft(treeNode.getLeft());
                    singleRotateRight(treeNode);
                }
                return;
            }
            treeNode = treeNode.getParent();
        }
    }

    private void setTop(ValueContainer treeNode) {
        treeNode.setParent(null);
        this.top = treeNode;
    }

    private void singleRotateRight(ValueContainer treeNode) {
        // get the treeNode parent
        ValueContainer treeNodeParent = treeNode.getParent();
        // is treeNode a left
        boolean treeNodeIsLeft = treeNode.isLeft();
        //get a leftNode of the treeNode
        ValueContainer leftNode = treeNode.getLeft();
        // set the "Left-Right" node as the left of the treeNode
        treeNode.setLeft(leftNode.getRight());
        // set the treeNode as the Right of the leftNode
        leftNode.setRight(treeNode);
        // link parent to leftNode
        if (treeNodeParent != null) {
            if (treeNodeIsLeft) {
                treeNodeParent.setLeft(leftNode);
            } else {
                treeNodeParent.setRight(leftNode);
            }
        } else {
            setTop(leftNode);
        }
        // update the height
        treeNode.updateHeight();
        leftNode.updateHeight();
//        treeNode.setHeight(treeNode.getHeight() - 2);
    }

    private void singleRotateLeft(ValueContainer treeNode) {
        // get the treeNode parent
        ValueContainer treeNodeParent = treeNode.getParent();
        // is the treeNode a left?
        boolean treeNodeIsLeft = treeNode.isLeft();
        // get a rightNode of the treeNode
        ValueContainer rightNode = treeNode.getRight();
        // set the "Right-Left" node as the right of treeNode
        treeNode.setRight(rightNode.getLeft());
        // set the treeNode as the Left of the rightNode
        rightNode.setLeft(treeNode);
        // link parent to rightNode
        if (treeNodeParent != null) {
            if (treeNodeIsLeft) {
                treeNodeParent.setLeft(rightNode);
            } else {
                treeNodeParent.setRight(rightNode);
            }
        } else {
            setTop(rightNode);
        }
        // update the height
        treeNode.updateHeight();
        rightNode.updateHeight();
    }

}
