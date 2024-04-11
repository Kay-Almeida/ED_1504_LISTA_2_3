package controller;

import model.Processo;
import br.edu.fateczl.filaobj.*;

public class EscalonadorController {
	
	public EscalonadorController() {
		super(); 
	}
	
	public void escalonador (Fila f) {
		while(!f.isEmpty()) {
		try {
			Processo pc1 = (Processo) f.remove();
			System.out.println("Executando processo: " + pc1.Nome());
			
			pc1.qnt = pc1.qnt - 1; 
			if(pc1.qnt>0) {
				System.out.println("Processo " + pc1.Nome() + " ainda tem " +pc1.qnt+ " retornos pendentes. Voltando para a fila.");
				f.insert(pc1);
			}else {
				System.out.println("Processo " + pc1.Nome() + " finalizado.");

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		}
	}

}
