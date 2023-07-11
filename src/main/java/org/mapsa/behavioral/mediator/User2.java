package org.mapsa.behavioral.mediator;

public class User2 extends User {
    private String name;
    private ChatRoom chat;
    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg,this);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User2(ChatRoom chat){
        this.chat=chat;
    }
}
