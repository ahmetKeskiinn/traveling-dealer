public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);

        node.printNodes(); // Output: --> 4 --> 5 --> 6 --> 7 --> .
        System.out.println("Length of the list: " + node.length(node)); // Output: Length of the list: 4
        System.out.println("Sum of the nodes: " + node.sumOfNodes()); // Output: Sum of the nodes: 22

        node = node.deleteNode(node, 5);
        node.printNodes(); // Output: --> 4 --> 6 --> 7 --> .
        // End of Example
    }
}
