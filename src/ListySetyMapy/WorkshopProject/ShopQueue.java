package ListySetyMapy.WorkshopProject;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShopQueue {
    Person person;
    int vipCounter = 1;
    private final Deque<Person> shopQueue = new ArrayDeque<>();

    public void addToQueue(String userChoice) {
        if (!userChoice.contains(", VIP")) {
            int counter = 1;
            String name = userChoice.substring(11, userChoice.indexOf("_"));
            String sureName = userChoice.substring(userChoice.indexOf("_") + 1, userChoice.length()-1);
            person = new Person(name, sureName, counter);

            for (Person person1 : shopQueue) {
                if (person.getSureName().equals(person1.getSureName()) && person.getName().equals(person1.getName())) {
                    counter = person1.getCounter()+1;
                }
            }
            if (counter > 1) {
                person = new Person(name, sureName, counter);
            }
            shopQueue.offer(person);
        } else {
            String name = userChoice.substring(11, userChoice.indexOf("_"));
            String sureName = userChoice.substring(userChoice.indexOf("_") + 1, userChoice.indexOf(","));
            person = new Person(name, sureName, vipCounter);
            shopQueue.push(person);
            vipCounter++;
        }
        queuePrint();
    }
    public void removeFromQueue(String userChoice) {
        //LEAVE PERSON(Imię_Nazwisko_nr)
        String name = userChoice.substring(13, userChoice.indexOf("_"));

        String sureNameTemp = userChoice.substring(userChoice.indexOf("_")+1);
        String sureName = sureNameTemp.substring(0, sureNameTemp.indexOf("_"));

        String counterTemp =sureNameTemp.substring(sureNameTemp.indexOf("_") + 1);
        int counter = Integer.parseInt(counterTemp.substring(counterTemp.indexOf("_")+1, counterTemp.indexOf(")")));

        Person tempPerson = new Person(name, sureName, counter);
        shopQueue.remove(tempPerson);
        queuePrint();
   }
    public void processQueue() {
        if(shopQueue.isEmpty()){
            System.out.println("Kolejka jest pusta, nie mam nic do obsłużenia :)");
            return;
        }
        shopQueue.poll();
        queuePrint();
    }
    private void queuePrint() {
        for (Person person1 : shopQueue) {
            System.out.println(person1);
        }
    }
}
