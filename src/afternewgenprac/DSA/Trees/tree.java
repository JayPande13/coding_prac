package afternewgenprac.DSA.Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {
    TreeNode root;
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        TreeNode eight = new TreeNode(8);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left =sixth;
        third.right = seventh;
        sixth.right=eight;

    }

    public void RecursivePreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        RecursivePreOrder(root.left);
        RecursivePreOrder(root.right);
    }

    public void IterativePreOrder(TreeNode root){ // T->L->R
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            System.out.print(currNode.data + " ");
            if(currNode.right !=null){
                stack.push(currNode.right);
            }
            if(currNode.left !=null){
                stack.push(currNode.left);
            }
        }
    }

    public void RecursiveInOrder(TreeNode root){ // L->T->R
        if(root == null) return;
        RecursiveInOrder(root.left);
        System.out.print(root.data + " f");
        RecursiveInOrder(root.right);
    }

    public void IterativeInOrder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;
        while(!stack.isEmpty() || currNode !=null ){
            if(currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }else{
                currNode = stack.pop();
                System.out.print(currNode.data + " ");
                currNode = currNode.right;
            }

        }
    }

    public void RecursivePostOrder(TreeNode root){ // L->R->T
        if(root == null) return;
        RecursivePostOrder(root.left);
        RecursivePostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void IterativePostOrder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;
        while(!stack.isEmpty() || currNode !=null ){
            if(currNode != null){
                stack.push(currNode);
                currNode = currNode.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp ==stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }else{
                    currNode = temp;
                }
            }


        }
    }

    public void IterativeLevelOrder(TreeNode root){ // Root level -> Root Child level -> Root Child's Child level
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            System.out.print(currNode.data + " ");
            if(currNode.left !=null){
                queue.offer(currNode.left);
            }
            if(currNode.right !=null){
                queue.offer(currNode.right);
            }
        }
    }

    public void IterativeMaximumValueInABinaryTree(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            if(currNode.data > max){
                max = currNode.data;
            }
            if(currNode.left !=null){
                queue.offer(currNode.left);
            }
            if(currNode.right !=null){
                queue.offer(currNode.right);
            }
        }
        System.out.println(max);
    }

    public int RecursiveMaximumValueInABinaryTree(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int leftMax = RecursiveMaximumValueInABinaryTree(root.left);
        leftMax = Math.max(root.data, leftMax);
        int rightMax = RecursiveMaximumValueInABinaryTree(root.right);
        return Math.max(leftMax, rightMax);
    }




    public static void main(String[] args) {
        tree tree = new tree();
        tree.createTree();
//        tree.RecursivePreOrder(tree.root);
//        tree.IterativePreOrder(tree.root);
//        tree.RecursiveInOrder(tree.root);
//        tree.IterativeInOrder(tree.root);
//        tree.RecursivePostOrder(tree.root);
//        tree.IterativePostOrder(tree.root);
//        tree.IterativeLevelOrder(tree.root);
//        tree.IterativeMaximumValueInABinaryTree(tree.root);
//        System.out.println(tree.RecursiveMaximumValueInABinaryTree(tree.root));
    }


}
