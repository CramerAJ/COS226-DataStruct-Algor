package Assignment2;

public class BTreeNode<E>   {
	//Also used from a 225 COS notes
	//packet, was very rusty on how to call a 
	//Binary Tree Node
	
	private E node;									//element is what goes in the node				 
	private BTreeNode<E>  left_child;				//but for my simply saying, element is the node
	private BTreeNode<E>  right_child;					 
	
	public BTreeNode() 							
	{	node = null;								
		left_child = right_child = null;
	}
	
	public BTreeNode (E elem)					
	{	node = elem;
		left_child = right_child = null;
	}

	public BTreeNode (E elem, BTreeNode<E> left, BTreeNode<E> right)
	{	node = elem;
		this.left_child = left;
		this.right_child = right; 
	}
	public E getnode() {	
		return node;
		}
	public void setnode(E elem) {
		this.node = elem;
		}
	
	
	public void setLeft(BTreeNode<E> left) {
		this.left_child = left;	
		}
	public void setRight(BTreeNode<E> right) {
		this.right_child = right;
		}
	public BTreeNode<E> getRight() {
		return right_child;	
		}
	public BTreeNode<E> getLeft() {
		return left_child;
		}

	public E getElement() {
		return node;
	}

}
