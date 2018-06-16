public class Pessoa {

    private String cpf;
    private String nomePessoa;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    public Pessoa(String cpf, String nomePessoa, String cep, String endereco, String numero, String complemento,
                         String bairro, String cidade, String estado, String telefone){
        this.setCpf(cpf);
        this.setNomePessoa(nomePessoa);
        this.setCep(cep);
        this.setEndereco(endereco);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setTelefone(telefone);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String retornaDadosPessoais(){
        String dadosPessoais = this.getCpf()+ ", " + this.getNomePessoa() + ", " +
                this.getCep() + ", " + this.getEndereco() + ", " + this.getNumero() + ", " +
                this.getComplemento() + ", " + this.getComplemento() + ", " + this.getBairro() + ", " +
                this.getCidade() + ", " + this.getEstado() + ", " + this.getTelefone();
        return dadosPessoais;
    }

}
