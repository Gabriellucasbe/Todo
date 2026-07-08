package Todo;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        int opcao;
        do {
            System.out.println("Menu de tarefas!");
            System.out.println("Adicionar tarefa");
            System.out.println("listar tarefas");
            System.out.println("Concluir tarefa");
            System.out.println("Sair");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Nível de importancia");
                    System.out.println("Não importante");
                    System.out.println("Importante");
                    System.out.println("Muito importante");
                    int nivel = Integer.parseInt(scanner.nextLine());

                    Tarefa.NivelDeImportancia importancia;
                    switch (nivel) {
                        case 1:
                            importancia = Tarefa.NivelDeImportancia.NAO_IMPORTANTE;
                        case 2:
                            importancia = Tarefa.NivelDeImportancia.IMPORTANTE;
                        case 3:
                            importancia = Tarefa.NivelDeImportancia.MUITO_IMPORTANTE;
                        default: {
                            System.out.println("Opção inválida, definido como Não importante");
                            importancia = Tarefa.NivelDeImportancia.NAO_IMPORTANTE;
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
            }
        }
        while (opcao != 0);
        scanner.close();

    }
}