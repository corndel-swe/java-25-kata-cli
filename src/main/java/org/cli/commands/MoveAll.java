package org.cli.commands;

import org.cli.utils.Learners;
import org.cli.utils.WriteFile;
import org.cli.utils.copy.CopyFile;
import org.cli.utils.copy.KataFile;
import org.cli.utils.copy.TestFile;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@CommandLine.Command(name = "move-all")
public class MoveAll implements Runnable {
    @Override
    public void run() {
        try {
            Learners learners = new Learners();
            List<CopyFile> filesToWrite = getFilesToWrite();
            writeFilesToLearnerDirectories(learners, filesToWrite);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static List<CopyFile> getFilesToWrite() throws IOException {
        List<CopyFile> filesToWrite = new ArrayList<>();
        Path kataDirectory = Paths.get("src", "main", "java", "org", "cli", "katas");
        Path testDirectory = Paths.get("src", "test", "java", "org", "cli", "katas");

        try (Stream<Path> kataFiles = Files.list(kataDirectory); Stream<Path> testFiles = Files.list(testDirectory)) {
            for (Path file : kataFiles.toList()) {
                filesToWrite.add(new KataFile(kataDirectory, file.getFileName().toString()));
            }
            for (Path file : testFiles.toList()) {
                filesToWrite.add(new TestFile(testDirectory, file.getFileName().toString()));
            }
        }

        return filesToWrite;
    }

    private static void writeFilesToLearnerDirectories(Learners learners, List<CopyFile> filesToWrite) throws IOException {
        for (String learner : learners.getLearners()) {
            for (CopyFile copyFile : filesToWrite) {

                WriteFile toWrite = new WriteFile(copyFile, learner);
                if (!toWrite.exists()) {
                    System.out.println("Creating " + learner + "/" + copyFile.getFileName());
                    toWrite.writeFile();
                } else {
                    System.out.println("File exists...");
                }
            }
        }
    }
}
