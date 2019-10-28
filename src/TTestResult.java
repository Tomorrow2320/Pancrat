class TTestResult {
    private final int odd;
    private final int even;

    public TTestResult(int odd, int even) {
        this.odd = odd;
        this.even = even;
    }

    public int odd() {
        return odd;
    }

    public int even() {
        return even;
    }
}