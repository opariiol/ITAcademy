package myProjects.Task_1.Part_1_3;

public class SearchingByteOrder implements Runnable {

    ReaderOfFile readerOfFile;

    // do our task into threads
    public SearchingByteOrder (ReaderOfFile readerOfFile){
        this.readerOfFile = readerOfFile;
    }

    @Override
    public void run() {
        readerOfFile.checkByteSequence();
    }
}
