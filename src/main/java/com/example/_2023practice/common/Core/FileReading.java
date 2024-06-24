package com.example._2023practice.common.Core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReading {


        //what will be the output?
        public static void main(String[] args) {
            try (InputStream inputStream = new FileInputStream("D://file.txt");
                 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
                while (bufferedInputStream.available() > 0) {
                    System.out.println((char) bufferedInputStream.read());
                    if (bufferedInputStream.available() <= 0)
                        inputStream.reset();//this will throw IO exception as it is not supported
                     }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

}
