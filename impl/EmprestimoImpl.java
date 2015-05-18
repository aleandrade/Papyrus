/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataInicioEmprestimo <em>Data Inicio Emprestimo</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataFimEmprestimo <em>Data Fim Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The default value of the '{@link #getDataInicioEmprestimo() <em>Data Inicio Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInicioEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_INICIO_EMPRESTIMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataInicioEmprestimo() <em>Data Inicio Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInicioEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Date dataInicioEmprestimo = DATA_INICIO_EMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFimEmprestimo() <em>Data Fim Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFimEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_FIM_EMPRESTIMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFimEmprestimo() <em>Data Fim Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFimEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Date dataFimEmprestimo = DATA_FIM_EMPRESTIMO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataInicioEmprestimo() {
		return dataInicioEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInicioEmprestimo(Date newDataInicioEmprestimo) {
		Date oldDataInicioEmprestimo = dataInicioEmprestimo;
		dataInicioEmprestimo = newDataInicioEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_INICIO_EMPRESTIMO, oldDataInicioEmprestimo, dataInicioEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataFimEmprestimo() {
		return dataFimEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFimEmprestimo(Date newDataFimEmprestimo) {
		Date oldDataFimEmprestimo = dataFimEmprestimo;
		dataFimEmprestimo = newDataFimEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_FIM_EMPRESTIMO, oldDataFimEmprestimo, dataFimEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CriaMulta() {
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
			case ModelPackage.EMPRESTIMO__DATA_INICIO_EMPRESTIMO:
				return getDataInicioEmprestimo();
			case ModelPackage.EMPRESTIMO__DATA_FIM_EMPRESTIMO:
				return getDataFimEmprestimo();
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
			case ModelPackage.EMPRESTIMO__DATA_INICIO_EMPRESTIMO:
				setDataInicioEmprestimo((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATA_FIM_EMPRESTIMO:
				setDataFimEmprestimo((Date)newValue);
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
			case ModelPackage.EMPRESTIMO__DATA_INICIO_EMPRESTIMO:
				setDataInicioEmprestimo(DATA_INICIO_EMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DATA_FIM_EMPRESTIMO:
				setDataFimEmprestimo(DATA_FIM_EMPRESTIMO_EDEFAULT);
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
			case ModelPackage.EMPRESTIMO__DATA_INICIO_EMPRESTIMO:
				return DATA_INICIO_EMPRESTIMO_EDEFAULT == null ? dataInicioEmprestimo != null : !DATA_INICIO_EMPRESTIMO_EDEFAULT.equals(dataInicioEmprestimo);
			case ModelPackage.EMPRESTIMO__DATA_FIM_EMPRESTIMO:
				return DATA_FIM_EMPRESTIMO_EDEFAULT == null ? dataFimEmprestimo != null : !DATA_FIM_EMPRESTIMO_EDEFAULT.equals(dataFimEmprestimo);
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
			case ModelPackage.EMPRESTIMO___CRIA_MULTA:
				CriaMulta();
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
		result.append(" (DataInicioEmprestimo: ");
		result.append(dataInicioEmprestimo);
		result.append(", DataFimEmprestimo: ");
		result.append(dataFimEmprestimo);
		result.append(')');
		return result.toString();
	}

} //EmprestimoImpl
