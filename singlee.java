
class LinkedList {
  Node head;

  // Create a node
  class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  // Insert at the beginning
  public void insertAtBeginning(int new_data) {
    // insert the data
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  // Insert after a node
  public void insertionAtMiddle(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("The given previous node cannot be null");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }
  // Insert at the end
  public void insertAtEnd(int new_data) {
    Node new_node = new Node(new_data);

    if (head == null) {
      head = new Node(new_data);
      return;
    }

    new_node.next = null;

    Node last = head;
    while (last.next != null)
      last = last.next;

    last.next = new_node;
    return;
  }

  // Delete a node
  void deleteNode(int position) {
    if (head == null)
      return;
    Node temp = head;
    if (position == 0) {
      head = temp.next;
      return;
    }
    // Find the key to be deleted
    for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;
    // If the key is not present
    if (temp == null || temp.next == null)
    {
       // System.out.println("the element at given position is "+temp.data);
      return;
    }
    // Remove the node
    Node next = temp.next.next;
    temp.next = next;
  }
  // Print the linked list
  public void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }
  public static void main(String[] args) {
    LinkedList obj = new LinkedList();
    obj.insertAtEnd(1);
    obj.insertAtBeginning(2);
    obj.insertAtBeginning(3);
    obj.insertAtEnd(4);
    System.out.println("Inserting an element at middle");
    obj.insertionAtMiddle(obj.head.next, 5);
    System.out.println("Linked list: ");
    obj.printList();
    System.out.println();
    System.out.println("Deleting Tail element");
    obj.deleteNode(4);
    obj.printList();
    System.out.println();

    System.out.println("\nAfter deleting a middle element: ");
    obj.deleteNode(2);
    obj.printList();

  }
}