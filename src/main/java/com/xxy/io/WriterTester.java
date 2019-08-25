package com.xxy.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTester{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
