/*
Problem: Implement Queue using Array
Time Complexity: enqueue/dequeue O(1)
Space Complexity: O(n)
*/

public class QueueUsingArray {
    int[] arr;
    int front, rear, size;

    public QueueUsingArray(int n) {
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (size == arr.length) return;
        rear = (rear + 1) % arr.length;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) return -1;
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }
}
