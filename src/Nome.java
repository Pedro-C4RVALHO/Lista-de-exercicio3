package listas.lista01.nome;

public class Nome {
    private String titulo;
    private String nomePrincipal;
    private String nomeDoMeio;
    private String ultimoNome;

    public Nome(String titulo, String nomePrincipal, String nomeDoMeio, String ultimoNome) {
        this.titulo = titulo;
        this.nomePrincipal = nomePrincipal;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto() {
        if (nomeDoMeio == null) {
            return titulo + " " + nomePrincipal + " " + ultimoNome;
        }
        return titulo + " " + nomePrincipal + " " + nomeDoMeio + " " + ultimoNome;
    }
}
