package Todo;

public class Filme {
    private static int contadorId = 0;
    private int id;

    public Filme(String titulo) {
        this.id = contadorId++;
    }
}