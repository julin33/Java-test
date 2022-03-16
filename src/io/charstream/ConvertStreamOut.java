package io.charstream;
/**
 * OutputStreamWriter的使用
 */

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class ConvertStreamOut {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("d:\\lx\\Convert.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        for (int i = 0; i < 10; i++) {
            osw.write("奥利给兄弟们干了\n");
            osw.flush();
        }

        osw.close();

    }
}
