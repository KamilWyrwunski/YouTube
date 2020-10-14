package pl.jaknauczycsieprogramowania.drive;

import pl.jaknauczycsieprogramowania.File;

public interface Drive {
    void addFiles(File file);
    void listFiles();
     File findFile(String name);
}
