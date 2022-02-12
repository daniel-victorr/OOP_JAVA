package cursoo;

import java.util.Random;

public class Luta {

	//Atributos
	
	private Lutador desafiado,desafiante;
	private int rounds;
	private boolean aprovada;
	
	//M�todo personalizados
	
	public void marcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria()){
		if(l1 != l2) {	
			this.setAprovado(true);
			this.desafiado=l1;
			this.desafiante=l2;
			
		}
		}else {
			this.setAprovado(false);
			this.setDesafiante(null);
			this.setDesafiado(null);
			
			
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
		  System.out.println();
		  System.out.println("###DESAFIADO###");	
	      this.desafiado.apresentar();
	      this.desafiado.status();
	      System.out.println();
	      System.out.println("###DESAFIANTE###");
	      this.desafiante.apresentar();
	      this.getDesafiante().status();
	       
	     
	      Random aleatorio = new Random();
	      int vencedor = aleatorio.nextInt(3);
	      this.setRounds(aleatorio.nextInt(10+0));
	      
	      switch(vencedor) {
	      case 0: //l1 Desafiado venceu
	    	  System.out.println();
	    	  System.out.println("-----------------------");
	    	  System.out.println("Vencedor:"+this.desafiado.getNome());
	    	   System.out.println("[Rounds:"+this.getRounds()+"]");
	    	  this.desafiado.ganharLuta();
	    	  this.desafiante.perderLuta();
	    	  this.desafiado.status();
	    	  break;
	      case 1: //l2 Desafiante venceu
	    	 
	    	  System.out.println("------------------------");
	    	  System.out.println("Vencedor:"+this.getDesafiante().getNome());
	    	  System.out.println(" Rounds:["+this.getRounds()+"]");
	    	  this.desafiante.ganharLuta();
	    	  this.desafiado.perderLuta();
	    	  this.desafiante.status();
	    	  break;
	      case 2: //Empate
	    	  System.out.println("-----------------------");
	    	  System.out.println("Empatou!");
	    	  System.out.println("[Rounds:"+getRounds()+"]");
	    	  this.desafiado.empatarLuta();
	    	  this.desafiante.empatarLuta();
	    	  break;
	      }
	     
	     
		}else {
			System.out.println("==============================");
			System.out.println("A luta n�o pode acontecer!");
			System.out.println("OBS:Conflito entre categorias");
			System.out.println("==============================");
		}
	}
	
	//M�todo Acessores and Modificadores
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovada = aprovado;
	}
	
	public boolean isAprovado() {
		return this.aprovada;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
}
