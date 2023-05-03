package homework16Tree;

public class Main {
    public static void main(String[] args) {
        Tree root =
                new Tree(100,
                        new Tree(50,
                                new Tree(25, null, new Tree(20)), new Tree(5)),
                        new Tree(50,
                                new Tree(40, new Tree(30), new Tree(20)),
                                new Tree(10)));

        System.out.println("Tree Number: " + root.treeSum());

    }

    static class Tree{
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value){
            this.value = value;
        }

        public int treeSum() {
            int summ = value;

            if (left != null ) {
                summ += left.treeSum();
            }
            if (right != null ) {
                summ += right.treeSum();
            }
            return summ;
        }

    }

}


