/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertnodespecificposition;

class Node
{

    int data;
    Node nextNode;
}

public class InsertNodeSpecificPosition
{

    private Node head;

    public void insert(int data)
    {
        //create a new Node and store a data.
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        //check the head is null or not.
        //if head is null, assign the Node and exit.
        if (this.head == null)
        {
            head = node;
            return;
        }

        //assign a head into the temp Node and loop it until find the null reference.
        Node tempNode = this.head;
        while (tempNode.nextNode != null)
        {
            tempNode = tempNode.nextNode;
        }

        //assign new node.
        tempNode.nextNode = node;
    }

    public void insertNth(int data, int position)
    {
        Node newNode = new Node(); //create a new node
        newNode.data = data;
        newNode.nextNode = null;

        if (this.head == null && position != 0)
        { //if head is null and position is zero skip it.
            return;
        } else if (this.head == null && position == 0)
        { // if head null and position is zero set at the head.
            this.head = newNode;
        }

        if (position == 0)
        { // if position is zero then new node set at the head.
            newNode.nextNode = this.head;
            this.head = newNode;
        }
        else{
        Node current = this.head;
        Node previous = null;
        int i = 0;

        while (i < position)
        { //loop until find the given position.
            previous = current;
            current = current.nextNode;
            if (current == null)
            {
                break;
            }
            i++;
        }

        newNode.nextNode = current; //get the new node and linked the remaining nodes in the list.
//        if (position != 0)
        previous.nextNode = newNode; //set the looped node to the new node.
        }
    }

    public void print()
    {
        if (this.head == null)
        {
            return;
        }
        //print all nodes
        Node tempNode = this.head;
        while (tempNode != null)
        {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        InsertNodeSpecificPosition ls = new InsertNodeSpecificPosition();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.print();
        ls.insertNth(25, 4);
        ls.print();
    }
}
