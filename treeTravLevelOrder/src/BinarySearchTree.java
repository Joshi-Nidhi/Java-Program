
import java.util.LinkedList;
import java.util.Queue;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package treetravlevelorder;
//
///**
// *
// * @author nidhi
// */
//public class TreeTravLevelOrder
//{
//    /* Driver program to test above functions */
//    public static void main(String args[])
//    {
//       BinaryTree tree = new BinaryTree();
//       tree.root= new Node(1);
//       tree.root.left= new Node(2);
//       tree.root.right= new Node(3);
//       tree.root.left.left= new Node(4);
//       tree.root.left.right= new Node(5);
//        
//       System.out.println("Level order traversal of binary tree is ");
//       tree.printLevelOrder();
//    }
//}
//    
//

public class BinarySearchTree {
	public static  Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	
	public boolean find(int id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}

	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String arg[]){
		BinarySearchTree b = new BinarySearchTree();
                
                Queue q= new LinkedList();
                
		b.insert(1);b.insert(2);
		b.insert(1);b.insert(2);b.insert(1);b.insert(2);b.insert(3);b.insert(1);
		b.insert(2);b.insert(1);b.insert(2);b.insert(3);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
//		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
//		b.display(root);
//		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
//		b.display(root);
//		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
//		b.display(root);
	}
}

class Node{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
