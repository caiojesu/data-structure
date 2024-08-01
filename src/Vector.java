import java.util.Arrays;

public class Vector<T> {
    private  T[] items;
    private int length;

//    public Vector(int length){
//        items = new T[length];
//        this.length = 0;
//    }

    public Vector(int length){
        items =(T[]) new Object[length];
        this.length = 0;
    }

    public boolean add(T item) {
        increaseLength();
        if(length < items.length){
            items[length] = item;
            length++;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int position, T item){
        increaseLength();
        if(!(position >= 0 && position < length)){
            throw new IllegalArgumentException();
        }
        for(int i=length-1; i>=position; i--){
            items[i+1]= items[i];
        }
        items[position] = item;
        length++;
        return true;
    }

    public void remove(int position){
        if(!(position >= 0 && position < length)){
            throw new IllegalArgumentException();
        }
       for(int i=position; i<length-1; i++){
           items[i] = items[i+1];
       }
       this.length--;
    }

    public boolean remove(T item){
        for(int i=0; i < length; i++){
            if(items[i] == item ){
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    public T find(int position){
        if(position >= 0 && position < length){
            return items[position];
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int find(T item){
        for (int i=0; i < length; i++){
            if(items[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    private void increaseLength(){
        if (length == items.length){
            T[] newItems = (T[]) new Object[items.length+1];
            for(int i=0; i<length; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    public int length(){
        return this.length;
    }

    public String toString(){
        return Arrays.toString(items);
    }
}
