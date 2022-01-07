package patterns.behavioral.templateMethod.fileWriter.impl;

import patterns.behavioral.templateMethod.fileWriter.FIleWriter;

import java.io.PrintWriter;
import java.time.LocalDate;

public class FileDateWriter extends FIleWriter {
    @Override
    public void writeToFile(PrintWriter writer) {
        writer.print(LocalDate.now());
    }

    @Override
    protected String getFileName() {
        return "date.txt";
    }
}
