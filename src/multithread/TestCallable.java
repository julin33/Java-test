package multithread;
/**
 * 线程创建方式三：实现callable接口
 * Callable的好处：
 * 1.可以定义返回值
 * 2.可以抛出异常
 */


import java.util.concurrent.*;


public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url,String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() { //返回值是Boolean类
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://wx3.sinaimg.cn/mw690/007Y7SRMly1h0cvag35nxj30on0xdq7w.jpg","1.jpg");
        TestCallable t2 = new TestCallable("https://wx2.sinaimg.cn/mw690/008ro9Eqgy1h0cuw6zp7pj30u0190teu.jpg","2.jpg");
        TestCallable t3 = new TestCallable("https://wx4.sinaimg.cn/mw690/83f470acly1h0cpj9q467j20p00e4778.jpg","3.jpg");

        //创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = service.submit(t1);
        Future<Boolean> r2 = service.submit(t2);
        Future<Boolean> r3 = service.submit(t3);

        //获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        //关闭服务
        service.shutdown();
    }

}
