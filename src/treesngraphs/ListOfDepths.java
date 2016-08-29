package treesngraphs;
import java.util.ArrayList;
import linkedlists.Node;

public class ListOfDepths {
	
	
	public static ArrayList<Node> listOfDepths(BinaryNode parent){
		ArrayList<Node> list = new ArrayList<Node>();
		addDepth(list,parent,0);
		return list;
	}
	
	private static void addDepth(ArrayList<Node> list, BinaryNode node,int depth){
		if (node == null)
			return;
		
		if(depth == list.size()){
			Node linkedList= new Node(node.value);
			list.add(linkedList);
		}else{
			list.get(depth).append(node.value);
		}

		depth++;

		addDepth(list,node.left,depth);
		addDepth(list,node.right,depth);
		
		
	}
	
}
