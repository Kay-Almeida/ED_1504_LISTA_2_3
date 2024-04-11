package model;

public class Processo {
	
	public String nome; 
	public int qnt; 
		
    public Processo(String nome, int qnt) {
        this.nome = nome;
        this.qnt = qnt;
    }

    public String Nome() {
        return nome;
    }

    public int Qnt() {
        return qnt;
    }
}
