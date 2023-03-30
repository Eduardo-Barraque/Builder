package Builder;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getId() == 0) {
            throw new IllegalArgumentException("Id Inválido");
        }
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome Inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setId(int id) {
        funcionario.setId(id);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCPF(cpf);
        return this;
    }

    public FuncionarioBuilder setSetor(String setor) {
        funcionario.setSetor(setor);
        return this;
    }

    public FuncionarioBuilder setFuncao(String funcao) {
        funcionario.setFuncao(funcao);
        return this;
    }

    public FuncionarioBuilder setCEP(String cep) {
        funcionario.setCEP(cep);
        return this;
    }

    public FuncionarioBuilder setTipoSangue(String tipoSangue) {
        funcionario.setCEP(tipoSangue);
        return this;
    }

    public FuncionarioBuilder setIdade(String idade) {
        funcionario.setCEP(idade);
        return this;
    }
}