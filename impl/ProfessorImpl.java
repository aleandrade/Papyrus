/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Professor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ProfessorImpl#getDisciplinas <em>Disciplinas</em>}</li>
 *   <li>{@link Model.impl.ProfessorImpl#getInstituto <em>Instituto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfessorImpl extends FuncionarioImpl implements Professor {
	/**
	 * The default value of the '{@link #getDisciplinas() <em>Disciplinas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinas()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCIPLINAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisciplinas() <em>Disciplinas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinas()
	 * @generated
	 * @ordered
	 */
	protected String disciplinas = DISCIPLINAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected String instituto = INSTITUTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisciplinas() {
		return disciplinas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisciplinas(String newDisciplinas) {
		String oldDisciplinas = disciplinas;
		disciplinas = newDisciplinas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROFESSOR__DISCIPLINAS, oldDisciplinas, disciplinas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto() {
		return instituto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto(String newInstituto) {
		String oldInstituto = instituto;
		instituto = newInstituto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROFESSOR__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void BloqueiaPublicacao() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__DISCIPLINAS:
				return getDisciplinas();
			case ModelPackage.PROFESSOR__INSTITUTO:
				return getInstituto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__DISCIPLINAS:
				setDisciplinas((String)newValue);
				return;
			case ModelPackage.PROFESSOR__INSTITUTO:
				setInstituto((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__DISCIPLINAS:
				setDisciplinas(DISCIPLINAS_EDEFAULT);
				return;
			case ModelPackage.PROFESSOR__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__DISCIPLINAS:
				return DISCIPLINAS_EDEFAULT == null ? disciplinas != null : !DISCIPLINAS_EDEFAULT.equals(disciplinas);
			case ModelPackage.PROFESSOR__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.PROFESSOR___BLOQUEIA_PUBLICACAO:
				BloqueiaPublicacao();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Disciplinas: ");
		result.append(disciplinas);
		result.append(", Instituto: ");
		result.append(instituto);
		result.append(')');
		return result.toString();
	}

} //ProfessorImpl
