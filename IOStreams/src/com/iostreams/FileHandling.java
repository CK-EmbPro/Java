package com.iostreams;

import java.io.*;

//When reading the the file we initially first read the bytes and then we can
// cast the bytes to the chars associated to the bytes values


public class FileHandling {
    public static void main (String[] args) throws IOException {
        try {
            InputStream in = new FileInputStream("rca.txt");
            OutputStream out = new FileOutputStream("copy.txt");
            int []data = new int[15];
//            data[0] = in.read();
//            data[1] = in.read();
//            data[2] = in.read();
//            data[3] = in.read();
//            data[4] = in.read();
//            data[5] = in.read();
//            data[6] = in.read();
//            data[7] = in.read();
//            data[8] = in.read();
//            data[10] = in.read();
//            data[11] = in.read();
//            data[12] = in.read();
//            data[13] = in.read();
//            data[14] = in.read();

            int k;
           while( (k=in.read()) !=-1){

               System.out.print(k);
               System.out.print((char)k);
               System.out.println();
               out.write(k);
           }


            System.out.print("This is a char of 255 "+(char)97);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
