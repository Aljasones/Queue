package ru.itpark;

public class QueueService {
    private QueueElement first;

    public QueueElement getFirst() {
        return first;
    }

    public void setFirst(QueueElement first) {
        this.first = first;
    }


    public void addNew (QueueElement queueElement) {
        if (first == null) {
            first = queueElement;
        }
        while (queueElement.getNext()!= null) {
            queueElement.setNext(queueElement);
        }
    }


}
