package tp1;


public class MySimpleLinkedList<T> {

	private Node<T> first;
	private int size;

	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}

	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size = this.size + 1;
	}

	public T extractFront() {
		T info = this.first.getInfo();
		this.first = this.first.getNext();
		this.size = this.size-1;
		return info;
	}

	public boolean isEmpty() {
		return (this.first.getNext() == null);
	}

	public T get(int index) {
		if (index < 0 || index >= this.size)
			return null;

		Node<T> tmp = this.first;

		for (int i = 0; i < index; i++){
			tmp = tmp.getNext();
		}
		return tmp.getInfo();
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		String result = "";
		Node<T> temp= this.first;
		while (temp!= null) {
			result += temp.getInfo();
			if (temp.getNext() != null) {
				result += " -> ";
			}
			temp= temp.getNext();
		}
		return result;
	}
	public int indexOf(T elemento) {
		Node<T> tmp = this.first;
		int index = 0;

		while (tmp != null) {

			if (tmp.getInfo().equals(elemento)) {
				return index;
			}
			tmp = tmp.getNext();
			index++;
		}

		return -1;
	}
// Ejercicio 5a
	public MySimpleLinkedList<Integer> DevolverComunes(MySimpleLinkedList<Integer> lista1, MySimpleLinkedList<Integer> lista2){
		MySimpleLinkedList<Integer> salida = new MySimpleLinkedList<>();

		Node<Integer> tmp1 = lista1.first;

		while (tmp1 != null){
			Node<Integer> tmp2 = lista2.first;
			while (tmp2 != null){
				if (tmp1.getInfo().equals(tmp2.getInfo())){
					salida.insertFront(tmp1.getInfo());
				}
				tmp2 = tmp2.getNext();
			}
			tmp1 = tmp1.getNext();
		}

		salida.first = MergeSort.sort(salida.first);
		return salida;
	}

// Ejercicio 5b
	public MySimpleLinkedList<Integer> DevolverComunesListasOrdenadas(MySimpleLinkedList<Integer> lista1, MySimpleLinkedList<Integer> lista2){
		MySimpleLinkedList<Integer> salida = new MySimpleLinkedList<>();

		Node<Integer> tmp1 = lista1.first;
		Node<Integer> tmp2 = lista2.first;

		while (tmp1 != null && tmp2 != null){	
			if(tmp1.getInfo().equals(tmp2.getInfo())){
				salida.insertFront(tmp1.getInfo());
				tmp1 = tmp1.getNext();
				tmp2 = tmp2.getNext();
			}else if(tmp1.getInfo() > tmp2.getInfo()){
				tmp2 = tmp2.getNext();
			}else{
				tmp1 = tmp1.getNext();
			}
		}
		return salida;
	}

	// Ejercicio 6
	public MySimpleLinkedList<Integer> DevolverNoCoumnesEnListaDos(MySimpleLinkedList<Integer> lista1, MySimpleLinkedList<Integer> lista2){
		MySimpleLinkedList<Integer> salida = new MySimpleLinkedList<>();

		Node<Integer> tmp1 = lista1.first;
		while (tmp1 != null){
			// Obtener el valor del nodo actual
			Integer valor = tmp1.getInfo();

			if (!lista2.contains(valor) && !salida.contains(valor)) {
				salida.insertFront(valor);
			}
			tmp1 = tmp1.getNext();
		}
		return salida;
	}

	public boolean contains(T elemento){

		Node<T> tmp = this.first;
		while (tmp != null){
			if (tmp.getInfo().equals(elemento)){
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}
}