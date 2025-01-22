package afternewgenprac.DSA.Trees;

import java.util.*;

public class BinarySearchTree {
    TreeNode root;

    static class Pair{
        int level;
        TreeNode next;

        public int getLevel() {
            return level;
        }

        public TreeNode getNext() {
            return next;
        }

        public Pair(int level, TreeNode next) {
            this.level = level;
            this.next = next;
        }
    }

    public void insert(int value) {
//        root = RecursiveInsert(root, value);
        root = IterativeInsert(root, value);
    }

    public TreeNode RecursiveInsert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
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

    public TreeNode IterativeInsert(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }
        TreeNode current = root;
        TreeNode parent = root;
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

    public void RecursiveInOrder(TreeNode root) {
        if (root == null) return;
        RecursiveInOrder(root.left);
        System.out.print(root.data + " ");
        RecursiveInOrder(root.right);
    }

    public void IterativeLevelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public TreeNode RecursiveSearchInBinarySearchTree(TreeNode root, int value) {
        if (root == null) return null;
        if (root.data == value) {
            return root;
        } else if (root.data > value) {
            return RecursiveSearchInBinarySearchTree(root.left, value);
        } else {
            return RecursiveSearchInBinarySearchTree(root.right, value);
        }
    }

    public TreeNode IterativeSearchInBinarySearchTree(TreeNode root, int value) {
        if (root == null) return null;
        TreeNode current = root;
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

    public boolean ValidateBinarySearchTree(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Important question -> For LeetCode use Long as it is using value greater than intMax in the root element.
    public boolean isValidBST(TreeNode root, int min, int max) {
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

    public void leftView(TreeNode root) {
        List<Integer> returnList = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode current = p.next;
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

    public int RecursiveHeightOfATree(TreeNode root){
        if(root == null) return 0;
        int leftHeight = RecursiveHeightOfATree(root.left);
        int rightHeight = RecursiveHeightOfATree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    public void leftViewListCaller(TreeNode root) {
        List<TreeNode> leftViewList = new ArrayList<>();
            leftViewUsingList(root,0,leftViewList);
        for(TreeNode node : leftViewList) {
            System.out.print(node.data + " ");
        }
    }

    public void leftViewUsingList(TreeNode root,int level, List<TreeNode> leftViewList) {
        if(root == null) return;
        if(level == leftViewList.size()){
            leftViewList.add(root);
        }
        leftViewUsingList(root.left,level+1,leftViewList);
        leftViewUsingList(root.right,level+1,leftViewList);
    }

    public void rightViewListCaller(TreeNode root) {
        Map<Integer,TreeNode> rightViewMap =new HashMap<>();
        rightViewUsingMap(root,0,rightViewMap);
        for(TreeNode node : rightViewMap.values()) {
            System.out.print(node.data + " ");
        };
    }

    public void rightViewUsingMap(TreeNode root,int level,Map<Integer,TreeNode> rightViewMap ) {
        if(root == null) return;
        rightViewMap.put(level,root);
        rightViewUsingMap(root.left,level+1,rightViewMap);
        rightViewUsingMap(root.right,level+1,rightViewMap);
    }

    public void rightView(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        ArrayList<Integer> returnList = new ArrayList<>();
        queue.add(new Pair(0,root));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode current = p.next;
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

    public boolean isBalancedTreeCaller(TreeNode root) {
        int differenceValue = isBalancedTree(root);
        return differenceValue <= 1;
    }

    public int isBalancedTree(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = isBalancedTree(root.left);
        int rightHeight = isBalancedTree(root.right);
        return Math.abs(leftHeight - rightHeight) + 1 ;
    }

//    public TreeNode RemoveNode(TreeNode root, int val) {
//
//    }

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
        bt.insert(7);
//        bt.IterativeLevelOrder(bt.root);
//        System.out.println();
//        TreeNode foundNode = bt.IterativeSearchInBinarySearchTree(bt.root, 4);
//        if (foundNode == null) {
//            System.out.print("null");
//        } else {
//            bt.IterativeLevelOrder(foundNode);
//        }
//        System.out.println(bt.ValidateBinarySearchTree(bt.root));
//        bt.leftView(bt.root);
//        bt.rightView(bt.root);
//        System.out.println(bt.RecursiveHeightOfATree(bt.root));
//        bt.leftViewListCaller(bt.root);
//        System.out.println();
//        bt.rightViewListCaller(bt.root);
//        System.out.println();
        System.out.println(bt.isBalancedTreeCaller(bt.root));
    }

}
