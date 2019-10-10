package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueServiceTest {
    QueueService queueService = new QueueService();
    @Test
    public void addElements() {
        int i;
        for (i=0; i<10; i++) {
            QueueElement queueElement = new QueueElement("Name"+i, i);
            queueService.addNew(queueElement);
        }
         assertEquals(i, queueService.queueSize());
    }

    @Test
    public void deleteFirst(){
        int test;
        for (test=0; test<5; test++) {
            QueueElement queueElement = new QueueElement("Name"+test, test);
            queueService.addNew(queueElement);
        }
        queueService.deleteFirst();
        assertEquals(test-1, queueService.queueSize());

    }
}
