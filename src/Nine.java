public class Nine {

    public static void main(String[] args) {
        for (HousePrice houseprice : HousePrice.values()
        ) {
            System.out.println("Name of housing society : " + houseprice.toString()+
                    " || Price is : " + houseprice.getPrice());

        }


    }

}
