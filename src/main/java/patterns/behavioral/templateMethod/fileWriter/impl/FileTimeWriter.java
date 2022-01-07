package patterns.behavioral.templateMethod.fileWriter.impl;

import patterns.behavioral.templateMethod.fileWriter.FIleWriter;

import java.io.PrintWriter;
import java.time.LocalTime;

public class FileTimeWriter extends FIleWriter {
    @Override
    public void writeToFile(PrintWriter writer) {
        writer.print(LocalTime.now());
    }

    @Override
    protected String getFileName() {
        return "time.txt";
    }
}
