/**
 */
package Model;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#getAnoDeIngresso <em>Ano De Ingresso</em>}</li>
 *   <li>{@link Model.Aluno#getInstituto <em>Instituto</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>Ano De Ingresso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ano De Ingresso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ano De Ingresso</em>' attribute.
	 * @see #setAnoDeIngresso(BigInteger)
	 * @see Model.ModelPackage#getAluno_AnoDeIngresso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getAnoDeIngresso();

	/**
	 * Sets the value of the '{@link Model.Aluno#getAnoDeIngresso <em>Ano De Ingresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano De Ingresso</em>' attribute.
	 * @see #getAnoDeIngresso()
	 * @generated
	 */
	void setAnoDeIngresso(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto</em>' attribute.
	 * @see #setInstituto(String)
	 * @see Model.ModelPackage#getAluno_Instituto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Model.Aluno#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

} // Aluno
