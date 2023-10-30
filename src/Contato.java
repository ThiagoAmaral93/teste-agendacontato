public class Contato {
    private int ID;
    private String nome;
    private String telefone;
    private String email;
    private String aniversario;

    public Contato(int ID, String nome, String telefone) {
        this.ID = ID;
        this.setNome(nome);
        this.setTelefone(telefone);
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome do contato é obrigatório.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.isEmpty()) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Telefone do contato é obrigatório.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}