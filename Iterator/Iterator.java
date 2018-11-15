public interface Iterator {
    public abstract void indexToFirst();
    public abstract void indexToLast();
    public abstract Object getBookAt(int index);
    public abstract boolean hasNext();
    public abstract boolean hasPrevious();
    public abstract Object next();
    public abstract Object previous();
}