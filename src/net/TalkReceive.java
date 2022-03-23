package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    DatagramSocket socket = null;
    private int localPort;
    private String msgFrom;

    public TalkReceive(int localPort,String msgFrom) {
        this.localPort = localPort;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(localPort);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        //准备接收包裹
        byte[] container = new byte[1024];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        try {
            while (true) {
                socket.receive(packet);//阻塞式接受包裹
                //断开连接 bye
                String receiveData = new String(packet.getData(),0,packet.getLength());
                System.out.println(msgFrom +":" + receiveData);
                if (receiveData.equals("bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
