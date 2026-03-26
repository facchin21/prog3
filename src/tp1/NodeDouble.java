package tp1;

public class NodeDouble<T> {
    private T info;
    private NodeDouble<T> next;
    private NodeDouble<T> previus;

    public NodeDouble(){
        this.info = null;
        this.next = null;
        this.previus = null;
    }
    public NodeDouble(T info, NodeDouble<T> previus, NodeDouble<T> next){
        this.setInfo(info);
        this.setNext(next);
        this.setPrevius(previus);
    }

    public NodeDouble<T> getNext(){
        return this.next;
    }
    public void setNext(NodeDouble<T> next){
        this.next = next;
    }
    public NodeDouble<T> getPrevius(){
        return this.previus;
    }
    public void setPrevius(NodeDouble<T> previus){
        this.previus = previus;
    }
    public T getInfo(){
        return this.info;
    }
    public void setInfo(T info){
        this.info = info;
    }


}
