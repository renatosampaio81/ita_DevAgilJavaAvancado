
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String cargo;
	
	public Pessoa(String nome, String sobrenome, int idade, String cargo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	//Essa anotacao ira ignorar o campo idade na comparacao, mas também é necessario incluir na classe Comparador
	@IgnorarNaComparacao
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
