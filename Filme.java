package Todo;

public class Filme {
    private static int contadorId = 0;

    public Filme(String titulo) {

        this.id = contadorId++;
    }

    private int id;
    private String titulo;
    private String genero;
    private boolean assistido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "Título: " + titulo +
                "Genero: " + genero;
    }

}