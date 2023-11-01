package market.ark.api.produto;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import market.ark.api.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastraProduto dados) {
        repository.save(new Produto(dados));
    }

    @GetMapping
    public Page<Produto> getProdutos(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaProduto dados) {
        Produto produto = repository.getReferenceById(dados.id());
        produto.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
