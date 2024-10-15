package org.salesianos.util;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    public static Process initIsPrime(int number, String outputFile) throws IOException {
        final String FILE = "./src/org/salesianos/function/IsPrime.java";
        ProcessBuilder builder = new ProcessBuilder("java", FILE, String.valueOf(number));
        builder.redirectOutput(new File(outputFile));
        builder.redirectError(new File("./output/error/ErrorFile.txt"));
        return builder.start();
    }
}
