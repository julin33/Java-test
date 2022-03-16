package net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception{
        //1. 创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        //2. 监听客户端
        Socket socket = serverSocket.accept();//阻塞式监听，会一直等待客户端
        //3. 获取输入流
        InputStream is = socket.getInputStream();
        //4. 文件输出 管道流
        FileOutputStream fos = new FileOutputStream("receive.png");

        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            fos.write(buf,0,len);
        }

        //通知客户端我接收完毕了
        OutputStream os = socket.getOutputStream();
        os.write("我接受完毕了，你可以断开".getBytes());

        //5. 关闭资源
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
