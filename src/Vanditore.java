public class Vanditore {

    private String nome, cognome;
    private String città;
    private String username;
    private Sesso sesso;

    public Vanditore(String nome, String cognome, String città, String username, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.città = città;
        this.username = username;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCittà() {
        return città;
    }

    public String getUsername() {
        return username;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
}
