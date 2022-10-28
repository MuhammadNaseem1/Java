import java.util.*;
import java.io.*;
class node{
  int num;
  node next;
  node prev;

  public node(int num)
  {
    this.num=num;
    next=null;
    prev=null;
    //size=0;
  }
}
class list{
 
  //int size=0;
 node head=null;
 node tail=null;
  boolean isEmpty()
  {
    if(head==null)
    {
      return true;
    }
    else 
    return false;
  }
  
  void insertAtBeginning(node n)
  {
     if(isEmpty())
     {
         head=n;
     }
else{
    n.next=head;
    head.prev=n;
    head=n;
}
  }
  /*void insertAtBeginning(String name)
  {
node n=new node(name);
    {
     if(isEmpty())
     {
         head=n;
     }
else{
    n.next=head;
    head.prev=n;
    head=n;
}
  }
  }*/
void insertAtEnd(node n)
{
 if(isEmpty()){
 head=n;
 //size++;
 }
 else{
  node curr=head;
while(curr.next!=null)
{
  curr=curr.next;

}
curr.next=n;
n.prev=curr;
 }
}
void display()
{
  node curr=head;
  while(curr!=null)
  {
    System.out.print(curr.num+" ");
    curr=curr.next;
  }
  System.out.println();
 // System.out.print(curr.data);
}

void size()
{
  int count=0;
  node curr=head;
  while(curr!=null)
  {
    ++count;
    curr=curr.next;
  }
  
  System.out.println("The Size of this Linked List is "+ count);
 // System.out.print(curr.data);
}

void insertAtMid(node n,int num)
{
  if(isEmpty())
  System.out.println("list is empty");
  else{
        node curr=head;
        node back=null;
        while(curr.num!=num)
        {
            back=curr;
            curr=curr.next;
        }
    node  temp=back.next;
      back.next=n;
      curr.prev=back;
      n.next=temp;
      curr.prev=n;
//      size++;

  }
}
 public void deleteFromStart() {  
   
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail) {  
                //head will point to next node in the list  
                head = head.next;  
                //Previous node to current head will be made null  
                head.prev = null;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }  

 public void deleteFromLast() {  
     node curr=head;
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            while(curr.next.next != null) 
                //head will point to next node in the list  
                curr = curr.next;  
                //Previous node to current head will be made null  
                  
              
            
               node t=curr.next.next;
              // t.prev=null;
               curr.next=null;
              
        }  
    }  

    public void deleteFromMid(int value){
    node curr=head;
    
node temp=null;
    while(curr.num!=value)
    {
      temp=curr;
      curr=curr.next;
    }

    temp.next=curr.next;
    curr.next.prev=temp;
    //curr.next=null;
    //curr.prev=null;

    }
public void isPalindrome(node head, node tail)
{
        if(head==null)
        System.out.println("linked list is empty");
        else{
          node temp=head;
          while(head.next!=null && curr.prev!=null)
          {
            if(temp.data==curr.data)
            {
              temp=temp.next;
              curr=curr.prev;
            }
            else{
              System.out.println("It is not a palindrome");
            }

          }
          if(temp.data==curr.data)
          System.out.println("It is a palindrome");
        }
}
public static void main(String[] args)
{
  node node1 =new node(1);
  node node2 =new node(2);
  node node3 =new node(3);
  node node4 =new node(4);
  node node5 =new node(5);
  node node6 =new node(6);

  list obj=new list();

//  obj.isPalindrome(obj.head,obj.curr);
  obj.insert(node1);
   obj.insertAtEnd(node2);
    obj.insertAtEnd(node3);
     obj.insertAtEnd(node4);
//     System.out.println("the linked list is: ");
     obj.display();
//   System.out.println();
//   System.out.println("Insertion at the Tail:");
// obj.insertAtEnd(node5);
//      obj.display();
//      System.out.println();
//       System.out.println("Insertion at the Mid:");
//      obj.insertAtMid(node6,3);
//      obj.display();
//      System.out.println();
//       System.out.println("Insertion at the Beginning:");
//      obj.insertAtBeginning(node1);
//      obj.display();

//      //Deletion 

// obj.deleteFromStart();
// System.out.println("After deleting node from start");
// obj.display();

//   System.out.println();

// obj.deleteFromLast();
// System.out.println("After deleting node from tail");
// obj.display();

//   System.out.println();

// obj.deleteFromMid(3);
// System.out.println("After deleting node from middle");
// obj.display();

//   System.out.println();
//   obj.size();

}
}
