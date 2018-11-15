package myProjects.Task_1.Part_1_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderOfFile {

    private String theFileName;

   // public ReaderOfFile (){}

    public ReaderOfFile(String fileName) {
        this.theFileName = fileName;
    }

    public synchronized void readerOfFile(String fileName) throws IOException {
        while (fileName.equals("")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        FileReader fileReader = new FileReader(fileName); // announce object and read file
        BufferedReader bufReader = new BufferedReader(fileReader);
        String line;
        StringBuilder sb = new StringBuilder();
        String separationLine = System.getProperty("line.separator");
        try{
            while ((line = bufReader.readLine()) !=null){
                sb.append(line).append(separationLine);
                // sb.append(separationLine);
            }
        }catch (IOException e){
            bufReader.close();
        }

        theFileName =  sb.toString();
        notify();
    }
    // transformation text file into bytes
    public byte[] getByteFromFile(){
        return theFileName.getBytes();
    }

    public synchronized void checkByteSequence(){
        try {
            wait();
            System.out.println("We search method waiting for notify()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // method for searching the longest repeating byte sequence in the file
        byte[] dataFromFile = getByteFromFile();
        int counter = 0;
        int resetCounter = -1;
        int counterRepeat = 0;
        int maxValueOfRepeat = 1;
        for (int i = 1; i < dataFromFile.length; i++) {
            if (dataFromFile[i - 1] == dataFromFile[i]) {
                counter++;
                counterRepeat = dataFromFile[i];
                System.out.print(" "+counter+" ");
            } else if (counter > maxValueOfRepeat) {
                maxValueOfRepeat = counter;
                resetCounter = counterRepeat;
            } else if (dataFromFile[i - 1] != dataFromFile[i]) {
                counter = 1;
            }
        }
        notify();
        System.out.println("Maximum repeating byte sequence in file is: " + maxValueOfRepeat + "  " + resetCounter);
    }
}




