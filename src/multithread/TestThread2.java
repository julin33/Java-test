package multithread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 练习Thread 实现多线程同步下载图片
 * （改为实现Runnable接口）
 */
public class TestThread2 implements Runnable{
    private String url;
    private String name;

    public TestThread2(String url,String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://wx3.sinaimg.cn/mw690/007Y7SRMly1h0cvag35nxj30on0xdq7w.jpg","1.jpg");
        TestThread2 t2 = new TestThread2("https://wx2.sinaimg.cn/mw690/008ro9Eqgy1h0cuw6zp7pj30u0190teu.jpg","2.jpg");
        TestThread2 t3 = new TestThread2("https://wx4.sinaimg.cn/mw690/83f470acly1h0cpj9q467j20p00e4778.jpg","3.jpg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();


    }
}

//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }

}
