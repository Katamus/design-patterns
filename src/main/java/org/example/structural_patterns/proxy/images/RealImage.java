package org.example.structural_patterns.proxy.images;

public class RealImage implements Image{

    private String imageFileName;

    public RealImage(String imageFileName){
        this.imageFileName = imageFileName;
        loadFromDisk(imageFileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + imageFileName);
    }

    private void loadFromDisk(String imageFileName){
        System.out.println("Loading " + imageFileName);
    }
}
