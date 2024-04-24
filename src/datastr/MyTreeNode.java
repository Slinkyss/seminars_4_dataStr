package datastr;

public class MyTreeNode <Ttype> {

    private Ttype element;
    private MyTreeNode parent = null;
    private MyTreeNode left = null;
    private MyTreeNode right = null;


    public Ttype getElement() {
        return element;
    }

    public void setElement(Ttype element) {
        if(element!=null){
            this.element = element;
        }else{
            this.element = null;
        }

    }

    public MyTreeNode getParent() {
        return parent;
    }

    public void setParent(MyTreeNode parent) {

        this.parent = parent;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode left) {
        this.left = left;
    }

    public MyTreeNode getRight() {
        return right;
    }

    public void setRight(MyTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return element.toString();
    }


    public MyTreeNode(Ttype element){
        setElement(element);
    }
}
