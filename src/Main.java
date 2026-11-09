import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        ArvoreGenerica<String> sistemaArquivos = new ArvoreGenerica<>("C:/");
        NoGenerico<String> raiz = sistemaArquivos.getRaiz();

        NoGenerico<String> documentos = new NoGenerico<>("Documentos");
        NoGenerico<String> imagens = new NoGenerico<>("Imagens");
        NoGenerico<String> downloads = new NoGenerico<>("Downloads");

        raiz.adicionarFilho(documentos);
        raiz.adicionarFilho(imagens);
        raiz.adicionarFilho(downloads);

        System.out.println("Elementos da árvore (Pré-Ordem):");
        sistemaArquivos.imprimirPreOrdem(raiz);

        int totalFolhas = sistemaArquivos.contarFolhas(raiz);
        System.out.println("Total de folhas: " + totalFolhas);

        System.out.println("Busca por 'Imagens': " + sistemaArquivos.buscar(raiz, "Imagens"));
        System.out.println("Busca por 'Videos': " + sistemaArquivos.buscar(raiz, "Videos"));

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}