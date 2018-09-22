package Assignment4;


import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecordManager {
	//Ktree_node<E>
	//Ktree_searchtree<E> ktree;
	Font font = new Font("Verdana", Font.BOLD, 11);
	
	
	
	static Ktree_searchtree ktree;
	
	public static String c (int k){				//creates a ktree
												//that has an empty line
		ktree = new Ktree_searchtree(k);
		
		System.out.println("   ");
		return " \n c_"+Integer.toString(k);
	
	}
	//public static void s (int k, float d/){					
	//re read how to implement s
	public static String e (int k){			//functions e
											//if its empty it outputs 0
		//Ktree_node<E>
		if(ktree == null){
			
			System.out.println("0");
			//System.out.println(" ");
			return "0 \n e_"+Integer.toString(k);
			}
		
		else{												//otherwise it accesses the ArrayList
			ArrayList<Ktree_node> pre = ktree.preorder();	//and outputs 1 to check if anything is there
			for (int i=0; i < pre.size(); i++){
				if(pre.get(i).getKey()==k){
					
					System.out.println(" 1 ");
					return "1 \n e_"+Integer.toString(k);
				}
			}
		}
		return null;
	}
	
	public static String s (int k, float d/*node*/){							//checks first if the tree is empty
		//for loop needed?													//it it is empty it then adds it to the tree
		if(ktree != null){													//it then uses preorder, since we can treat it like a linked list
																			//we dont care about whether it is balanced or not
			ArrayList<Ktree_node> pre = ktree.preorder();						
			//Ktree_node<E>
			//postorder work better?
			Ktree_node node_new = new Ktree_node(k,d,(pre.get(pre.size()-1)),null); 
			
			System.out.println("  ");	
			return " \n s_"+Integer.toString(k)+"_"+ Float.toString(d);
		}
		//can simply just make a new node and output a blank line
		//Ktree_node node, not sure if it is being used at all
		else{
			//Ktree_node<E>
			Ktree_node node = new Ktree_node(k,d,null,null);				//null null works for some reason, I have no idea why
																			//needs a new Ktree_searchtree(node)
			ktree = new Ktree_searchtree(node);								//has a new node
			
			System.out.println(" ");										//outputs a blank line after
			return " \n s_"+Integer.toString(k)+"_"+Float.toString(d);
		}
		
	}
	
	public static String d (int k){								//calls the remove method from Ktree_searchtree
																//and does a for loop
		ArrayList<Ktree_node> preorder =  ktree.preorder();		//that checks the node until it is found
																//if its found it is deleted
		//while loop ?
		for (int i=0; i<preorder.size(); i++){						
			
			if(preorder.get(i).getKey() == k){
				
				ktree.remove(k,preorder);						//if its not there nothing happens
				
				System.out.println("  ");						//outputs a blank line
				return " \n d_"+Integer.toString(k);
			}
			//System.out.println("Not Present");
		}
		return null;
	}
	
	public static String r (int k){								//Not sure on this function
	
		ArrayList<Ktree_node> preorder = ktree.preorder();		//treated it the same as the other
		
		boolean value = false;									//boolean since we have ints and floats				
		
		for (int i=0; i<preorder.size(); i++){					//for loop that checks if the values are present  
			if(preorder.get(i).getKey() == k){					//or gives k a index in the tree/list
				value = true;
				//value = k
				System.out.println(preorder.get(i).getData());
			}
			//System.out.println("Not Present");
		}
																//needs to output the values
		if (value == true){										//or a blank line
			
			System.out.println(value);
			return " \n r_"+Integer.toString(k);
		}
		else{
			
			System.out.println(" ");
			return " \n r_"+Integer.toString(k);
		}
	}
	
	public static String xs(){									//for xs and xh, I interpreted them as the same
																//yet I know they arn't, however in terms of a linked list
		ArrayList<Ktree_node> preorder = ktree.preorder();	    //we don't care if they are balanced
		int size = ktree.preorder().size();						//so we can assume the height is the same as the size of the whole
		
		System.out.println(size);								//ktree for however many k's there are
		//System.out.println(" ");
		return "\n xs_"+Integer.toString(size);
		
	}
	public static String xh(){	
		ArrayList<Ktree_node> preorder = ktree.preorder();
		int height = ktree.preorder().size();
		
		System.out.println(height);	
		
		System.out.println(" ");
		return "\n xs_"+Integer.toString(height);
	}
	


	public static String xa(){								//just simply outputs the preorder ktree
															//out puts the values on the same line
		ArrayList<Ktree_node> preorder = ktree.preorder();	//that match the correct pairs of keys and data
		
		//needs to output using a toString, easier method
		
		for(int i=0; i< preorder.size(); i++){
			
			System.out.print(preorder.get(i).toString());
			return "\n xa_"+Integer.toString(i);
	
		}
		return null;
		
	}
	
	
	public static String xb(){
	
		ArrayList<Ktree_node> preorder = ktree.preorder();		//does the xb function
		Collections.reverse(preorder);							//of changing the preorder to postorder
																//used stack overflow, as well as a few students
		for (int i=0; i<preorder.size(); i++){					//explain to me how Collections.reverse works
																//out puts the ktree in a tree format from top to bottom
			//System.out.println(" ");							//our root will always be 1-however big c is made to be
			
			System.out.println(preorder.get(i).toString());
			
			System.out.println(" ");
			return "\n xb_"+Integer.toString(i);
		
		}
		return null;
	}
	
	public static String xp(){
	
		ArrayList<Ktree_node> preorder = ktree.preorder();
		//while (tree != null)
		//is a nested for loop needed???
		for (int i=0; i<preorder.size(); i++){
			
			for( int o = 0; o<=i; o++){					//did a nested for loop, to just recall
			
				System.out.println(" ");				//all the keys and data in the tree
				
			}
			
			System.out.println(preorder.get(i).toString());
			return "\n xp_"+Integer.toString(i);
		}
		return null;
	
	}

	public static void main(String[] args){												//static main
																						//Calls to the console
																						//Allows the user to interact with the 
		Scanner scan = new Scanner(System.in);											//Program, and perform commands
						
		while (!(scan.nextLine().equals("quit"))){										//While loop in the static main
																						//If the user enters "quit", then it will close
			System.out.println("Enter a Command(quit, will close the program): ");		//Otherwise the user may freely 
			String userinput = scan.nextLine();											//Scans the user input
			String seperation[] = userinput.split("\\s");
			String commands = seperation[0];
			if (commands.equals("c")){
				
				c(Integer.parseInt(seperation[1]));
				//System.out.println("Command (c) has been called");
			}
			if (commands.equals("s")){
			
				s(Integer.parseInt(seperation[1]), Float.parseFloat(seperation[2]));
				//System.out.println("Command (s) has been called");
			}
			if (commands.equals("e")){
				
				e(Integer.parseInt(seperation[1]));
				//System.out.println("Command (e) has been called");
			}
			if (commands.equals("r")){
				
				r(Integer.parseInt(seperation[1]));
				//System.out.println("Command (r) has been called");
			}
			if (commands.equals("d")){
				
				d(Integer.parseInt(seperation[1]));
				//System.out.println("Command (d) has been called");
			}
			if (commands.equals("xs")){
				
				xs();
				//System.out.println("Command (xs) has been called");
			}
			if (commands.equals("xh")){
				
				xh();
				//System.out.println("Command (xh) has been called");
			}
			if (commands.equals("xa")){
				
				xa();
				//System.out.println("Command (xa) has been called");
			}
			if (commands.equals("xb")){
				
				xb();
				//System.out.println("Command (xb) has been called");
			}	
			if (commands.equals("xp")){
				
				xp();
				//System.out.println("Command (xp) has been called");
			}
		}
		scan.close();
	}
}
