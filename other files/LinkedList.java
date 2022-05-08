

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    //append
    public static LinkedList insert(LinkedList list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head ==null)
        {
            list.head=new_node;
        }
        else
        {
            // Insert the new_node at last node
            Node curr = list.head;
            while(curr.next !=null)
            {
                curr = curr.next;
            }
            curr.next =new_node;
        }
        return list;
    }
    //print
    public static void PrintList(LinkedList list)
    {
        Node curr;
        curr = list.head;
        while(curr.next != null)
        {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

        System.out.print(curr.data + "\n");
    }
    //delete
    public static LinkedList DeleteByKey(LinkedList list,int key)
    {
        Node curr = list.head;
        Node prev = null;

        //head is the required node
       if(curr != null && curr.data == key)
       {
           System.out.println("deleted the node with data" + key);
           list.head = curr.next;
           return list;
       }
       while(curr !=null && curr.data !=key )
       {
           prev = curr;
           curr = curr.next;
       }
       if(curr!= null)
       {
           prev.next = curr.next;
           System.out.println("deleted the node with data" + key);
           return list;
       }
       if(curr == null)
       {
           System.out.println("node not found with" + key);
       }
       return  list;

    }
    public static LinkedList DeleteAtIndex(LinkedList list,int position)
    {
        Node curr,prev;
        curr = list.head;
        prev = null;
        int index =1;
        if(curr!= null)
        {
            if(position ==0)
            {
                list.head = curr.next;
                System.out.println("deleted the node at position" + position);
                return list;
            }
        }
        while(curr!=null)
        {
            if(index == position)
            {
                prev.next = curr.next;
                System.out.println("deleted the node at position" + position );
                return list;
            }
            else
            {
                prev=curr;
                curr = curr.next;
                index++;
            }
        }
        if(curr ==null)
        {
            System.out.println("given position is out of the linkedlist index");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test = insert(test,1);
        test = insert(test,2);
        test = insert(test,3);
        test = insert(test,4);
        test = insert(test,5);
        test = insert(test,6);
        test = insert(test,7);
        test = insert(test,8);
        test = insert(test,9);
        test = insert(test,10);

        PrintList(test);
        DeleteByKey(test,5);
        PrintList(test);
        DeleteAtIndex(test,2);
        PrintList(test);
    }
}
