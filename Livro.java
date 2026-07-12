package Todo;

public class Livro {
    private static int contadorId = 0;

    public Livro(String titulo) {
        this.id = contadorId++;
    }

    private int id;
    private String tituloLivro;
    private String autor;
    private boolean lido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return tituloLivro;
    }

    public void setTitulo(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                "\nTítulo: " + tituloLivro +
                "\nAutor: " + autor +
                "\nLido: " + (lido ? "Sim" : "Não");
    }
}
