package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

int totalRejected = 0;

public int reportRejected() {
<<<<<<< HEAD
<<<<<<< HEAD
    return totalRejected;
=======
return totalRejected;
>>>>>>> format
=======
return totalRejected;
>>>>>>> format
}

public void countIn(int in) {
if (!callCheck() && in > peekaboo())
        totalRejected++;
        else
            super.countIn(in);
}
}
