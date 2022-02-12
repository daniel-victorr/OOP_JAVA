package cursoo;



class Principal { 
public static void main(String args[]) {  
	  
	Lutador l[] = new Lutador[5];
	
	l[0] = new Lutador("Daniel Victor","Austrália",20,70f,1.66,7,0,10);
	l[1] = new Lutador("Petter Boy","Candá",44,70f,1.71,8,2,0);
	l[2] = new Lutador("PustCrispt","Agentina",19,40f,1.61,9,2,10);
	l[3] = new Lutador("Needer ","Chile",29,41f,1.51,3,10,0);

	
	Luta ufc = new Luta();
	
	ufc.marcarLuta(l[0], l[1]);
    ufc.lutar();
    
  
   
	
}}   