package Todo;

public class Livro {
    private static int contadorId = 0;
    private int id;

    public Livro(String titulo) {
        this.id = contadorId++;
    }
}
