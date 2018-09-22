package Assignment2;

public class F1to8  {
	
	//functions made to be what I feel is similar to what is done in the written section
	//F7 I had difficulties with on how to handle the function.
	//From what I understood it was asking, in terms of functions
	//to get and set the nodes 
	
	
	public BTreeNode<String> f1(BTreeNode<String> e){
		if (e != null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> l = e.getLeft();
			
			
			e.setLeft(right);
			e.setRight(l);
			
			
			return e;
		}
		else return e;
		
		
	}
	public BTreeNode<String> f2(BTreeNode<String> e){
		
		if(e !=null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> l = e.getLeft();
			
			
		    e.setLeft(f2(right));
		    e.setRight(f2(l));
		    
		    
		    return e;
		}
		else 
			
			return e;
		
	}
	public BTreeNode<String> f3(BTreeNode<String> e){

		if(e !=null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> l = e.getLeft();
			
			
		    e.setLeft(f3(right));
		    e.setRight(l);
		    
		    return e;
		}
		else 
			
			return e;
	
	}
	public BTreeNode<String> f4(BTreeNode<String> e){

		if(e !=null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> l = e.getLeft();
			
			
		    e.setLeft(f4(right));
		    e.setRight(l);
		    
		    return e;
		}
		else 
			
			return e;
	}
	public BTreeNode<String> f5(BTreeNode<String> e){

		if(e !=null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> l = e.getLeft();
			BTreeNode<String> l2 = l.getLeft();
			
			
		    e.setRight(e);
		    e.setLeft(right);
		    l.setLeft(l2);
		    
		    return e;
		    
		}
		else 
			
			return e;
	}
	public BTreeNode<String> f6(BTreeNode<String> e){

		if(e !=null){
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> left = e.getLeft();
			
			
		    e.setLeft(f2(right));
		    e.setRight(f2(left));
		    
		    
		    return e;
		}
		else 
			return e;
	}
	public BTreeNode<String> f7(BTreeNode<String> e){

			Object e2 = null;
			
		if(e !=null){
			
			
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> e2 = e2.getRight();
			BTreeNode<String> left = e2.getRight();
			BTreeNode<String> e3 = e2.getRight();
			BTreeNode<String> l2 = e3.getRight();
			BTreeNode<String> right2 = e3.getLeft();
			
			
		    e2.setLeft(e);
		    e.setRight(l2);
		    e3.setRight(e);
		    
		    
		    return e;
		}
		else 
			return e;
	}
	public BTreeNode<String> f8(BTreeNode<String> e){

		if(e !=null){
			BTreeNode<String> left = e.getRight();
			BTreeNode<String> e2 = e.getRight();
			BTreeNode<String> right = e.getRight();
			BTreeNode<String> e3 = e2.getRight();
			BTreeNode<String> right2 = e2.getLeft();
		    
			e2.setLeft(e);
			e.setRight(f2(left));
			
			return e;
		}
		else 
			return e;
		
	}
	
}


