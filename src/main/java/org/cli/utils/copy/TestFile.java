package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFile extends CopyFile {

    private static final Path TEST_KATA_WRITE_PATH = Paths.get("src", "test", "java", "org", "kata");

    public static String getTestFileName(String fileName) {
        if(fileName.contains("Test.")){
            return fileName;
        }
        return fileName.split("\\.")[0] + "Test." + fileName.split("\\.")[1];
    }

    public TestFile(Path basePath, String fileName) throws IOException {
        super(basePath, getTestFileName(fileName));
    }

    @Override
    public Path getWritePath() {
        return TEST_KATA_WRITE_PATH;
    }

}
