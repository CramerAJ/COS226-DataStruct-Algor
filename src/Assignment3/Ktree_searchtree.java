//Andrew Cramer

package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Assignment2.TreeNode;


public class Ktree_searchtree {
	
	private Ktree_node root_node;
	private Ktree_node current_node;						//variables used for nodes
	private Ktree_node parent_child_node;					//of children and parents
	private int key;										//also key and data values
	private int data;
	
	public Ktree_searchtree(Ktree_node node){				//sets the current node, if root has parent to null
		current_node = node;
		parent_child_node = null;
		
	}
	public Ktree_searchtree(int k){							//has the value of k set to null 
		current_node = null;								//since we have no nodes present
		parent_child_node = null;
		key = k;
	}	
	public Ktree_node getCurrent_node() {					//gets the current node
		return current_node;
	}
	public Ktree_node getParent_child_node() {				//gets the parent of the current node
		return parent_child_node;
	}
	
	public boolean locate(ArrayList<Ktree_node> node_present,int value){		//not really close to my 
		for(int i=0; i < node_present.size();i++){								//code used on question 7 didnt have a complete
			if(node_present.get(i).getKey()==value){							//memory of it, so had a huge a change in terms of 
				return true;													//its return statements
			}
			else{
				
			}
		}
		return false;
	}
	
	public ArrayList<Ktree_node> prenode_list(){			
		
		ArrayList<Ktree_node> node_list = new ArrayList<Ktree_node>();
		Ktree_node ktree = current_node;
		//for (int i = 0; i < )
		//need to add the current node to the list
		node_list.add(current_node);
		ktree = parent_child_node;
		
		while(ktree != null){								//adds onto the ktree
			node_list.add(ktree);							//with a parent node
			ktree = parent_child_node;
		}
		Collections.reverse(node_list);						//switchs the list order
		return node_list;
	}
	/*public ArrayList<Ktree_node> postordernode_list(){			
		
		ArrayList<Ktree_node> node_list = new ArrayList<Ktree_node>();
		Ktree_node ktree = current_node;
				
		Collections.reverse(node_list);						//switchs the list order
		return node_list;
	}
	*/
	public void remove(int value,ArrayList<Ktree_node> node_present){			//if it can't locate, then it can't remove 
		
		if(locate(node_present,value)==false){									//anything
			return;
		}
		
		//else if (node == true
		//may need to look if the node is 1 or 0 or less than 0
		else{																	//if it can, then it reduces the size of the preorder
			for(int i=0; i<node_present.size(); i++){							//as well as fins the values of k and d and deletes them from the arraylist
				if((node_present.get(i).getKey()==value) && !node_present.get(i+1).equals(null)){
					Ktree_node pre = node_present.get(i+1);
					pre.setParent(node_present.get(i).getParent());
					node_present.get(i).setParent(null);
				}
				else{
				node_present.get(i).setParent(null);
				}
			}
		}
	}
	public void insert(Ktree_node knode) {							//first few attempts on insert
		
		/*Ktree_node tree;
		current_node = node;
		parent_child_node = current_node;
		
		*/
		//Ktree_node<E> cant use <E> with a static
		if(locate(preorder(),knode.getKey())){						//insert method used
																	//Making an ArrayList
			ArrayList<Ktree_node> pre_order = preorder();			//If the node is there, it then checks if its not equal to null
			{														//It then sets its parent to null
				knode.setParent(pre_order.get(knode.getKey()-1));
				
				if(pre_order.get(knode.getKey()) != null ){
					knode.setChild(pre_order.get(knode.getKey()+1));
				}
				
				pre_order.get(knode.getKey()).setParent(null);
			}
		/*if (parent_child_node.getKey() > current_node.getKey()) {
			tree = parent_child_node;
			label
			parent_child_node = current_node;
			current_node = tree;
		}*/
			
			//root_node = pre_order;
		}	
		
	//	else if (parentchild.equals null)
		else{
			root_node = null;
			
			knode.setParent(current_node);
			current_node = knode;
			//Ktree_node<E> cant use <E> with a static
			
			for(int i=0; i < preorder().size(); i++){							//for loop that checks the size of the 
																				//amount of nodes in the ArrayList
				if(knode.getParent().getKey() > current_node.getKey()){
				
					Ktree_node preorder = knode.getParent();
				
					knode.setParent(knode.getParent().getParent());
				
					knode.setChild(preorder);
				}
			}
		}
		current_node = preorder().get(preorder().size() -1);
	}
	public ArrayList<Ktree_node> postorder(){								//I never ended up using PostOrder, I did in my first 
																			//few attempts on the question, but preorder is so much better
		/*List<TreeNode<E>> postorder_tree = new ArrayList<TreeNode<E>>();	
		for(int i = 0; getChildren().size() > i ; i++ ){					
			postorder_tree.addAll(getChildren().get(i).getpostorder());	
		}
	    postorder_tree.add(this);											
		
		return postorder_tree;
		*/
		return null;														
	}
	
	public ArrayList<Ktree_node> preorder(){								//used what I had from last homework
																			//for my preorder, it's a pretty straight foward 
		ArrayList<Ktree_node> preOrder = new ArrayList<Ktree_node>();		//pre order for an ArrayList
		
		Ktree_node pre_order = current_node;								//simply adds the current node 
		//needs the parent of the node										//into the array list, then checks if it is null
																			//if it's not then it can add it with a parent to that node
		pre_order = pre_order.getParent();
		preOrder.add(current_node);
		//while loop or for loop to make sure the index is not null
		while(pre_order != null){											//preorder is not null
																			//it will run through the list and add onto it
			pre_order = pre_order.getParent();
			preOrder.add(pre_order);
			
		}
		return preOrder;
	}
	
}
