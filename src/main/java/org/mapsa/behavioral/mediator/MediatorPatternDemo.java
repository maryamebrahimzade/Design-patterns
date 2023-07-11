package org.mapsa.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {

        ChatRoom chat = new ChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setName("Maryam");
        u1.sendMsg("Hi! how are you?");

        User2 u2=new User2(chat);
        u2.setName("Zahra");
        u2.sendMsg("I am Fine ! You tell?");
    }
}
