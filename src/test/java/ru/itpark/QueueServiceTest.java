package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueServiceTest {
    QueueService queueService = new QueueService();
    Person person1 = new Person(1, "Name1");
    Person person2 = new Person(2, "Name2");
    Person person3 = new Person(3, "Name3");

    @Test
    public void addNew(){
        QueueElement element = new QueueElement(person1);
        queueService.addNew(person1);
        assertEquals(element.getPerson().getId(), queueService.getFirst().getPerson().getId());
    }

    @Test
    public void checkSize() {
        queueService.addNew(person1);
        queueService.addNew(person2);
        queueService.addNew(person3);
        int i = 3;
        assertEquals(i, queueService.queueSize());

    }

    @Test
    public void deleteFirst(){
        int test = 2;
        queueService.addNew(person1);
        queueService.addNew(person2);
        queueService.deleteFirst();
        assertEquals(test-1, queueService.queueSize());

    }
    @Test
    public void deleteAll(){
        queueService.addNew(person1);
        queueService.deleteFirst();
        queueService.deleteFirst();
        assertEquals(0, queueService.queueSize());
    }

}
