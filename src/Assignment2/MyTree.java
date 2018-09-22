package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class MyTree<E> implements Tree<E>{

	private TreeNode<E> tree_root;         		//class variable, defined EVERYWHERE!!!!!! MUAHAHAH
	
	public TreeNode<E> getRoot() {				//returns the tree_root if any nodes are given
		
		if (tree_root != null){
			return tree_root;
		}
		else 
			return tree_root;
	}
	public void setTreeRoot( TreeNode<E> node){	//sets node = tree_root
		node = tree_root;
	
	}
	public int size() {
												//calls the method size() from MyTreeNode
		return tree_root.size();  	
	}
	public int height() {						//returns the root of the tree from height() in MyTreeNode.
		return tree_root.height();
	}
	public List<TreeNode<E>> getPreOrder() {	//returns the root of the PreOrder() from MyTreeNode.
		return tree_root.getPreOrder();
	}
	public List<TreeNode<E>> getPostOrder() {   //calls PostOrder for the tree_root
		
		return tree_root.getPostOrder();
	}
	
	public void makeEmpty() {					//makes it Empty
		tree_root = null;
	} 
	public boolean isEmpty() {					//tree_root is equal to null
		return tree_root == null;	
	}
	public int height (TreeNode<E> node) {      //tree_root uses PreOrder, to check if they are there
		
		if(tree_root.getPreOrder().contains(node)){
			return node.height();
		}
		else
			return -1;
		
	}
	public int depth(TreeNode<E> node) {
	
		int nodecounter = 0;					//the depth method, has to iterate through several levels of the tree
	
		TreeNode<E> grandchild_of_node = null;	//we have out grandparent or ancestor of a node
		List<TreeNode<E>> firstkids = new ArrayList<TreeNode<E>>(); //the children of the node
		firstkids = tree_root.getChildren();	//is equal to the tree root
		
		for ( int i=0; i < firstkids.size(); i++){   
			if (firstkids.get(i).getPreOrder().contains(node)){
				grandchild_of_node = firstkids.get(i);

				for (int j=0; j < grandchild_of_node.size(); j++){
					if(node == grandchild_of_node.getChildren().get(j)){
						nodecounter += 1;
						return nodecounter;
					}
					else{
						return nodecounter -1;
					}
						
				}
			}
			else{
				return -1;
			}
		}
		return nodecounter;
		
	}
	public MyTree(TreeNode<E> node){
		tree_root = node;
	}

}
