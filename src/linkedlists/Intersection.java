package linkedlists;

public class Intersection {

	public static Node getIntersection(Node a, Node b){
		Node intersection = null; 
		int aSize = a.size();
		int bSize = b.size();
		
		while(aSize > bSize){
			aSize--; 
			a = a.next;
		}
			
		while(bSize > aSize){
			b = b.next;
			bSize--;
		}
		
		while( a != null && b != null){
			if (a.data == b.data){
				if(intersection == null)
					intersection = a; 
			}else{
				intersection = null;
			}
				
			a = a.next;
			b = b.next;
			
		}
		return intersection; 
	}
}
