package Todo;

public class Insight {
    private static int contadorId = 0;

    public Insight(String titulo) {
        this.id = contadorId++;
    }
    private int id;
    private String titulo;
    private String ideia;
    private boolean escrito;

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

    public String getIdeia() {
        return ideia;
    }

    public void setIdeia(String ideia) {
        this.ideia = ideia;
    }

    public boolean isEscrito() {
        return escrito;
    }

    public void setEscrito(boolean escrito) {
        this.escrito = escrito;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                "Título: " + titulo +
                "Ideia: " + ideia;
    }

}
