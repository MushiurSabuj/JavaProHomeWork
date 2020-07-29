public class Lotion {

    public static void main(String[] args){
        Lotion myLotion = new Lotion();
        myLotion.Brand();
        String Johnson = myLotion.Brand();
        System.out.println(Johnson);
    }
    public String Brand(){
        String Johnson = "We have varity of products";
        return Johnson;
    }
}
