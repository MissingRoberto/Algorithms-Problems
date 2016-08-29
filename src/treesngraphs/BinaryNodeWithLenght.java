package treesngraphs;

public class BinaryNodeWithLenght  {

	public int value;
	int height = 0;
	BinaryNodeWithLenght left = null;
	BinaryNodeWithLenght right = null;

	public BinaryNodeWithLenght(int value) {
		this.value = value;
	}

	public boolean checkBalance() {
		boolean isLeftBalance = true; 
		boolean isRightBalance = true; 
		int rightHeight = 0;
		int leftHeight = 0;
		
		if (right != null){
			isRightBalance = right.checkBalance();
			if (!isRightBalance){
				return false;
			}
			rightHeight = right.height;
			
		}
		if (left != null){
			isLeftBalance = left.checkBalance();
			if (!isLeftBalance){
				return false;
			}
			leftHeight = left.height;
		}
		
		height = Math.max(rightHeight, leftHeight) +1;	
		return Math.abs(leftHeight - rightHeight) <= 1;

	}
	
	public void add(int value) {
		BinaryNodeWithLenght next = this;
		while (next != null) {
			BinaryNodeWithLenght parent = next;
			if (value == next.value) {
				return;
			} else if (value > next.value) {
				next = next.right;
				if (next == null)
					parent.right = new BinaryNodeWithLenght(value);
			} else {
				next = next.left;
				if (next == null)
					parent.left = new BinaryNodeWithLenght(value);

			}
		}

	}

	public boolean remove(int value, BinaryNodeWithLenght parent) {
		if (value < this.value) {
			if (left != null)
				return left.remove(value, this);
			else
				return false;
		} else if (value > this.value) {
			if (right != null)
				return right.remove(value, this);
			else
				return false;
		} else {
			if (left != null && right != null) {
				this.value = right.minValue();
				right.remove(this.value, this);
			} else if (parent.left == this) {
				parent.left = (left != null) ? left : right;
			} else if (parent.right == this) {
				parent.right = (left != null) ? left : right;
			}
			return true;
		}
	}

	public int minValue() {
		if (left == null)
			return value;
		else
			return left.minValue();

	}
	
	
}
