package org.example.structural_patterns.proxy.images;

public class ClientImageTest {
    public static void main(String[] args) {

        Image image = new ProxyImage("img_10.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will NOT be loaded from disk
        image.display();
    }
}
