import exercicio1.Administrador;
import exercicio1.Vendedor;
import exercicio2.Gerente;

public class App {
    public static void main(String[] args) throws Exception {

        Vendedor v1 = new Vendedor("Gerson", "123456", 1000.0);

        v1.informaVendas(100);
        v1.informaVendas(100);
        v1.informaVendas(100);
        v1.informaVendas(100);

        v1.hollerith();

        Administrador adm1 = new Administrador("Gerson", "123456", 1000.0);

        adm1.informaHoras(10);
        adm1.informaHoras(10);
        adm1.informaHoras(10);

        adm1.hollerith();

        Gerente ge1 = new Gerente("Gerson", "12345678", 1000.0, "SCHOOL", "123456", 10);

        ge1.bonificarGerente();

        System.out.println(ge1.getSalario());

        System.out.println(ge1.autenticarSenha("1234567"));
    }
}
