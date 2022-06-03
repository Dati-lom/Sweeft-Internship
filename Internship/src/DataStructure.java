import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DataStructure<T> {

    HashMap<T, Integer> hash;
    ArrayList<T> array;

    public DataStructure(){

        this.hash = new HashMap<>();
        this.array = new ArrayList<>();
    }

    public void add(T element){
        this.array.add(element);
        this.hash.put(element, this.array.size()-1);                        //we map elements to indexes to find it quickly
    }

    public void remove(T element) throws Exception {
        if(this.hash.containsKey(element)){
            int index = this.hash.get(element);                            // We used Hashmap because it return index in O1 time (the way we mapped it)

            Collections.swap(this.array, index , this.array.size() -1); // swap also takes no time, we swap element we want with last element
            this.array.remove(this.array.size()-1);                  // we remove last element of listarray which takes O1 time
            this.hash.remove(element);

        }else throw new Exception("No Such Element") ;
    }

    public void print(){                                                  // we create print function to test our datastructure
        for(T el : this.array){
            System.out.println(el);
        }
    }
}