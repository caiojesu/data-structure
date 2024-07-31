import java.util.Arrays;

public class Vector {
    private String[] items;
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
