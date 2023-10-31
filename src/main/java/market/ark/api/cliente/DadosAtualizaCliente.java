package market.ark.api.cliente;

import jakarta.validation.constraints.NotNull;
import market.ark.api.endereco.DadosEndereco;

public record DadosAtualizaCliente(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
