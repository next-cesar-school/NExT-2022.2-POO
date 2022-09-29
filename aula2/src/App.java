public class App {
    public static void main(String[] args) throws Exception {
        int contador = 10;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("-----------------");
        contador = 10;
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);

        int x = 1;

        int y = x == 1 ? 10 : 20;

        if (x == 1) {
            y = 10;
        } else {
            y = 20;
        }

        int list1[];

        list1 = new int[2];

        int[] list2;

        list2 = new int[3];

        int[] list3 = new int[5];
        list3[3] = 100;

        System.out.println(list3.length);

        int[][] matriz = new int[2][2];

        matriz[0][0] = 50;
        matriz[0][1] = 90;
        matriz[1][0] = 370;
        matriz[1][1] = 1920;
    }
}
