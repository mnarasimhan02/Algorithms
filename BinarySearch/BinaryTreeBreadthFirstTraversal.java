/*
Time Complexity: O(n) where n is number of nodes in the binary tree
1) Create an empty queue q
2) temp_node = root  -- start from root
3) Loop while temp_node is not NULL
    a) print temp_node->data.
    b) Enqueue temp_node’s children (first left then right children) to q
    c) Dequeue a node from q and assign it’s value to temp_node
For breadth first, add all children to the queue, then pull the head and do a breadth first search on it, using the same queue.
*/
public class BinaryTreeBreadthFirstTraversal {

    public static void main(String[] args) throws
            Queue.QueueUnderflowException, Queue.QueueOverflowException {
        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');
        Node<Character> x = new Node<>('X');

        a.setLeftChild(b);
        a.setRightChild(c);
        c.setLeftChild(d);
        c.setRightChild(e);
        d.setLeftChild(f);
        d.setRightChild(h);
        e.setRightChild(g);
        b.setLeftChild(x);

        breadthFirst(a);
    }

    public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public static void breadthFirst(Node root) throws
            Queue.QueueUnderflowException, Queue.QueueOverflowException {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new Queue<>(Node.class);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            print(node);

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }

    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }
}
