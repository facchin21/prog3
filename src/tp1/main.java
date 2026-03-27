package tp1;

public class main {
	public static void main( String [] args	) {
		System.out.println("HOLA MUNDO");
		System.out.println("SOY FERMIN CON PABLO");

		MySimpleLinkedList<Integer> miListita = new MySimpleLinkedList<Integer>();

		MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<Integer>();
		MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<Integer>();


		lista1.insertFront(9);
		lista1.insertFront(6);
		lista1.insertFront(4);
		lista1.insertFront(2);
		lista1.insertFront(1);

		lista2.insertFront(8);
		lista2.insertFront(7);
		lista2.insertFront(6);
		lista2.insertFront(5);
		lista2.insertFront(4);


		
		// lista3.insertFront(5);
		// lista3.insertFront(9);
		// lista3.insertFront(2);
		// lista3.insertFront(4);
		// lista3.insertFront(1);

		// lista4.insertFront(1);
		// lista4.insertFront(3);
		// lista4.insertFront(7);
		// lista4.insertFront(9);
		// lista4.insertFront(4);

		MyDoubleLinkedList<Integer> listaDoble = new MyDoubleLinkedList<>();
		listaDoble.insertFront(4);
		listaDoble.insertFront(3);
		listaDoble.insertFront(2);
		listaDoble.insertFront(1);
		System.out.println(listaDoble);

		listaDoble.borrarPosX(1);
		System.out.println(listaDoble);


	}
}
