public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add (Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();

    }

    public void printList(){
        printList("");

    }

    //overload 多重定義, argument class dependence
    protected abstract void printList(String prefix);

    public String toString(){
        return getName() + " (" + getSize() + ")";

    }

}