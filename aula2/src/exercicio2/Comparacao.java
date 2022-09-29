package exercicio2;

public class Comparacao {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        int x = 3;
        int y = 2;
        int z = 1;
        // combinações possíveis em sucessivos if...else
        if (x <= y && x <= z && y <= z) { // x,y,z
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        } else if (x <= y && x <= z && z <= y) { // x,z,y
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        } else if (y <= x && y <= z && x <= z) { // y,x,z
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        } else if (y <= x && y <= z && z <= x) { // y,z,x
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        } else if (z <= x && z <= y && x <= y) { // z,x,y
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        } else { // z,y,x
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }
    }
}
