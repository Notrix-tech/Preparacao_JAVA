package heranca;

public class Ferrari extends Carro{
	
	Ferrari(){
		this(315);
	}
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 350;
	}
	
	//@Override
	//void acelerar() {
		//velocidadeAtual +=15;
	//}
}