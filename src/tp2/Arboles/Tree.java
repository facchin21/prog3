package tp2.Arboles;

public class Tree {

	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root,value);
	}
	
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(),value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(),value);
			}
		}
	}
	private void ImprimirPreOrden(TreeNode nodo){
		if (nodo == null){
			return;
		}
		System.out.println(nodo.getValue() + "");
		ImprimirPreOrden(nodo.getLeft());
		ImprimirPreOrden(nodo.getRight());
	}
	private void ImprimirEnOrden(TreeNode nodo){
		if (nodo == null){
			return;
		}
		ImprimirEnOrden(nodo.getLeft());
		System.out.println(nodo.getValue() + "");
		ImprimirEnOrden(nodo.getRight());
	}
	private void ImprimirPostOrden(TreeNode nodo){
		if(nodo == null){
			return;
		}
		ImprimirPostOrden(nodo.getLeft());
		ImprimirPostOrden(nodo.getRight());
		System.out.println(nodo.getValue() + "");
	}
	
}
