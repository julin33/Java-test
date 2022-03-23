package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo1 {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(6666);

        //准备接收包裹
        byte[] container = new byte[1024];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        while (true) {
            socket.receive(packet);//阻塞式接受包裹

            //断开连接 bye
            String receiveData = new String(packet.getData(),0,packet.getLength());
            System.out.println(receiveData);
            if (receiveData.equals("bye")) {
                break;
            }
        }

        socket.close();


    }
}
