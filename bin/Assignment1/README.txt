
	README:
	
	Andrew Cramer 226
	
	Looked up "HashSet.java Data Structures and Algorithms Analysis in Java".
	found a site "http://users.cis.fiu.edu/~weiss/dsj4/code/".
	contained the code called HashSet.java moved to the url="http://users.cis.fiu.edu/~weiss/dsj4/code/weiss/util/HashSet.java"
	Any changes I made will be noted with a comment on the side with a space after the "// ". 
	left all comments in "/* */" the same, used them as a helper to understand the work below.
	
	Resources:
	Used other sites to refresh my knowledge on the definition of coalesced hashing
	
	"https://en.wikipedia.org/wiki/Coalesced_hashing"
	
	
	
	Changes made:
	
	Changed and added to the remove(Object), add(Anytype), findPos(Object), and HashEntry class. 
	
	HashEntry
	For the HashEntry, I added a new HashEntry(catdog), to have it be a linked list, used for coalesced method
	instead of quadratic.
	
	findPos(object)
	Added an else if and else statement, to check the starting position of the array, otherwise the starting
	position is incremented and equal to the currentPos
	
	add(Anytype)
	Added two while loops, one for adding the currentPos data value(x), and the other for subtracting 1 
	from the array, to state the the slot is now being taken, and is removed from the array.
	
	remove(Object)
	Added a while loop for removing, stated that if the currentPos equals your variable your looking for
	then, it will be isActive false to remove it. Otherwise it equals the currentPos.catdog.
	
	
	
	Side Note:
	
	Had to use a good majority of the code from the text book. Commented out any quadratic info that I 
	noted to be useless