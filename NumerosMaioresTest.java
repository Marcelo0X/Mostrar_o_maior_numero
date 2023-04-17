import java.util.Scanner;

public class NumerosMaioresTest{

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args){
	somarNumerosMaiores();
    }
    public static void somarNumerosMaiores(){
	int maior1 = 0, maior2 = 0;
	int[] vet = new int[3];
	try{
	    for(int i = 0; i < vet.length; i++){
		System.out.print((i+1)+"° numero ");
		vet[i] = ent.nextInt();
		if(vet[i] > maior1){
		    maior2 = maior1;
		    maior1 = vet[i];
		}else if(vet[i] > maior2){
		    maior2 = vet[i];
		}
	    }
	    NumerosMaiores numeros = new NumerosMaiores(vet[0], vet[1], vet[2], maior1, maior2);
	    System.out.println(maior1+" "+maior2);
	    System.out.println(maior1+" + "+maior2+" = "+(maior1+maior2));
	}catch(Exception w){
	    System.out.println("Erro - "+w);
	    ent.nextLine();
	}
    }
    
}
