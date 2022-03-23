package net;

public class TalkUser2 {
    public static void main(String[] args) {
        TalkReceive receive = new TalkReceive(9999,"傻逼");
        TalkSender sender = new TalkSender(8888, "localhost", 7777);

        new Thread(sender).start();
        new Thread(receive).start();
    }
}
