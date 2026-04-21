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
	public void ImprimirPreOrden(TreeNode nodo){
		if (nodo == null){
			return;
		}
		System.out.println(nodo.getValue() + "");
		ImprimirPreOrden(nodo.getLeft());
		ImprimirPreOrden(nodo.getRight());
	}
	public void ImprimirEnOrden(TreeNode nodo){
		if (nodo == null){
			return;
		}
		ImprimirEnOrden(nodo.getLeft());
		System.out.println(nodo.getValue() + "");
		ImprimirEnOrden(nodo.getRight());
	}
	public void ImprimirPostOrden(TreeNode nodo){
		if(nodo == null){
			return;
		}
		ImprimirPostOrden(nodo.getLeft());
		ImprimirPostOrden(nodo.getRight());
		System.out.println(nodo.getValue() + "");
	}
	public int getRoot(){
		return this.root.getValue();
	}
	public boolean hasElem(int info){
		return hasElem(this.root, info);
	}
	private boolean hasElem(TreeNode nodo,  int info){
		if(nodo == null){
			return false;
		}
		if (nodo.getValue() == info){
			return true;
		}
		return hasElem(nodo.getLeft(), info) ||hasElem(nodo.getRight(), info);
	}
	public boolean isEmpty(){
		return this.root == null;
	}
	public void add(int info){
		if (this.root == null){
			this.root = new TreeNode(info);
		}else {
			this.add(this.root, info);
		}
	}
	private void add(TreeNode nodo, int info){
		if (info < nodo.getValue()){
			if (nodo.getLeft() == null){
				nodo.setLeft(new TreeNode(info));
			}else{
				this.add(nodo.getLeft(), info);
			}
		}else {
			if (nodo.getRight() == null){
				nodo.setRight(new TreeNode(info));
			}else{
				this.add(nodo.getRight(), info);
			}
		}
	}
	
}
