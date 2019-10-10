package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueServiceTest {
    QueueService queueService = new QueueService();
    @Test
    public void addNew(){
        QueueElement addNew = new QueueElement("OtherName", 01);
        queueService.addNew(addNew);
        QueueElement added = queueService.getFirst();
        assertEquals(addNew, added);
    }

    @Test
    public void checkSize() {
        int i;
        for (i=0; i<100; i++) {
            QueueElement element = new QueueElement("Name"+i, i);
            queueService.addNew(element);
        }
         assertEquals(i, queueService.queueSize());
    }

    @Test
    public void deleteFirst(){
        int test;
        for (test=0; test<10; test++) {
            QueueElement element = new QueueElement("Name"+test, test);
            queueService.addNew(element);
        }
        queueService.deleteFirst();
        assertEquals(test-1, queueService.queueSize());

    }
    @Test
    public void deleteAll(){
        int test;
        for (test=0; test<10; test++) {
            QueueElement element = new QueueElement("Name"+test, test);
            queueService.addNew(element);
        }
        for (test=0; test<11; test++) {         //11 раз, чтобы first == null в 11й раз
            queueService.deleteFirst();
        }
        assertEquals(0, queueService.queueSize());
    }

}
