package market.ark.api.cliente;

import market.ark.api.ClienteRepository;
import market.ark.api.cliente.Cliente;
import market.ark.api.cliente.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }

    @GetMapping
    public Page<Cliente> getClientes(Pageable paginacao) {
        return repository.findAll(paginacao);
    }
}

