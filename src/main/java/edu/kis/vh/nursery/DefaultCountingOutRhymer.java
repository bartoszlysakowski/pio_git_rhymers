package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB_SIZE = 12;
    public static final int ERROR = -1;
    public static final int STACK_EMPTY = -1;
    public static final int MAX_INDEX = 11;
    public static final int TOTAL = -1;

    private final int[] numbers = new int[TAB_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = TOTAL;

    /**
     *
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return result of comparison (0 or 1): total and STACK_EMPTY
     */
    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    /**
     *
     * @return result of comparison (0 or 1): total and MAX_INDEX
     */
    public boolean isFull() {
        return total == MAX_INDEX;
    }

    /**
     *
     * @return error or expected value, depending on callCheck() method's value
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     *
     * @return error or expected value depending on callCheck() method's value
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
