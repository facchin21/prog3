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
            this.first.setPrevius(temp);
            this.first = temp;
        }
        this.size++;
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
    public T extractLast(){
        if (this.last == null){
            return null;
        }

        T info = this.last.getInfo();

        this.last = this.last.getPrevius();
        if (this.last != null){
            this.last.setNext(null);
        }else {
            this.first = null;
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
    public int getSize(){
        return this.size;
    }
    @Override
    public String toString(){
        String result ="";
        NodeDouble<T> temp = this.first;
        while (temp != null){
            result += temp.getInfo();
            if (temp.getNext() != null){
                result += " -> ";
            }
            temp = temp.getNext();
        }
        return result;
    }

    public T borrarPosX(int pos){
        if (pos < 0 || pos >= this.size || this.first == null){
            return null;
        }

        if (pos == 0){
            return this.extractFront();
        }
        if (pos == size-1){
            return this.extractLast();
        }

        NodeDouble<T> temp = this.first;
        for (int i = 0; i < pos; i++){
            temp = temp.getNext();
        }

        temp.getPrevius().setNext(temp.getNext());
        temp.getNext().setPrevius(temp.getPrevius());

        this.size--;
        return temp.getInfo();
    }

}
