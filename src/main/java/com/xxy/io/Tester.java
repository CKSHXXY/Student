package com.xxy.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
//        inputstream();
//        fileReader();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1){
                System.out.println((char)n);
                n = fr.read();
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
//            System.out.println(n);
            while (n != -1){
                System.out.println((char)n);
                n = is.read();
            }
            System.out.println();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
