/**
 */
package Model.impl;

import Model.Aluno;
import Model.ModelPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.AlunoImpl#getAnoDeIngresso <em>Ano De Ingresso</em>}</li>
 *   <li>{@link Model.impl.AlunoImpl#getInstituto <em>Instituto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlunoImpl extends UsuarioImpl implements Aluno {
	/**
	 * The default value of the '{@link #getAnoDeIngresso() <em>Ano De Ingresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnoDeIngresso()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANO_DE_INGRESSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnoDeIngresso() <em>Ano De Ingresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnoDeIngresso()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anoDeIngresso = ANO_DE_INGRESSO_EDEFAULT;

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
	protected AlunoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALUNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAnoDeIngresso() {
		return anoDeIngresso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnoDeIngresso(BigInteger newAnoDeIngresso) {
		BigInteger oldAnoDeIngresso = anoDeIngresso;
		anoDeIngresso = newAnoDeIngresso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__ANO_DE_INGRESSO, oldAnoDeIngresso, anoDeIngresso));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALUNO__ANO_DE_INGRESSO:
				return getAnoDeIngresso();
			case ModelPackage.ALUNO__INSTITUTO:
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
			case ModelPackage.ALUNO__ANO_DE_INGRESSO:
				setAnoDeIngresso((BigInteger)newValue);
				return;
			case ModelPackage.ALUNO__INSTITUTO:
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
			case ModelPackage.ALUNO__ANO_DE_INGRESSO:
				setAnoDeIngresso(ANO_DE_INGRESSO_EDEFAULT);
				return;
			case ModelPackage.ALUNO__INSTITUTO:
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
			case ModelPackage.ALUNO__ANO_DE_INGRESSO:
				return ANO_DE_INGRESSO_EDEFAULT == null ? anoDeIngresso != null : !ANO_DE_INGRESSO_EDEFAULT.equals(anoDeIngresso);
			case ModelPackage.ALUNO__INSTITUTO:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AnoDeIngresso: ");
		result.append(anoDeIngresso);
		result.append(", Instituto: ");
		result.append(instituto);
		result.append(')');
		return result.toString();
	}

} //AlunoImpl
