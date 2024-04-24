package datastr;

public class MyBST <Ttype>{

    private MyTreeNode root = null;
    private int counter = 0;


    public boolean isEmpty(){
        return (counter == 0);

    }

    public int HowManyElements(){
        return  counter;
    }

    public void insert(Ttype element)throws Exception{
        if(element == null){
            throw new Exception("Input has a mistake");
        }

        if(isEmpty()){
            root = new MyTreeNode<>(element);
            counter++;
        }else{

            insetHelpRecursive(root,element);

        }


    }
    private void insetHelpRecursive(MyTreeNode tempNode, Ttype element) throws Exception{

        //apakskoka sakne ir lielaks par elementu
        if(((Comparable) tempNode.getElement()).compareTo(element) == 1 ){

            if(tempNode.getLeft() == null){
                MyTreeNode newNode = new MyTreeNode<>(element);
                tempNode.setLeft(newNode);
            }else{
                insetHelpRecursive(tempNode.getLeft(),element);
            }
        } else if(((Comparable) tempNode.getElement()).compareTo(element) == -1){

            if(tempNode.getRight() == null){
                MyTreeNode newNode = new MyTreeNode<>(element);
                tempNode.setRight(newNode);
            }
            else{
                insetHelpRecursive(tempNode.getRight(),element);
            }


        }else{
            throw new Exception("ELEMENT ALREADY EXISTS");
        }

    }


}
