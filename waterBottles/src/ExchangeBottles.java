class ExchangeBottles {
    private int full;
    private int empty;
    private int rate;

    public ExchangeBottles(int full, int rate) {
        this.full = full;
        this.empty = 0;
        this.rate = rate;
    }

    private int drink() {
        int drank = full;
        empty += full;
        full = 0;

        return drank;
    }

    private void exchange() {
        int bottles = empty / rate;
        int remainder = empty % rate;
        full = bottles;
        empty = remainder;
    }

    public int calculate() {
        int total = 0;

        for (int num = drink(); num > 0; num = drink()) {
            total += num;
            exchange();
        }

        return total;
    }
}
