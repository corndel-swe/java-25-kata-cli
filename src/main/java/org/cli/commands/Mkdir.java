package org.cli.commands;

import org.cli.utils.Directory;
import org.cli.utils.Learners;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Paths;

@CommandLine.Command(name = "mkdir", description = "Reads learners from src/main/resources/learners.csv creating directories in:\n - src/main/java/org/kata/LEARNER \n - src/test/java/org/kata/LEARNER")
public class Mkdir implements Runnable {
    @Override
    public void run() {
        try {
            Learners learners = new Learners();
            Directory kataDirectory = new Directory(Paths.get("src", "main", "java", "org", "kata"));
            Directory testDirectory = new Directory(Paths.get("src", "test", "java", "org", "kata"));

            for (String learner : learners.getLearners()) {
                kataDirectory.createSubDirectory(learner);
                testDirectory.createSubDirectory(learner);
            }
        } catch (IOException e) {
            System.out.println("No file found");
        }
    }

}
