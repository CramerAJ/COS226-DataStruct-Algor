package Assignment2;

import java.lang.reflect.Array;
import java.util.Collections;    //had to import this for finding the max integer in the Array Height.
import java.util.List;
import java.util.ArrayList;

public class MyTreeNode<E> implements TreeNode<E> {

	private E elem;
	private TreeNode<E> left_child;
	private TreeNode<E> right_sibling;
	
	//had these originally but never really used them, just wanted to leave them there in case
	//I needed to go back to my original method.
	
	public E getElement() {
		//private E elem;
		return elem;												//returning an element
	} 
	
	public void setElement(E el) {
		elem = el;													//elem equals el
	}
	
	public void setChild(TreeNode<E> child) {
		this.left_child = child;                   //replaces to the 
	}
	
	public TreeNode<E> getFirstChild() {

		/*while(left_child != null && right_sibling != null ){	
		 }*/
		return left_child;
	}
	
	public List<TreeNode<E>> getChildren() {
		
		List<TreeNode<E>> children = new ArrayList<TreeNode<E>>();     //an Arraylist for the nodes to be inserted in
		TreeNode<E> next_child_node = getFirstChild();				   //children/nodes that 
		children.add(left_child);									   //gets the node on the left side
		
		while(next_child_node !=null){								   //while loop the node is there or isn't equal to zero
																	   //the node its on will be added to the arraylist.
			children.add(next_child_node);							   //goes to the next sibling, or the right child	
			next_child_node = getNextSibling();
		}
		return children;											   //returns the ArrayList
	}
	public void setNextSibling(TreeNode<E> sibling) {					//sibling is the right child
		sibling = right_sibling;
	}
	public TreeNode<E> getNextSibling() {								//returns the right child
		return right_sibling;
	}
	public int size() {	
			
		int tree_size_nodes = 0;										//has the size of the tree equal to 0
		
		for(int i = 0; getChildren().size() > i;i++){					//does a for loop, since a while loop wouldn't be able to 
																		//increment and keep track of the number of nodes it has passed
			while(getChildren().size() != 0){
				tree_size_nodes += 1;									//for every node found it adds it to the int
				tree_size_nodes = getChildren().size();					//gets the size and returns it to the while loop
			}
		}
		return tree_size_nodes;
	}
	public int height() {
			
		int current_nodeheight;											//has the current_
		List<Integer> height = new ArrayList<Integer>();				//new ArrayList for height
		
		if (getFirstChild()!=null){										//if there is a FirstChild, it will do the for loop
			for( int i = 0 ; i < getChildren().size() ; i++){
				
				current_nodeheight = getChildren().get(i).height();		//gets the int number from the for loop, and the height 
				height.add(current_nodeheight);							//addes the node to the height array list
			}
			return Collections.max(height) - 1;
		}
		else{
			return 0;
		}
		
	}
	public List<TreeNode<E>> getPreOrder() {
		
		List<TreeNode<E>> preorder_tree = new ArrayList<TreeNode<E>>();
		preorder_tree.add(this);											//added the root straight in, rather
		TreeNode<E> sibling = right_sibling;								//added the array lsit first, so it is empty
		if(sibling != null){												//if there is a sibling
			for(int i = 0; getChildren().size() > i; i++ ){					//then adds them in from for loop
				preorder_tree.addAll(getChildren().get(i).getPreOrder());
			}
			return preorder_tree;
		}
		else 
			return null;
	}
	public List<TreeNode<E>> getPostOrder() {
		
		List<TreeNode<E>> postorder_tree = new ArrayList<TreeNode<E>>();
		/*while(postorder_tree !=null){										//thought my PostOrder would be much different
			postorder_tree.get(I)											//from the PreOrder, but it really isn't
		}*/																	//thought it could be done cleaner with a while loop
		
		for(int i = 0; getChildren().size() > i ; i++ ){					//gets the node position index
			postorder_tree.addAll(getChildren().get(i).getPostOrder());
			
		}
						
	    postorder_tree.add(this);											//adds the array to it at the end, rather than the beginning since it is postorder
		
		return postorder_tree;
	}
	public MyTreeNode(E element_type){								//used to run it in TestMyTree
		
		elem = element_type;
	}
}
