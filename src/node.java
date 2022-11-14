public class node {

    private int data;
    private int leftNode;
    private int RightNode;

    public node(int data, int leftNode, int rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        RightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(int leftNode) {
        this.leftNode = leftNode;
    }

    public int getRightNode() {
        return RightNode;
    }

    public void setRightNode(int rightNode) {
        RightNode = rightNode;
    }
}
