/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Professor#getDisciplinas <em>Disciplinas</em>}</li>
 *   <li>{@link Model.Professor#getInstituto <em>Instituto</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Funcionario {
	/**
	 * Returns the value of the '<em><b>Disciplinas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disciplinas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplinas</em>' attribute.
	 * @see #setDisciplinas(String)
	 * @see Model.ModelPackage#getProfessor_Disciplinas()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDisciplinas();

	/**
	 * Sets the value of the '{@link Model.Professor#getDisciplinas <em>Disciplinas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disciplinas</em>' attribute.
	 * @see #getDisciplinas()
	 * @generated
	 */
	void setDisciplinas(String value);

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
	 * @see Model.ModelPackage#getProfessor_Instituto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Model.Professor#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void BloqueiaPublicacao();

} // Professor
