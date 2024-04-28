/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syrly
 */
public class StrukturQueue {
    private Node FRONT; // Atribut FRONT bertipe Node
    private Node REAR; // Atribut REAR bertipe Node

    public StrukturQueue() {
        FRONT = null; // Inisialisasi FRONT dan REAR menjadi null saat objek dibuat
        REAR = null;
    }

    // Metode untuk mengecek apakah antrian kosong atau tidak
    public boolean isEmpty() {
        return FRONT == null; // Kembalikan true jika FRONT adalah null, artinya antrian kosong
    }
    
    public void enqueue (int data) {
        Node newNode = new Node(data); // Tanda titik koma (;) di akhir baris
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode; // Operator assignment (=), bukan (-)
        } else {
            REAR.setNext(newNode); // Kedua kata "Node" yang benar, dan berikan spasi setelah titik
            REAR = newNode;
            
        }
    }
    
     public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat melakukan dequeue.");
            return -1;
        } else {
            int removedData = FRONT.getData();
            FRONT = FRONT.getNext();
            if (FRONT == null) {
                REAR = null; // Jika FRONT menjadi null, REAR juga harus null
            }
            return removedData;
        }
    }
        public int size() {
            int size = 0;
        Node curNode = FRONT;
        while (curNode != null)
        {
        size++;
        curNode = curNode .getNext ();
        }
        return size;
        }
        
        public int front () {
            return FRONT != null ? FRONT. getData () : -1;
        }
        
        public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
        } else {
            System.out.print("Elemen Queue: ");
            Node curNode = FRONT;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
  }
}
