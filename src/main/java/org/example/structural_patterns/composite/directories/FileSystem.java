package org.example.structural_patterns.composite.directories;

public class FileSystem {
    private File allFiles;

    public FileSystem(File allFiles) {
        this.allFiles = allFiles;
    }

    public void printFiles() {
        allFiles.showInfo();
    }

}
