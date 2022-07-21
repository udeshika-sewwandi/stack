import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Stack {
    private static Queue<Integer> queue = new LinkedList<>();
    private List<Integer> queueNums = new ArrayList<>();

    public int push(int o) {
        queueNums.add(o);

        queue.clear();

        for(int i = queueNums.size() -1; i> 0; i--) {
            queue.add(queueNums.get(i));
        }

        return o;
    }

    public int pop() {
        queueNums.remove(queueNums.size() -1);
        return queue.remove();
    }

    public List<Integer> getElements() {
        return queueNums;
    }

    public int getStackSize() {
        return queueNums.size();
    }
}
