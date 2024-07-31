import java.util.Arrays;

public class Vector {
    private final String[] items;
    private int length;

    public Vector(int length){
        items = new String[length];
        this.length = 0;
    }

    public boolean add(String item) {
        if(length < items.length){
            items[length] = item;
            length++;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int position, String item){
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

    public String find(int position){
        if(position >= 0 && position < length){
            return items[position];
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int find(String item){
        for (int i=0; i < length; i++){
            if(items[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public int length(){
        return this.length;
    }

    public String toString(){
        return Arrays.toString(items);
    }
}
