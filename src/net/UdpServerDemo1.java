package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServerDemo1 {
    public static void main(String[] args) throws Exception{
        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);
        //接受数据包
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,0,buf.length);

        socket.receive(packet);//阻塞接收


        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0, packet.getLength()));

        //关闭连接
        socket.close();

    }


}
