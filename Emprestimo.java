/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Emprestimo#getDataInicioEmprestimo <em>Data Inicio Emprestimo</em>}</li>
 *   <li>{@link Model.Emprestimo#getDataFimEmprestimo <em>Data Fim Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmprestimo()
 * @model
 * @generated
 */
public interface Emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Inicio Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Inicio Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inicio Emprestimo</em>' attribute.
	 * @see #setDataInicioEmprestimo(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataInicioEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataInicioEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataInicioEmprestimo <em>Data Inicio Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Inicio Emprestimo</em>' attribute.
	 * @see #getDataInicioEmprestimo()
	 * @generated
	 */
	void setDataInicioEmprestimo(Date value);

	/**
	 * Returns the value of the '<em><b>Data Fim Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Fim Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Fim Emprestimo</em>' attribute.
	 * @see #setDataFimEmprestimo(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataFimEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataFimEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataFimEmprestimo <em>Data Fim Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Fim Emprestimo</em>' attribute.
	 * @see #getDataFimEmprestimo()
	 * @generated
	 */
	void setDataFimEmprestimo(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CriaMulta();

} // Emprestimo
