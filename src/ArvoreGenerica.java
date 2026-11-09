import java.util.ArrayList;
import java.util.List;

class NoGenerico<T> {
    T valor;
    List<NoGenerico<T>> filhos;

    public NoGenerico(T valor) {
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }

    public void adicionarFilho(NoGenerico<T> filho) {
        filhos.add(filho);
    }
}

public class ArvoreGenerica<T> {
    private NoGenerico<T> raiz;

    public ArvoreGenerica(T valorRaiz) {
        this.raiz = new NoGenerico<>(valorRaiz);
    }

    public NoGenerico<T> getRaiz() {
        return raiz;
    }

    public int contarFolhas(NoGenerico<T> no) {
        if (no.filhos.isEmpty()) {
            return 1;
        }
        int total = 0;
        for (NoGenerico<T> filho : no.filhos) {
            total += contarFolhas(filho);
        }
        return total;
    }

    public void imprimirPreOrdem(NoGenerico<T> no) {
        if (no == null) {
            return;
        }
        System.out.println(no.valor);
        for (NoGenerico<T> filho : no.filhos) {
            imprimirPreOrdem(filho);
        }
    }

    public boolean buscar(NoGenerico<T> no, T valor) {
        if (no.valor.equals(valor)) {
            return true;
        }
        for (NoGenerico<T> filho : no.filhos) {
            if (buscar(filho, valor)) {
                return true;
            }
        }
        return false;
    }
}
