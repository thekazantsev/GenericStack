public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack = stack
                .add(10)
                .add(11)
                .add(12)
                .add(13);

        StackMethod.printForEach(stack);

        StackMethod.addToEnd(stack, 9);

        StackMethod.printForEach(stack);
    }
}
