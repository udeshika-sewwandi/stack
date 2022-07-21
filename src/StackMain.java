public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2);
        stack.push(4);
        stack.push(10);
        stack.push(30);

        stack.pop();

        System.out.println(stack.getStackSize());

        stack.getElements().stream().forEach(e -> {
            System.out.println(e);
        });
    }
}
