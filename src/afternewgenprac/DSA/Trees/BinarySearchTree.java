package afternewgenprac.DSA.Trees;

import java.util.*;

public class BinarySearchTree {
    tree.TreeNode root;

    static class Pair{
        int level;
        tree.TreeNode next;

        public int getLevel() {
            return level;
        }

        public tree.TreeNode getNext() {
            return next;
        }

        public Pair(int level, tree.TreeNode next) {
            this.level = level;
            this.next = next;
        }
    }


    public void insert(int value) {
//        root = RecursiveInsert(root, value);
        root = IterativeInsert(root, value);
    }

    public tree.TreeNode RecursiveInsert(tree.TreeNode root, int data) {
        if (root == null) {
            return new tree.TreeNode(data);
        }
        if (root.data > data) {
            root.left = RecursiveInsert(root.left, data);
        } else {
            root.right = RecursiveInsert(root.right, data);
        }
        return root; // Returning root because we have to give the head of the Tree (Root) to get it printed using any transversal,
        // and as we are assigning root in the above insert function, hence if we give newNode(data) in return it will update the root value
        // and in the next transversal only the latest added data will be printed.
    }

    public tree.TreeNode IterativeInsert(tree.TreeNode root, int data) {
        tree.TreeNode newNode = new tree.TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }
        tree.TreeNode current = root;
        tree.TreeNode parent = root;
        while (current != null) {
            parent = current;
            if (current.data > data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (parent.data > data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return root;

    }

    public void RecursiveInOrder(tree.TreeNode root) {
        if (root == null) return;
        RecursiveInOrder(root.left);
        System.out.print(root.data + " ");
        RecursiveInOrder(root.right);
    }

    public void IterativeLevelOrder(tree.TreeNode root) {
        if (root == null) return;
        Queue<tree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            tree.TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public tree.TreeNode RecursiveSearchInBinarySearchTree(tree.TreeNode root, int value) {
        if (root == null) return null;
        if (root.data == value) {
            return root;
        } else if (root.data > value) {
            return RecursiveSearchInBinarySearchTree(root.left, value);
        } else {
            return RecursiveSearchInBinarySearchTree(root.right, value);
        }
    }

    public tree.TreeNode IterativeSearchInBinarySearchTree(tree.TreeNode root, int value) {
        if (root == null) return null;
        tree.TreeNode current = root;
        while (current != null) {
            if(current.data == value) {
                return current;
            }else if(current.data > value) {
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return null;
    }

    public boolean ValidateBinarySearchTree(tree.TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Important question -> For LeetCode use Long as it is using value greater than intMax in the root element.
    public boolean isValidBST(tree.TreeNode root, int min, int max) {
        if(root == null) return true;
        if(root.data <=min ||root.data>=max){
            return false;
        }
        boolean left = isValidBST(root.left,min,root.data);
        boolean right = false;
        if(left) {
            right = isValidBST(root.right, root.data, max);
        }
        return right;
    }

    public void leftView(tree.TreeNode root) {
        List<Integer> returnList = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            tree.TreeNode current = p.next;
            if(current != null) {
                map.putIfAbsent(p.getLevel(),new ArrayList<>());
                map.get(p.getLevel()).add(current.data);
                if(current.left != null) {
                    queue.offer(new Pair(p.getLevel()+1,current.left));
                }
                if(current.right != null) {
                    queue.offer(new Pair(p.getLevel()+1,current.right));
                }
            }
        }

        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            List<Integer> currLevel = entry.getValue();
            if(!currLevel.isEmpty()) {
                returnList.add(currLevel.getFirst());
            }
        }
        System.out.print(returnList);
    }

    public void rightView(tree.TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        ArrayList<Integer> returnList = new ArrayList<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            tree.TreeNode current = p.next;
            if(current != null) {
                map.putIfAbsent(p.getLevel(),new ArrayList<>());
                map.get(p.getLevel()).add(current.data);
                if(current.left != null) {
                    queue.add(new Pair(p.getLevel()+1,current.left));
                }
                if(current.right != null) {
                    queue.add(new Pair(p.getLevel()+1,current.right));
                }
            }
        }

        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            List<Integer> currentList = entry.getValue();
            if(!currentList.isEmpty()) {
                returnList.add(currentList.getLast());
            }
        }
        System.out.println(returnList);
    }

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        tree tree = new tree();
        tree.createTree();
        bt.insert(3);
        bt.insert(2);
        bt.insert(1);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.IterativeLevelOrder(bt.root);
        System.out.println();
//        TreeNode foundNode = bt.IterativeSearchInBinarySearchTree(bt.root, 4);
//        if (foundNode == null) {
//            System.out.print("null");
//        } else {
//            bt.IterativeLevelOrder(foundNode);
//        }
//        System.out.println(bt.ValidateBinarySearchTree(bt.root));
//        bt.leftView(bt.root);
        bt.rightView(bt.root);

    }

}
