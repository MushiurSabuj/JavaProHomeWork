public class MultipleClass {
    public static void main(String[] args){
        int [][] Numbers = {{1,7,9}, {2,5,6}};
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[i].length; ++j) {
                System.out.println(Numbers[i][j]);
            }

        }
    }
}
