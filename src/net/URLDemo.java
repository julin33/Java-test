package net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://wx3.sinaimg.cn/mw690/007Y7SRMly1h0cvag35nxj30on0xdq7w.jpg");
        System.out.println(url.getHost());
        System.out.println(url.getProtocol());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());

        //连接到这个资源HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream is = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("4.jpg");

        int count = 0;
        byte[] buf = new byte[1024];
        while ((count = is.read(buf)) != -1) {
            fos.write(buf,0,count);
        }

        fos.close();
        is.close();
        urlConnection.disconnect();
    }
}
