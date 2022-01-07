package patterns.behavioral.templateMethod.fileWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public abstract class FIleWriter {

    public void writeData() {
        try (PrintWriter writer = new PrintWriter(getFileName(), "UTF-8")) {
            writeToFile(writer);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    protected abstract void writeToFile(PrintWriter writer);

    protected abstract String getFileName();
}
