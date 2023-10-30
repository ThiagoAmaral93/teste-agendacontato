/**
 * Trabalho de POO
 * 
 * @author Mauricio Soto, Rodrigo Pereira, Thiago Amaral
 * @version 1.0.0
 */
import java.util.Date;
import java.sql.Timestamp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Contato {

  private int ID;
  private String nome;
  private String telefone;
  private String email;
  private String aniversario;

  public Contato(int ID, String nome, String telefone) {
    this.setID();
    this.setNome(nome);
    this.setTelefone(telefone);
  }

  public int getID() {
    return ID;
  }

  public void setID() {
    Date date = new Date();
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    long milis = timestamp.getTime();
    this.ID = (int) milis;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome != null && !nome.isEmpty() && nome.length() > 3) {
      this.nome = nome;
    } else {
      throw new IllegalArgumentException("Nome do contato é obrigatório.");
    }
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    if (telefone != null && !telefone.isEmpty() && telefone.length() > 7) {
      this.telefone = telefone;
    } else {
      throw new IllegalArgumentException("Telefone do contato é obrigatório.");
    }
  }

  public String getEmail() {
    return this.email;
  }

  public static boolean isValidEmail(String email) {
    String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

  public void setEmail(String email) {
    if (isValidEmail(email)) {
      this.email = email;
    } else {
      System.out.println("Email Invalido!");
    }
  }

  public String getAniversario() {
    return this.aniversario;
  }

  public void setAniversario(String aniversario) {
    this.aniversario = aniversario;
  }
}
