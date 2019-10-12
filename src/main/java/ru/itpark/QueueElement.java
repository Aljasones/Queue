package ru.itpark;

public class QueueElement {
    private Person person;
    private QueueElement next;

    public QueueElement(Person person) {
        this.person = person;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }


}


