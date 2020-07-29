public class Glass {

    public static void main(String[] args){

        Glass myGlass =new Glass();
        myGlass.Test();
        String Drink = myGlass.Test();
        System.out.println(Drink);
    }

    public String Test(){
        String Drink ="I can Drink a glass of water";
        return Drink;
    }
}
