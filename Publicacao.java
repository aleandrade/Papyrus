/**
 */
package Model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Publicacao#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Publicacao#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.Publicacao#getISBN <em>ISBN</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPublicacao()
 * @model
 * @generated
 */
public interface Publicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Model.ModelPackage#getPublicacao_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloqueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloqueado</em>' attribute.
	 * @see #setBloqueado(boolean)
	 * @see Model.ModelPackage#getPublicacao_Bloqueado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBloqueado();

	/**
	 * Sets the value of the '{@link Model.Publicacao#isBloqueado <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloqueado</em>' attribute.
	 * @see #isBloqueado()
	 * @generated
	 */
	void setBloqueado(boolean value);

	/**
	 * Returns the value of the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISBN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISBN</em>' attribute.
	 * @see #setISBN(BigInteger)
	 * @see Model.ModelPackage#getPublicacao_ISBN()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getISBN();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getISBN <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISBN</em>' attribute.
	 * @see #getISBN()
	 * @generated
	 */
	void setISBN(BigInteger value);

} // Publicacao
