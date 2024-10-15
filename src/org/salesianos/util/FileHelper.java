package org.salesianos.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FileHelper {
    public static ArrayList<Integer> getAllNumbers(String inputFile) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))) {
            String line = reader.readLine();

            if (line != null) {
                String[] numbersString = line.split(",");

                for (String numberString : numbersString) {
                    int number = Integer.parseInt(numberString);
                    numbers.add(number);
                }

            }

        } catch (Exception e) {
            System.out.println(" Can´t read file " + inputFile);
        }
        return numbers;
    }

    public static void mergePrimeFiles(ArrayList<String> numbersTemp, String outputFile) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String route : numbersTemp) {
                File file = new File(route);
                if (file.exists() && file.length() != -1) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line = reader.readLine();
                        while (line != null) {
                            writer.write(line);
                            writer.newLine();
                            line = reader.readLine();
                        }
                    } catch (Exception e) {
                        System.out.println(" Can´t read file: " + file);
                    }
                } else {
                    System.out.println("File doesn't exist or empty file: " + file);
                }
            }
        } catch (Exception e) {
            System.out.println("Error writing to file.");
        }
    }

    public static int getNumbersCount(String outputFile) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile, StandardCharsets.UTF_8))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Integer.parseInt(line.trim());
                    count++;
                } catch (Exception e) {
                    System.out.println("There is no number on the line.");
                }
            }

        } catch (Exception e) {
            System.out.println("Can´t read file:");
        }
        return count;
    }

    public static void showPrimes(String outputPath) throws IOException {

        System.out.println("Prime numbers found: ");
        try (BufferedReader reader = new BufferedReader(new FileReader(outputPath))) {
            String linea = reader.readLine();

            while (linea != null) {
                System.out.println(linea.trim());
                linea = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println("Can´t read file:" + outputPath);
        }
    }
}
