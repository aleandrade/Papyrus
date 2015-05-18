/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Periodico#getEditor <em>Editor</em>}</li>
 *   <li>{@link Model.Periodico#getRevisores <em>Revisores</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPeriodico()
 * @model
 * @generated
 */
public interface Periodico extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' attribute.
	 * @see #setEditor(String)
	 * @see Model.ModelPackage#getPeriodico_Editor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEditor();

	/**
	 * Sets the value of the '{@link Model.Periodico#getEditor <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' attribute.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(String value);

	/**
	 * Returns the value of the '<em><b>Revisores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisores</em>' attribute.
	 * @see #setRevisores(String)
	 * @see Model.ModelPackage#getPeriodico_Revisores()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRevisores();

	/**
	 * Sets the value of the '{@link Model.Periodico#getRevisores <em>Revisores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisores</em>' attribute.
	 * @see #getRevisores()
	 * @generated
	 */
	void setRevisores(String value);

} // Periodico
