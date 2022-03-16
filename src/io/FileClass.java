package io;

import java.io.File;
import java.io.FileFilter;
import java.security.spec.ECField;
import java.util.Date;

/**
 * File类的使用
 * （1）分隔符
 * （2）文件操作
 * （3）文件夹操作
 */
public class FileClass {
    public static void main(String[] args) throws Exception{
        separator();
        System.out.println("=======================");
        fileOperate();
        System.out.println("=======================");
        directoryOperate();
    }
    //1. 分隔符
    public static void separator(){
        System.out.println("路径分隔符" + File.pathSeparator);
        System.out.println("名称分隔符" + File.separator);
    }
    //2. 文件操作
    public static void fileOperate() throws Exception {
        //(1)创建文件
        File file = new File("d:\\lx\\file.txt");//创建的只是对象，不一定存在在硬盘里
        System.out.println(file.toString());
        if(!file.exists()){
            boolean b = file.createNewFile();
            System.out.println("创建结果：" + b);
        }

        //(2)删除文件
        //直接删除
//        System.out.println("删除结果" + file.delete());
        //使用JVM退出时自动删除
//        file.deleteOnExit();
//        Thread.sleep(5000);//休眠五秒删除

        //(3)获取文件信息
        System.out.println("获取绝对路径" + file.getAbsolutePath());
        System.out.println("获取路径" + file.getPath());
        System.out.println("获取文件名称" + file.getName());
        System.out.println("获取父目录" + file.getParent());
        System.out.println(("获取文件长度") + file.length());
        System.out.println("文件创建时间" + new Date(file.lastModified()).toLocaleString());

        //(4)判断
        System.out.println("是否可写:" + file.canWrite());
        System.out.println("是否是文件:" + file.isFile());
        System.out.println("是否隐藏：" + file.isHidden());

    }
    //3. 文件夹操作
    public static void directoryOperate() throws Exception{
        //(1)创建文件夹
        File dir = new File("d:\\lx\\aaa\\bbb\\ccc");
        System.out.println(dir);
        if(!dir.exists()){
//            dir.mkdir();//只能创建单级目录
            System.out.println("创建结果" + dir.mkdirs());//创建多级目录
        }
        //(2)删除文件夹
        //直接删除
//        System.out.println("删除结果" + dir.delete());//只删除最后一级文件夹ccc，并且该目录必须为空
//        //JVM退出时自动删除
//        dir.deleteOnExit();
//        Thread.sleep(5000);

        //(3)获取文件夹信息
        System.out.println("获取绝对路径" + dir.getAbsolutePath());
        System.out.println("获取路径" + dir.getPath());
        System.out.println("获取文件夹名称" + dir.getName());
        System.out.println("获取父目录" + dir.getParent());
        System.out.println("获取创建时间" + new Date(dir.lastModified()).toLocaleString());

        //(4)判断
        System.out.println("是否是文件夹" + dir.isDirectory());
        System.out.println("是否隐藏" + dir.isHidden());

        //(5)遍历文件夹
        File dir2 = new File("d:\\壁纸");
        String[] files = dir2.list();
        System.out.println("-----------文件夹内容---------");
        for (String string : files) {
            System.out.println(string);
        }

        //(6)FileFilter的使用
        System.out.println("-----------FileFilter---------");
        File[] files2 = dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".jpg")){
                    return true;
                }
                return false;
            }
        });
        for (File file : files2) {
            System.out.println(file.getName());
        }


    }

}
