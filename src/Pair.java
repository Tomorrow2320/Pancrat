class Pair<T> {
    private final T odd;
    private final T even;

    public Pair(T odd, T even) {
        this.odd = odd;
        this.even = even;
    }

    public T odd() {
        return odd;
    }

    public T even() {
        return even;
    }
}