package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * 客户端
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        //提高作用域
        OutputStream os = null;
        Socket socket = null;

        try {
            //1. 要知道服务器地址
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //2. 创建一个socket链接
            socket = new Socket(serverIP,port);
            //3. 发消息io流
            os = socket.getOutputStream();

            os.write("你好，你是猪吗？".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流，规范处理异常
            if (os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
