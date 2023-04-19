package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB_SIZE = 12;
    public static final int ERROR = -1;
    public static final int STACK_EMPTY = -1;
    public static final int MAX_INDEX = 11;

    private final int[] numbers = new int[TAB_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
