package forest;

import java.util.List;

public interface ValueContainer {
    Integer getValue();

    ValueContainer getParent();

    ValueContainer getLeft();

    int getHeight();

    int getLeftHeight();

    int getRightHeight();

    boolean isBalanced();

    boolean isEmpty();

    /**
     * @return является ли вершина левой для совего родителя
     */
    boolean isLeft();

    List<ValueContainer> asList();


    // TreeNode methods

    void setValue(Integer value);

    void setParent(ValueContainer treeNode);

    void setLeft(ValueContainer valueContainer);

    void setRight(ValueContainer valueContainer);

    ValueContainer getRight();

    //void setHeight(int i);

    void updateHeight();

    int balanceFactor();

}
