package view;

import br.edu.fateczl.filaobj.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {
    public static void main(String[] args) {
        Fila f = new Fila();
        EscalonadorController ec = new EscalonadorController();

        String[] vetor = {"notepad.exe;14", "write.exe;35", "chrome.exe;27", "acrobat.exe;52", "firefox.exe;18", "word.exe;25"};

        for (String item : vetor) {
            String[] partes = item.split(";");
            String nome = partes[0];
            int qnt = Integer.parseInt(partes[1]);

            Processo processo = new Processo(nome, qnt); 
            f.insert(processo);
        }

        ec.escalonador(f);
    }
}
