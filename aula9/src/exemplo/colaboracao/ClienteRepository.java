package exemplo.colaboracao;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    public Cliente getCliente(int clienteId) {
        // cliente uma instância da classe Cliente
        Cliente cliente = new Cliente(clienteId);
        // retorna um cliente
        return cliente;
    }

    public List<Cliente> getClientes() {
        // retorna todos os clientes
        return new ArrayList<Cliente>();
    }

    public boolean salvarCliente(Cliente cliente) {
        // salva o cliente definido
        return true;
    }
}
