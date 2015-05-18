/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Publicacao;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PublicacaoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#getISBN <em>ISBN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicacaoImpl extends MinimalEObjectImpl.Container implements Publicacao {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOQUEADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected boolean bloqueado = BLOQUEADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ISBN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected BigInteger isbn = ISBN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBloqueado() {
		return bloqueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloqueado(boolean newBloqueado) {
		boolean oldBloqueado = bloqueado;
		bloqueado = newBloqueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__BLOQUEADO, oldBloqueado, bloqueado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getISBN() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISBN(BigInteger newISBN) {
		BigInteger oldISBN = isbn;
		isbn = newISBN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__ISBN, oldISBN, isbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PUBLICACAO__NOME:
				return getNome();
			case ModelPackage.PUBLICACAO__BLOQUEADO:
				return isBloqueado();
			case ModelPackage.PUBLICACAO__ISBN:
				return getISBN();
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
			case ModelPackage.PUBLICACAO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__BLOQUEADO:
				setBloqueado((Boolean)newValue);
				return;
			case ModelPackage.PUBLICACAO__ISBN:
				setISBN((BigInteger)newValue);
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
			case ModelPackage.PUBLICACAO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__BLOQUEADO:
				setBloqueado(BLOQUEADO_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__ISBN:
				setISBN(ISBN_EDEFAULT);
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
			case ModelPackage.PUBLICACAO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.PUBLICACAO__BLOQUEADO:
				return bloqueado != BLOQUEADO_EDEFAULT;
			case ModelPackage.PUBLICACAO__ISBN:
				return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
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
		result.append(" (Nome: ");
		result.append(nome);
		result.append(", Bloqueado: ");
		result.append(bloqueado);
		result.append(", ISBN: ");
		result.append(isbn);
		result.append(')');
		return result.toString();
	}

} //PublicacaoImpl
