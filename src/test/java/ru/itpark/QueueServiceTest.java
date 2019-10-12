package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueServiceTest {
    QueueService queueService = new QueueService();
    @Test
    public void addNew(){
        QueueElement addNew = new QueueElement(01, "OtherName");
        queueService.addNew(addNew);
        QueueElement added = queueService.getFirst();
        assertEquals(addNew, added);
    }

    @Test
    public void checkSize() {
        int i;
        int hundred = 100;
        for (i=0; i<hundred; i++) {
            QueueElement element = new QueueElement(i,"Name"+i);
            queueService.addNew(element);
        }
         assertEquals(i, queueService.queueSize());
    }

    @Test
    public void deleteFirst(){
        int test;
        int ten = 10;
        for (test=0; test<ten; test++) {
            QueueElement element = new QueueElement(test, "Name"+test);
            queueService.addNew(element);
        }
        queueService.deleteFirst();
        assertEquals(test-1, queueService.queueSize());

    }
    @Test
    public void deleteAll(){
        int test;
        int ten = 10;
        for (test=0; test<ten; test++) {
            QueueElement element = new QueueElement(test, "Name"+test);
            queueService.addNew(element);
        }
        for (test=0; test<11; test++) {         //11 раз, чтобы first == null в 11й раз
            queueService.deleteFirst();
        }
        assertEquals(0, queueService.queueSize());
    }

}
