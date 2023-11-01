package market.ark.api.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaProduto(@NotNull Long id, String nome, String descricao, Double preco) {
}
