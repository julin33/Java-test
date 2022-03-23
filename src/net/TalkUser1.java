package net;

public class TalkUser1 {
    public static void main(String[] args) {
        TalkSender sender = new TalkSender(6666, "localhost", 9999);
        TalkReceive receive = new TalkReceive(7777,"脑残");

        new Thread(sender).start();
        new Thread(receive).start();
    }
}
