package net;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class TcpServerDemo01 {
    public static void main(String[] args) {
        //提升一下作用域
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;



        try {
            //1. 我有一个地址
            serverSocket = new ServerSocket(9999);
            //2. 等待客户端链接过来
            socket = serverSocket.accept();
            //3. 读取客户端的消息
            is = socket.getInputStream();

            //lowb方法，问题很多
            /* byte[] buf = new byte[1024];
            int count = 0;
            while ((count = is.read(buf)) != -1) {
                System.out.println(new String(buf,0,count));
            }*/

            //管道流
            baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {
               baos.write(buf,0,len);
            }
            System.out.println(baos.toString());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //从后到前依次关闭流 （虽然很麻烦但是是规范形式）
            if (baos!=null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null) {
                try {
                    is.close();
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
            if (serverSocket!=null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
