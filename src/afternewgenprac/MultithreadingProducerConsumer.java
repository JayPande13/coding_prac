package afternewgenprac;

import java.util.ArrayList;
import java.util.List;

public class MultithreadingProducerConsumer {

}

class producerConsumer{
    final List<Integer> containerList ;
    final int counter;
    final int top ;

    public producerConsumer(int counter, int top) {
        this.containerList = new ArrayList<>();
        this.counter = counter;
        this.top = top;
    }

    public void producer(){

    }
}
