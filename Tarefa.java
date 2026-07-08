package Todo;

public class Tarefa {
    private static int contadorId = 0;

    private int id;
    private String titulo;
    private String data;
    private boolean concluida;
    private NivelDeImportancia importancia;

    public enum NivelDeImportancia {
        NAO_IMPORTANTE,
        IMPORTANTE,
        MUITO_IMPORTANTE
        }

    public Tarefa(String titulo, NivelDeImportancia importancia) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.importancia = importancia;
        this.concluida = false;

    }

    public static int getid() {
        return contadorId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NivelDeImportancia getImportancia() {
        return importancia;
    }

    public void setImportancia(NivelDeImportancia importancia) {
        this.importancia = importancia;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", data='" + data + '\'' +
                ", concluida=" + concluida +
                ", importancia=" + importancia +
                '}';
    }
}
