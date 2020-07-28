public class Phone {

    public static void main(String[] args){
        Phone myPhone=new Phone();
        myPhone.call();
        String TextMessage = myPhone.SendText();
        System.out.println(TextMessage);
        
    }
    public void call(){
        System.out.println("I can use my Phone to make a call.");
    }

    public String SendText(){
        int numberOfMessage = 3;
        String TextMessage = " Hi, How are you doing?";
        return TextMessage;
    }

}
