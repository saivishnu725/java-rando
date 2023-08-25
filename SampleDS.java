// implement an iterable interface with the name Array
class SampleDS implements Iterable<T> {
    public Iterable<T> iterator() {
        return new CustomIterator<T>(this);
    }
}

class CustomIterator<T> implements Iterator<T> {
    CustomIterator<T>(SampleDS obj) {}

    public boolean hasNext() {}

    public T next() {}

    public void remove(){}
}