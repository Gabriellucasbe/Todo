package Todo;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        List<Livro> livro = new ArrayList<>();
        List<Filme> filme = new ArrayList<>();
        List<Insight> insight = new ArrayList<>();

        int menu = 0;
        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Tarefas");
            System.out.println("2 - Livros");
            System.out.println("3 - Filmes");
            System.out.println("4 - Insights");
            System.out.println("0 - Sair");
            menu = Integer.parseInt(scanner.nextLine());

            int opcao3 = 0;
            switch (menu) {
                case 1:
                    int opcao;
                    do {
                        System.out.println("===== MENU DE TAREFAS =====");
                        System.out.println("1-Adicionar tarefa");
                        System.out.println("2-listar tarefas");
                        System.out.println("3-Concluir tarefa");
                        System.out.println("0-Sair");
                        opcao = Integer.parseInt(scanner.nextLine());

                        switch (opcao) {
                            case 1:
                                System.out.println("Título da tarefa: ");
                                String titulo = scanner.nextLine();
                                System.out.println("Nível de importancia");
                                System.out.println("1-Não importante");
                                System.out.println("2-Importante");
                                System.out.println("3-Muito importante");
                                int nivel = Integer.parseInt(scanner.nextLine());

                                Tarefa.NivelDeImportancia importancia;
                                switch (nivel) {
                                    case 1:
                                        importancia = Tarefa.NivelDeImportancia.NAO_IMPORTANTE;
                                        break;
                                    case 2:
                                        importancia = Tarefa.NivelDeImportancia.IMPORTANTE;
                                        break;
                                    case 3:
                                        importancia = Tarefa.NivelDeImportancia.MUITO_IMPORTANTE;
                                        break;
                                    default: {
                                        System.out.println("Opção inválida, definido como Não importante");
                                        importancia = Tarefa.NivelDeImportancia.NAO_IMPORTANTE;
                                        break;
                                    }
                                }
                                Tarefa novaTarefa = new Tarefa(titulo, importancia);
                                tarefas.add(novaTarefa);
                                System.out.println("Tarefa adicionada!");
                                break;
                            case 2:
                                if (tarefas.isEmpty()) {
                                    System.out.println("Nenhuma tarefa cadastrada!");
                                } else {
                                    for (Tarefa t : tarefas) {
                                        System.out.println(t);
                                    }
                                }
                                break;
                            case 3:
                                if (tarefas.isEmpty()) {
                                    System.out.println("Nenhuma tarefa cadastrada!");
                                } else {
                                    for (int i = 0; i < tarefas.size(); i++) {
                                        System.out.println(i + " - " + tarefas.get(i));
                                    }
                                    System.out.println("Digite o número da tarefa a concluir: ");
                                    int indice = Integer.parseInt(scanner.nextLine());
                                    if (indice >= 0 && indice < tarefas.size()) {
                                        tarefas.get(indice).setConcluida(true);
                                        System.out.println("Tarefa concluída!");
                                    } else {
                                        System.out.println("Índice inválido!");
                                    }
                                }
                                break;
                        }
                    }
                    while (opcao != 0);
                    break;

                case 2:
                    int opcao1 = 0;
                    do {
                        System.out.println("===== MENU DE LIVROS =====");
                        System.out.println("1-Adicionar livro");
                        System.out.println("2-Listar livro");
                        System.out.println("3-Marcar como lido");
                        System.out.println("0-Sair");

                        opcao1 = Integer.parseInt(scanner.nextLine());

                        switch (opcao1) {
                            case 1:
                                System.out.println("Título do livro: ");
                                String tituloLivro = scanner.nextLine();
                                Livro novoLivro = new Livro(tituloLivro);
                                livro.add(novoLivro);
                                System.out.println("Livro cadastrado!");
                                break;

                            case 2:
                                if (livro.isEmpty()) {
                                    System.out.println("Nenhum livro cadastrado!");
                                } else {
                                    for (Livro l : livro) {
                                        System.out.println(l);
                                    }
                                }
                                break;

                            case 3:
                                if (livro.isEmpty()) {
                                    System.out.println("Nenhum livro cadastrado!");
                                } else {
                                    for (int i = 0; i < livro.size(); i++) {
                                        System.out.println(i + " - " + livro.get(i));
                                    }
                                    System.out.println("Digite o número do livro a ler: ");
                                    int indice = Integer.parseInt(scanner.nextLine());
                                    if (indice >= 0 && indice < livro.size()) {
                                        livro.get(indice).setLido(true);
                                        System.out.println("Livro lido!");
                                    } else {
                                        System.out.println("Índice inválido!");
                                    }
                                }
                                break;
                        }
                    } while (opcao1 != 0);
                    break;

                case 3:
                    int opcao2 = 0;
                    do {
                        System.out.println("===== MENU DE FILMES =====");
                        System.out.println("1-Adicionar filme");
                        System.out.println("2-Listar filme");
                        System.out.println("0-Sair");

                        opcao2 = Integer.parseInt(scanner.nextLine());

                        switch (opcao2) {
                            case 1:
                                System.out.println("Título do filme: ");
                                String tituloFilme = scanner.nextLine();
                                Filme novoFilme = new Filme(tituloFilme);
                                filme.add(novoFilme);
                                System.out.println("Filme cadastrado!");
                                break;

                            case 2:
                                if (filme.isEmpty()) {
                                    System.out.println("Nenhum filme cadastrado!");
                                } else {
                                    for (Filme f : filme) {
                                        System.out.println(f);
                                    }
                                }
                                break;

                            case 3:
                                if (filme.isEmpty()) {
                                    System.out.println("Nenhum filme cadastrado!");
                                } else {
                                    for (int i = 0; i < filme.size(); i++) {
                                        System.out.println(i + " - " + filme.get(i));
                                    }
                                    System.out.println("Digite o número do filme a assistir: ");
                                    int indice = Integer.parseInt(scanner.nextLine());
                                    if (indice >= 0 && indice < filme.size()) {
                                        filme.get(indice).setAssistido(true);
                                        System.out.println("Filme assistido!");
                                    } else {
                                        System.out.println("Índice inválido!");
                                    }
                                }
                        }
                    } while (opcao2 != 0);
                    break;

                case 4:
                    opcao3 = 0;
                    do {
                        System.out.println("===== MENU DE INSIGHTS =====");
                        System.out.println("1-Adicionar insight");
                        System.out.println("2-Listar insight");
                        System.out.println("0-Sair");

                        opcao1 = Integer.parseInt(scanner.nextLine());

                        switch (opcao3) {
                            case 1:
                                System.out.println("Título do insight: ");
                                String tituloInsight = scanner.nextLine();
                                Insight novoInsight = new Insight(tituloInsight);
                                insight.add(novoInsight);
                                System.out.println("Insight cadastrado!");
                                break;

                            case 2:
                                if (insight.isEmpty()) {
                                    System.out.println("Nenhum insight cadastrado!");
                                } else {
                                    for (Insight i : insight) {
                                        System.out.println(i);
                                    }
                                }
                                break;

                            case 3:
                                if (insight.isEmpty()) {
                                    System.out.println("Nenhum insight cadastrado!");
                                } else {
                                    for (int i = 0; i < insight.size(); i++) {
                                        System.out.println(i + " - " + insight.get(i));
                                    }
                                    System.out.println("Digite o número do insight a escrever: ");
                                    int indice = Integer.parseInt(scanner.nextLine());
                                    if (indice >= 0 && indice < insight.size()) {
                                        insight.get(indice).setEscrito(true);
                                        System.out.println("Insight escrito!");
                                    } else {
                                        System.out.println("Índice inválido!");
                                    }
                                }
                        }
                    }
                    while (opcao3 != 0);
                    break;

                case 0:
                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Inválido");
            }
        } while (menu != 0);
        scanner.close();
    }
}
