package ArtGallery;


public class Customer {

    private String name;
    private int wallet;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }
    public void payGallery(Gallery gallery, Artwork artwork){
        if(this.wallet > artwork.getPrice()) {
            gallery.acceptPayment(getWallet());
            wallet -= artwork.getPrice();
        }
    }

    public int getWallet(){
        return wallet;
    }

}
