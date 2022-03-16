package net;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception{ //暴力点，直接抛出异常
        //1. 创建一个Socket链接
        Socket socket = new Socket("127.0.0.1",9000);
        //2. 创建一个输出流
        OutputStream os = socket.getOutputStream();

        //3. 文件流读取文件
        FileInputStream fis = new FileInputStream("d:\\lx\\QQ1.png");
        //4. 写出文件
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1) {
            os.write(buf,0,len);
        }

        //通知服务器我已经结束啦
        socket.shutdownOutput();//不然的话自己的Out会流给自己的In导致卡死

        //需要服务器接收完毕，才能断开连接
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf2 = new byte[1024];
        int len2;
        while ((len2 = is.read(buf2)) != -1) {
            baos.write(buf2,0,len2);
        }
        System.out.println(baos);

        //5. 关闭资源
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();

    }
}
