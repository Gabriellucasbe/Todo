package Todo;

public class Tarefa {
    private static int contadorId = 0;
    private int id;

    public Tarefa(String titulo, nivelDeImportancia importante) {
        this.id = contadorId++;

    }

    public String titulo;
    public String data;

    public enum nivelDeImportancia {
        nao_importante,
        importante,
        muito_importante
    }

    public boolean concluida;

}