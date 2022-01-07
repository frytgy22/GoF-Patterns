package patterns.behavioral.templateMethod;

import patterns.behavioral.templateMethod.fileWriter.FIleWriter;
import patterns.behavioral.templateMethod.fileWriter.impl.FileTimeWriter;

public class Main {
    public static void main(String[] args) {
        FIleWriter fIleWriter = new FileTimeWriter();
        fIleWriter.writeData();
    }
}