/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.poetry.io;

import java.io.*;

public class PoemClient {


    /**
     * To run one method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) throws IOException {
        readPoem();
        writePoem();
    }

    /**
     * TASK: read all the lines in file 'famous-poem.txt' and print them.
     * <p>
     * Avoid the temptation to open the file in the IDE first.
     * You'll see the poem once you get your code working(!)
     * <p>
     * This file is in the module's root directory, which is the current / working
     * directory at runtime.  Therefore, the path to the file is just the filename.
     * <p>
     * Use a BufferedReader wrapped around a FileReader.
     * The try-with-resources below allows you to initialize the stream and auto-close it.
     */
    private static void readPoem() throws FileNotFoundException {
        // TODO: initialize 'reader' variable and complete the try block
        try (BufferedReader reader = null) {
            BufferedReader input = new BufferedReader(new FileReader("Lab12.1/famous-poem.txt"));
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * TASK: write a Haiku to file 'haiku.txt'.
     * <p>
     * A Haiku is a 3-line poem with the following characteristics:
     * 1st line is 5 syllables
     * 2nd line is 7 syllables
     * 3rd line is 5 syllables
     * <p>
     * Use a PrintWriter wrapped around a FileWriter.
     * Use a try-with-resources to initialize the stream and auto-close it.
     */
    private static void writePoem() throws IOException {
        PrintWriter writer = null;
        // TODO
        try  {
            writer = new PrintWriter( new BufferedWriter(new FileWriter("Lab12.1/haiku.txt")));
            writer.println("Here's to our health.");
            writer.println("May we live full of vigor.");
            writer.println("Here's to our health.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}

