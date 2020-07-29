public class MyCar {
    public static void main(String[] args){
        MyCar SmoothCar = new MyCar();
        SmoothCar.RedToyota();
        String SUV = SmoothCar.RedToyota();
        System.out.println(SUV);

        Lotion myLotion = new Lotion();
        myLotion.Brand();
        String Johnson = myLotion.Brand();
        System.out.println(Johnson);

        Book myBook = new Book();
        myBook.JurasicPark();
        String go = myBook.JurasicPark();
        System.out.println(go);

    }
    public String RedToyota(){
        String SUV = "My Car is very smooth. I love to drive my car";
        return SUV;
    }
}
