import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private int count;

    

    public Agenda() {
        contatos = new ArrayList<>();
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }


    public void adiciona(Contato contato) {
        contatos.add(contato);
        count++;
    }

    public boolean remove(int ID) {
        for (Contato contato : contatos) {
            if (contato.getID() == ID) {
                contatos.remove(contato);
                count--;
                return true;
            }
        }
        return false;
    }

    public Contato busca(String chave) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(chave) || contato.getTelefone().equals(chave) || (contato.getEmail() != null && contato.getEmail().equals(chave))) {
                return contato;
            }
        }
        return null;
    }

    public void exibe(Contato contato) {
        if (contato != null) {
            System.out.println("ID: " + contato.getID());
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Aniversário: " + contato.getAniversario());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    

    public void exibeTodos() {
        for (Contato contato : contatos) {
            exibe(contato);
        }
    }
}