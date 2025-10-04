package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class KataFile extends CopyFile {

    private static final Path KATA_WRITE_PATH = Paths.get("src", "main", "java", "org", "kata");

    public KataFile(Path basePath, String fileName) throws IOException {
        super(basePath, fileName);
    }

    @Override
    public Path getWritePath() {
        return KATA_WRITE_PATH;
    }

}
