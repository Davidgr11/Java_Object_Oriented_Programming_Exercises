public class Generico <T>{
	private T algo;

	public Generico(T algo){
		this.algo = algo;
	}

	public void imprime(){
		System.out.println(algo);
	}
}