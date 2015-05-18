/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Usuario;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getPrimeiroNome <em>Primeiro Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getUltimoNome <em>Ultimo Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCPF <em>CPF</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco1 <em>Endereco1</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco2 <em>Endereco2</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCEP <em>CEP</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getRA <em>RA</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getNumRegistro <em>Num Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimeiroNome() <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeiroNome()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMEIRO_NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimeiroNome() <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeiroNome()
	 * @generated
	 * @ordered
	 */
	protected String primeiroNome = PRIMEIRO_NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUltimoNome() <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimoNome()
	 * @generated
	 * @ordered
	 */
	protected static final String ULTIMO_NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimoNome() <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimoNome()
	 * @generated
	 * @ordered
	 */
	protected String ultimoNome = ULTIMO_NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected String dataNascimento = DATA_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPF() <em>CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPF() <em>CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TELEFONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected BigInteger telefone = TELEFONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco1() <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco1()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco1() <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco1()
	 * @generated
	 * @ordered
	 */
	protected String endereco1 = ENDERECO1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco2() <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco2()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco2() <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco2()
	 * @generated
	 * @ordered
	 */
	protected String endereco2 = ENDERECO2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRA() <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRA()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRA() <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRA()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ra = RA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_REGISTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numRegistro = NUM_REGISTRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimeiroNome(String newPrimeiroNome) {
		String oldPrimeiroNome = primeiroNome;
		primeiroNome = newPrimeiroNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PRIMEIRO_NOME, oldPrimeiroNome, primeiroNome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUltimoNome() {
		return ultimoNome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimoNome(String newUltimoNome) {
		String oldUltimoNome = ultimoNome;
		ultimoNome = newUltimoNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ULTIMO_NOME, oldUltimoNome, ultimoNome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNascimento(String newDataNascimento) {
		String oldDataNascimento = dataNascimento;
		dataNascimento = newDataNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__DATA_NASCIMENTO, oldDataNascimento, dataNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCPF() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPF(BigInteger newCPF) {
		BigInteger oldCPF = cpf;
		cpf = newCPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCPF, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTelefone() {
		return telefone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefone(BigInteger newTelefone) {
		BigInteger oldTelefone = telefone;
		telefone = newTelefone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TELEFONE, oldTelefone, telefone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco1() {
		return endereco1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco1(String newEndereco1) {
		String oldEndereco1 = endereco1;
		endereco1 = newEndereco1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO1, oldEndereco1, endereco1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco2() {
		return endereco2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco2(String newEndereco2) {
		String oldEndereco2 = endereco2;
		endereco2 = newEndereco2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO2, oldEndereco2, endereco2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCEP() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEP(BigInteger newCEP) {
		BigInteger oldCEP = cep;
		cep = newCEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CEP, oldCEP, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CIDADE, oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRA() {
		return ra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRA(BigInteger newRA) {
		BigInteger oldRA = ra;
		ra = newRA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__RA, oldRA, ra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumRegistro() {
		return numRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumRegistro(BigInteger newNumRegistro) {
		BigInteger oldNumRegistro = numRegistro;
		numRegistro = newNumRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NUM_REGISTRO, oldNumRegistro, numRegistro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DevolucaoLivro() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CancelaReserva() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CriaRserva() {
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
			case ModelPackage.USUARIO__TITULO:
				return getTitulo();
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				return getPrimeiroNome();
			case ModelPackage.USUARIO__ULTIMO_NOME:
				return getUltimoNome();
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return getDataNascimento();
			case ModelPackage.USUARIO__EMAIL:
				return getEmail();
			case ModelPackage.USUARIO__CPF:
				return getCPF();
			case ModelPackage.USUARIO__TELEFONE:
				return getTelefone();
			case ModelPackage.USUARIO__ENDERECO1:
				return getEndereco1();
			case ModelPackage.USUARIO__ENDERECO2:
				return getEndereco2();
			case ModelPackage.USUARIO__CEP:
				return getCEP();
			case ModelPackage.USUARIO__CIDADE:
				return getCidade();
			case ModelPackage.USUARIO__ESTADO:
				return getEstado();
			case ModelPackage.USUARIO__PAIS:
				return getPais();
			case ModelPackage.USUARIO__RA:
				return getRA();
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return getNumRegistro();
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
			case ModelPackage.USUARIO__TITULO:
				setTitulo((String)newValue);
				return;
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				setPrimeiroNome((String)newValue);
				return;
			case ModelPackage.USUARIO__ULTIMO_NOME:
				setUltimoNome((String)newValue);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento((String)newValue);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUARIO__CPF:
				setCPF((BigInteger)newValue);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone((BigInteger)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO1:
				setEndereco1((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO2:
				setEndereco2((String)newValue);
				return;
			case ModelPackage.USUARIO__CEP:
				setCEP((BigInteger)newValue);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade((String)newValue);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado((String)newValue);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais((String)newValue);
				return;
			case ModelPackage.USUARIO__RA:
				setRA((BigInteger)newValue);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro((BigInteger)newValue);
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
			case ModelPackage.USUARIO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				setPrimeiroNome(PRIMEIRO_NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ULTIMO_NOME:
				setUltimoNome(ULTIMO_NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento(DATA_NASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCPF(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone(TELEFONE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO1:
				setEndereco1(ENDERECO1_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO2:
				setEndereco2(ENDERECO2_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CEP:
				setCEP(CEP_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade(CIDADE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case ModelPackage.USUARIO__RA:
				setRA(RA_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro(NUM_REGISTRO_EDEFAULT);
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
			case ModelPackage.USUARIO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case ModelPackage.USUARIO__PRIMEIRO_NOME:
				return PRIMEIRO_NOME_EDEFAULT == null ? primeiroNome != null : !PRIMEIRO_NOME_EDEFAULT.equals(primeiroNome);
			case ModelPackage.USUARIO__ULTIMO_NOME:
				return ULTIMO_NOME_EDEFAULT == null ? ultimoNome != null : !ULTIMO_NOME_EDEFAULT.equals(ultimoNome);
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return DATA_NASCIMENTO_EDEFAULT == null ? dataNascimento != null : !DATA_NASCIMENTO_EDEFAULT.equals(dataNascimento);
			case ModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUARIO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.USUARIO__TELEFONE:
				return TELEFONE_EDEFAULT == null ? telefone != null : !TELEFONE_EDEFAULT.equals(telefone);
			case ModelPackage.USUARIO__ENDERECO1:
				return ENDERECO1_EDEFAULT == null ? endereco1 != null : !ENDERECO1_EDEFAULT.equals(endereco1);
			case ModelPackage.USUARIO__ENDERECO2:
				return ENDERECO2_EDEFAULT == null ? endereco2 != null : !ENDERECO2_EDEFAULT.equals(endereco2);
			case ModelPackage.USUARIO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
			case ModelPackage.USUARIO__CIDADE:
				return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
			case ModelPackage.USUARIO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ModelPackage.USUARIO__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case ModelPackage.USUARIO__RA:
				return RA_EDEFAULT == null ? ra != null : !RA_EDEFAULT.equals(ra);
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return NUM_REGISTRO_EDEFAULT == null ? numRegistro != null : !NUM_REGISTRO_EDEFAULT.equals(numRegistro);
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
			case ModelPackage.USUARIO___DEVOLUCAO_LIVRO:
				DevolucaoLivro();
				return null;
			case ModelPackage.USUARIO___CANCELA_RESERVA:
				CancelaReserva();
				return null;
			case ModelPackage.USUARIO___CRIA_RSERVA:
				CriaRserva();
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
		result.append(" (Titulo: ");
		result.append(titulo);
		result.append(", PrimeiroNome: ");
		result.append(primeiroNome);
		result.append(", UltimoNome: ");
		result.append(ultimoNome);
		result.append(", DataNascimento: ");
		result.append(dataNascimento);
		result.append(", Email: ");
		result.append(email);
		result.append(", CPF: ");
		result.append(cpf);
		result.append(", Telefone: ");
		result.append(telefone);
		result.append(", Endereco1: ");
		result.append(endereco1);
		result.append(", Endereco2: ");
		result.append(endereco2);
		result.append(", CEP: ");
		result.append(cep);
		result.append(", Cidade: ");
		result.append(cidade);
		result.append(", Estado: ");
		result.append(estado);
		result.append(", Pais: ");
		result.append(pais);
		result.append(", RA: ");
		result.append(ra);
		result.append(", NumRegistro: ");
		result.append(numRegistro);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
