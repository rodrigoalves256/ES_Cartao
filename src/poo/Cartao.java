package poo;
/**
 * 
 * @author Rodrigo Alves
 *
 *
 *  Classe Cartao serve para mostrar os funcionarios.
 *   
 */
public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * Vai buscar o nome do funcionario.
	 * @param nomeFuncionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	/**
	 * Recolhe os dados do funcionario.
	 * @param nomeFuncionario
	 * @param servico
	 * @param cargo
	 */

	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * Recebe o nome do funcionario.
	 * @return nomeFuncionario
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	/**
	 * Seleciona o servico do funcionario.
	 * @param servico
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}
	/**
	 * Seleciona o cargo do funcionario.
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	/**
	 * retirar o servico de um funcionario.
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * Atribuir um servico a um funcionario.
	 * @param novoServico
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * Promover um novo cargo a um funcionario.
	 * @param novoCargo
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * Despedir um funcionario.
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
