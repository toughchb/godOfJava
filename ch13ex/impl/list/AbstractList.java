package ch13ex.impl.list;

public abstract class AbstractList implements List{
    public boolean add(){
            return false;
    }
	public boolean remove(int index){
        return false;
    }
	public boolean update(int index, Object value){
        return false;
    }
    public abstract boolean clear();
}