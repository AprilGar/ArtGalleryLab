package ArtGallery;

import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> artwork;

    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
    }

    public int acceptPayment(int payment){
        
        till += payment;
        return till;
    }

//    public void addArtwork(Artwork artwork){
//        this.artwork.add(artwork);
//    }

}
