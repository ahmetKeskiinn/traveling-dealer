public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes() {
        Node n = this;
        while (n != null) {
            System.out.print(" --> " + n.data);
            n = n.following;
        }
        System.out.println(" --> .");
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length(Node h) {
        int count = 0;
        Node n = h;
        while (n != null) {
            count++;
            n = n.following;
        }
        return count;
    }

    // TODO:: Implement to return the sum of the Nodes
    int sumOfNodes() {
        int sum = 0;
        Node n = this;
        while (n != null) {
            sum += n.data;
            n = n.following;
        }
        return sum;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        while (n.following != null) {
            if (n.following.data == data) {
                n.following = n.following.following;
                return head;
            }
            n = n.following;
        }
        return head;
    }
}