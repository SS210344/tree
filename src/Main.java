
// java code for above approach
import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Number of nodes
        int N = 8, Root = 1;
        ArrayList<node> tree = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }



        tree = CreateBinTree(numbers,tree);
        for (int i = 0; i < tree.size(); i++) {
            System.out.println("node:"+tree.get(i).getData());
            System.out.println("left child:"+tree.get(i).getLeftNode());
            System.out.println("right child:"+tree.get(i).getRightNode());
        }

        // Adjacency list to store the tree
    }



    public static  ArrayList<node> CreateBinTree(ArrayList<Integer> Numbers,ArrayList<node> tree) {
        int Root = Numbers.get(0);
        node temp = new node(Root, 0, 0);
        tree.add(temp);
        int comparisons = Numbers.get(0);
        for (int i = 1; i < Numbers.size(); i++) {
            while (true) {
                if (Numbers.get(i) >= comparisons) {
                    for (int j = 0; j < tree.size(); j++) {
                        if (tree.get(j).getData() == comparisons) {
                            int rightNode = tree.get(j).getRightNode();
                            if (rightNode == 0) {
                                tree.get(j).setRightNode(Numbers.get(i));
                                tree.add(new node(Numbers.get(i), 0, 0));
                                break;
                            } else {
                                comparisons = rightNode;
                            }
                        }
                    }
                    break;

                } else {
                    for (int j = 0; j < tree.size(); j++) {
                        if (tree.get(j).getData() == comparisons) {
                            int leftNode = tree.get(j).getLeftNode();
                            if (leftNode == 0) {
                                tree.get(j).setLeftNode(Numbers.get(i));
                                tree.add(new node(Numbers.get(i), 0, 0));
                                break;
                            } else {
                                comparisons = leftNode;
                            }
                        }
                    }
                }
                break;
            }




        }
        return tree;
    }

}


