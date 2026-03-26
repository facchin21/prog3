package tp1;

public class MyDoubleLinkedList<T> {
    private NodeDouble<T> first;
    private NodeDouble<T> last;
    private int size;
    public MyDoubleLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public void insertFront(T info){

        NodeDouble<T> temp = new NodeDouble<>(info, null, null);

        if (this.first == null){
            this.first = temp;
            this.last = temp;
        }else{
            temp.setNext(this.first);
            this.first.setPrevius(null);
            this.first = temp;
        }
    }
    public T extractFront(){
        if (this.first == null){
            return null;
        }

        T info = this.first.getInfo();

        this.first = this.first.getNext();
        if (this.first != null){
            this.first.setPrevius(null);
        }else {
            this.last = null;
        }
        this.size --;
        return info;
    }

    public void insertLast(T info){
        NodeDouble<T> temp = new NodeDouble<>(info, null, null);
        if(this.last == null){
            this.first = temp;
            this.last = temp;
        }else{
            this.last.setNext(temp);
            temp.setPrevius(this.last);
            this.last = temp;
        }
        this.size ++;
    }


}
