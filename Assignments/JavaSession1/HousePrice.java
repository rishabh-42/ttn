public enum HousePrice {

    AJNARA(5014000),SUPERTECH(3525410),PANCHSHEEL(3614521);

    private int price;

    HousePrice(int price)
    {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
}
