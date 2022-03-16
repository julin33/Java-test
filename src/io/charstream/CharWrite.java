package io.charstream;

import java.io.FileWriter;

public class CharWrite {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("d:\\lx\\file.txt");

        for (int i = 0; i < 10; i++) {
            fw.write("哈哈你就是个小丑\n");
            fw.flush();
        }

        fw.close();
    }
}
