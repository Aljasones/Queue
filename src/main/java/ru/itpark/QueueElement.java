package ru.itpark;

public class QueueElement {
    private Person person;
    private QueueElement next;

    public QueueElement(String name, int id) {
       this.person = new Person (name, id);
    }

      public QueueElement getNext() {
       return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}


