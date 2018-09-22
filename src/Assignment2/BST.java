package Assignment2;

public class BST <E extends Comparable<E>> {
	
	BTreeNode<E> tree_root;								//code used from a previous assignment in 225
														//used from a notes packet on, how to construct a 
														//Binary Search Tree
		public BST(){
			tree_root = null;
		}
		public boolean Empty(){
			return tree_root == null;
		}
		public BTreeNode<E> makeEmpty(){
			tree_root = null;
			return tree_root;
		}
		
		public void insert(E item){
			
			if(!Empty()){
				
				boolean almost_there = false;
				BTreeNode<E> current = tree_root;
				
				while(!almost_there){
					if(item.compareTo(current.getElement())<0){
						if(current.getLeft() != null){
							
							current = current.getLeft();
						}
						else{
							current.setLeft(new BTreeNode<E>(item));
							almost_there = true;
						}
					}
					else if(item.compareTo(current.getElement()) == 0){
						almost_there = true;
						}
					
					else{
						if(current.getRight() == null){
							current.setRight(new BTreeNode<E>(item));
							
							almost_there = true;
						}
						else{
						current = current.getRight();
						}			
					}
				
				tree_root = new BTreeNode<E>(item);
			}
		}
	}
}
