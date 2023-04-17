public class NumerosMaiores{

    private int num1;
    private int num2;
    private int num3;
    private int maior1;
    private int maior2;

    public NumerosMaiores(int num1, int num2, int num3, int maior1, int maior2){
	setNum1(num1);
	setNum2(num2);
	setNum3(num3);
	setMaior1(maior1);
	setMaior2(maior2);
    }
    public void setNum1(int num1){
	this.num1 = num1;
    }
    public int getNum1(){
	return num1;
    }
    public void setNum2(int num2){
	this.num2 = num2;
    }
    public int getNum2(){
	return num2;
    }
    public void setNum3(int num3){
	this.num3 = num3;
    }
    public int getNum3(){
	return num3;
    }
    public void setMaior1(int maior1){
	this.maior1 = maior1;
    }
    public int getMaior1(){
	return maior1;
    }
    public void setMaior2(int maior2){
	this.maior2 = maior2;
    }
    public int getMaior2(){
	return maior2;
    }
    
}
