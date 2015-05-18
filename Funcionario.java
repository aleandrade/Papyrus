/**
 */
package Model;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Funcionario#getCadastro <em>Cadastro</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends Usuario {
	/**
	 * Returns the value of the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadastro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadastro</em>' attribute.
	 * @see #setCadastro(BigInteger)
	 * @see Model.ModelPackage#getFuncionario_Cadastro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getCadastro();

	/**
	 * Sets the value of the '{@link Model.Funcionario#getCadastro <em>Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadastro</em>' attribute.
	 * @see #getCadastro()
	 * @generated
	 */
	void setCadastro(BigInteger value);

} // Funcionario
