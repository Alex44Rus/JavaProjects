public class task1 {
    public static void main(String[] args) {
        int [][] arr = new int [3][5];
        for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr[i].length;j++){
                System.out.printf("%d", arr[i][j]);
                
            }
        }
        System.out.println();
        

    }

    static String getType(Object o){
    return o.getClass().getSimpleName();
}
}
