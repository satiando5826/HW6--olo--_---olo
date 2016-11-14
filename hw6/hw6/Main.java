package hw6;

public class Main {

    public static BSTree generateTree1(){
        int[] keyList = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        BSTree tree = new BSTree();
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        return tree;
    }
    public static void main(String[] args) {
        BSTree tree1 = new BSTree();
        int[] keyList = {3, 2, 5, 1, 4, 8, 7, 6};
        for (int i=0; i<keyList.length; i++)
            tree1.insert(keyList[i]);
        BSTree tree2 = new BSTree();
        keyList = new int[]{9, 11, 10};
        for (int i=0; i<keyList.length; i++)
            tree2.insert(keyList[i]);
        tree1.printTree();
        tree2.printTree();

        tree1.merge(tree2);
        tree1.printTree();
    }
}
