package LinerDataStructures;

import org.w3c.dom.ls.LSOutput;

public class Arrays {

    private int [] items;
    private int count = 0;

    public Arrays(int length) {
        this.items = new int[length];
    }

    public void insert(int item){
        //if the array is full, create an array of size twice the existing
        if(count >= items.length){
            int [] newItems = new int[count * 2];
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //if the array is not full, add the item to the first empty index
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        if(index > count)
            throw new IllegalArgumentException("Entered index if out of bound");
        //remove the item from the index
        items[index] = 0;
        //move the items on left of the removed index to one index right
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;
        return -1;
    }

    public int max(){
        int max = items[0];
        for(int i = 1; i < count; i++)
            if(items[i] > max)
                max = items[i];
        return max;
    }

    public int itemAt(int index){
        if(index >= count)
            throw new IllegalArgumentException("Index out of bound");
        return items[index];
    }

    static public void intersect(Arrays arr1, Arrays arr2){
        if(arr1.count <= arr2.count) {
            for (int i = 0; i < arr1.count; i++)
                for (int j = 0; j < arr2.count; j++)
                    if (arr1.itemAt(i) == arr2.itemAt(j))
                        System.out.println(arr1.itemAt(i));
                    else
                        System.out.println("No Common item(s)");
        }
        else{
            for (int i = 0; i < arr2.count; i++)
                for (int j = 0; j < arr1.count; j++)
                    if (arr1.itemAt(i) == arr2.itemAt(j))
                        System.out.println(arr2.itemAt(i));
                    else
                        System.out.println("No Common item(s)");
        }
    }



    public void print(){
        for(int i = 0; i<count; i++)
            System.out.println(items[i]);
    }
}
