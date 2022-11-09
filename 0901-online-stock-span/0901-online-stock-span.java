class StockSpanner {

    private Deque<int[]> dq = new ArrayDeque<>();

    public StockSpanner() {

    }

    public int next(int price) {
        int result = 1;
        while(!dq.isEmpty() && dq.peekLast()[0] <= price){
            result += dq.pollLast()[1];
        }
        dq.add(new int[]{price, result});

        return result;
    }
}