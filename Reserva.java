/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserva</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Reserva#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getReserva()
 * @model
 * @generated
 */
public interface Reserva extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(Date)
	 * @see Model.ModelPackage#getReserva_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getData();

	/**
	 * Sets the value of the '{@link Model.Reserva#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(Date value);

} // Reserva
