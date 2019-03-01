public enum HousePrice {
    AJNARA("ajnara");
//    SUPERTECH(3525410),PANCHSHEEL(3614521);

    private String price;

    HousePrice(String s)
    {
        this.price=s;
    }

    public String getPrice() {
        return price;
    }
}
