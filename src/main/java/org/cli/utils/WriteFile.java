package org.cli.utils;

import org.cli.utils.copy.CopyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {
    private final Path path;
    private final String learner;
    private final CopyFile copyFile;

    public WriteFile(CopyFile copyFile, String learner) {
        this.path = Paths.get(copyFile.getWritePath().toString(), learner, copyFile.getFileName());
        this.learner = learner;
        this.copyFile = copyFile;
    }

    public boolean exists() {
        return path.toFile().exists();
    }

    public void writeFile() throws IOException {
        String content = copyFile.getFileContentForLearner(learner);
        Files.writeString(path, content);
    }
}
