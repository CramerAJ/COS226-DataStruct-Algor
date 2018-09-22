package Assignment4;

import Assignment4.Ktree_node;

public class Ktree_node {
	
	private Ktree_node child_node;									//child node
	private Ktree_node parent_node;									//parent node
	private float data;												//float data
	private int key;												//integer number

	public Ktree_node(){											//Ktree variable values
		key = 0;
		data = -1;
		child_node = null;
		parent_node = null;	
	}
	public Ktree_node(int k, float d,Ktree_node c, Ktree_node p){
		key = k;
		data = d;
		child_node = c;
		parent_node = p;	
	}	
	public Ktree_node getChild(){									//gets the Child
		return child_node;
	}
	public void setChild(Ktree_node child_node){					//sets the Child
		this.child_node = child_node;
	}
	public Ktree_node getParent(){									//gets he parent of the node
		return parent_node;
	}
	public void setParent(Ktree_node parent_node){					//sets it equal to the current node
		this.parent_node = parent_node;
	}
	public int getKey() {											//gets Key
		return key;
	}
	public void setKey(int key) {									//sets Key
		this.key = key;
	}
	public float getData() {										//gets Data float
		return data;
	}
	public void setData(float data) {								//sets it
		this.data = data;
	}
	public String toString(){										//toString used to return the key and the data value
		return "  "+this.getKey()+"  "+this.getData()+"  ";			//that relates to the Key
	}
}
