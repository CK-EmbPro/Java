import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "districts.txt";
        String outputFile = "out.txt";

        try {
            File fileToReadObj = new File(inputFile);
            File fileToWriteObj = new File(outputFile);

            if(fileToWriteObj.createNewFile()){
                System.out.println("The file is created");
            }else{
                System.out.println("The file already exists");
            }

            BufferedReader readBuff = new BufferedReader(new FileReader(fileToReadObj));
            BufferedWriter writeBuff = new BufferedWriter(new FileWriter(fileToWriteObj));

            String line;
            while((line = readBuff.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}