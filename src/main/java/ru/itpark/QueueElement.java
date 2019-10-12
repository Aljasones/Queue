package ru.itpark;

public class QueueElement {
    private Person person;
    private QueueElement next;

    public QueueElement(int id, String name) {
       this.person = new Person (id, name);
    }

      public QueueElement getNext() {
       return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}


