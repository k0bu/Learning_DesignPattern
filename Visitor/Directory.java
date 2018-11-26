import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;
    private Vector dir = new Vecotr();

    public Directory (String name){
        this.name = name;

    }

    public String getName(){
        return name;

    }

    public int getSize(){
        int size = 0;
        Iterator it = dir.iterator();

        while(it.hasNext()){
            Entry entry = (Entry)it.nex();
            size += entry.getSize();

        }

        return size;

    }

    public Entry add(Entry entry){
        dir.add(entry);
        return this;

    }

    public Iterator iteraotr() {
        return dir.iterator();

    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}