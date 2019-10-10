package ru.itpark;


public class QueueService {
    private QueueElement first;

    public QueueElement getFirst() {
        return first;
    }

    public void addNew (QueueElement queueElement) {
        if (first == null) {
            this.first = queueElement;
            return;
        }
        QueueElement next  = first;
        while (next.getNext()!= null) {
            next = next.getNext();
        }
        next.setNext(queueElement);
    }

    public void deleteFirst () {
        if (first != null) {
            this.first = first.getNext();
        }

    }
    public int queueSize () {
        int size = 0;
        QueueElement queueElement = first;
        while (queueElement != null) {
            size++;
            queueElement = queueElement.getNext();
        }
        return size;
    }
}
