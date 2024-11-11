package ru.spbstu.telematics.java;

import java.io.*;


public class App {
    public static void main(String[] args) throws IOException {
        String prerecording = "Строка для дозаписи \n";
        WriteFileTxt("src/main/resources/processed_file.txt", prerecording);
    }


    public static void WriteFileTxt(String path, String buf) throws IOException {
        FileWriter file_to_write = new FileWriter(path, true);
        file_to_write.write(buf);
        file_to_write.flush();
        file_to_write.close();
        System.out.println("Произошла дозапись в файл");
    }
    
    public static String ReadTxt(String path) throws IOException {
        FileReader file_to_read = new FileReader(path);
        String information = "";
        int x;
        while ((x = file_to_read.read()) != -1){
            information += Character.toString(x);
        }
        file_to_read.close();
        return information;
    }

}
