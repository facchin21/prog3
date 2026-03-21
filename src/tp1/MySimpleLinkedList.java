package ProgramacionIII.tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;/usr/libexec/java_home -Vcle
	private int size;

	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size = size + 1;
	}
	
	public T extractFront() {
		Node<T> tmp = this.first;
		this.first = first.getNext();
		size = size - 1;
		return tmp;
	}

	public boolean isEmpty() {
		// TODO
		return false;
	}
	
	public T get(int index) {
		// TODO
		return null;
	}
	
	public int getSize() {
		return  size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	
}
