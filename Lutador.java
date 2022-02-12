package cursoo;

public class Lutador { 
	
	//Atributos 
	
	private String nome;
	private String nacionalidade;
	private int idade; 
	private float peso;
	private double altura;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//************* Métodos Especiais **************
	
	//Constructor  
	
	public Lutador(String nome , String nacionalidade ,int idade, float pe, double altura, int vitoria, int derrotas, int empates){
		this.setNome(nome);
		this.setNascionalidade(nacionalidade);
		this.setIdade(idade);
	 	this.setPeso(pe);
		this.setAltura(altura);
		this.setVitoria(vitoria);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	
	}
	
	// Settrs AND Gettrs 
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
    public String getNome() {
    	return this.nome;
    }
    
    
    public void setNascionalidade(String nacionalidade) {
    	this.nacionalidade = nacionalidade;
    }
    
    public String getNascionalidade() {
    	return this.nacionalidade;
    }
    
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    
    public int getIdade() {
    	return this.idade;
    }
    
    public void setPeso(float peso) {
    	this.peso = peso;
    	this.setCategoria();
    }
    
    public float getPeso() {
    	return this.peso;
    	
    }
    
    public void setAltura(double altura) {
    	this.altura = altura;
    }
    
    public double getAltura() {
    	return this.altura;
    }
    
    private void setCategoria( ) {
    	
    	if(this.getPeso()<54) {
    		this.categoria =" Categoria de peso:[LEVE] ";
    	}else if(this.getPeso()<=78) {
    	  this.categoria=" Categoria de peso:[MÉDIO]";
    	}else if(this.getPeso()>=90.5) {
    		this.categoria = " Categoria de peso:[PESADO]";		
    	}else {
    		this.categoria  =" Não pode participar da luta! ";
    	}
    }
    
    public String getCategoria() {
    	return this.categoria;
    
    }
     
    public void setVitoria(int vitoria) {
    	this.vitorias = vitoria;
    }
    
    public int getVitoria() {
    	return this.vitorias;
    }
    
    public void setDerrotas(int derrotas) {
    	this.derrotas = derrotas;
    	
    }
    
    public int getDerrotas() {
    	return this.derrotas;
    }
    
    public void setEmpates(int empates) {
    	this.empates = empates;
    }
    
    public int getEmpates() {
        return this.empates;
    }
      
    
    //Métodos Personalizadores 
    
    public void apresentar() {
    	 
    	System.out.println("--------------------------------------");
    	System.out.println("             Overview"                 );
    	System.out.println("--------------------------------------");
    	System.out.println(" CHEGOU A HORA! , apresentamos o lutador: "+ this.getNome()+""); 
    	System.out.println(" Diretamente do: "+this.getNascionalidade());
    	System.out.println(" "+this.getIdade()+" anos");
    	System.out.println(" "+this.getPeso()+" Kg de puro músculo");
    	System.out.println(" "+this.getAltura()+" metros de altura");
    	
    }
    
    public void status() {
    
    	System.out.println("--------------------------------------");
    	System.out.println("             *[STATUS]*                 ");
    	System.out.println("--------------------------------------");
    	System.out.println(""+this.getCategoria()); 
    	System.out.println();
    	System.out.println(" Nome: "+ this.getNome()); 
    	System.out.println(" Idade: "+this.getIdade()+" anos");
    	System.out.println(" Altura: "+this.getAltura()+" metros");
    	System.out.println(" Peso: "+this.getPeso()+" Kg");
    	System.out.println(" Vitórias: "+this.getVitoria()+" vezes");
    	System.out.println(" Derrotas: "+this.getDerrotas()+" vezes");
    	System.out.println(" Empates: "+this.getEmpates()+" vezes");
    	
    	
    } 
    
   
    
    public void ganharLuta() {
    	this.setVitoria(this.getVitoria()+1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    	
    }
    
    public void empatarLuta() {
    	this.setEmpates(this.getEmpates()+1);
    	
    }
    
}
