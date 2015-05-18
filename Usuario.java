/**
 */
package Model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Usuario#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}</li>
 *   <li>{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}</li>
 *   <li>{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.Usuario#getCPF <em>CPF</em>}</li>
 *   <li>{@link Model.Usuario#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}</li>
 *   <li>{@link Model.Usuario#getCEP <em>CEP</em>}</li>
 *   <li>{@link Model.Usuario#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.Usuario#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.Usuario#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.Usuario#getRA <em>RA</em>}</li>
 *   <li>{@link Model.Usuario#getNumRegistro <em>Num Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see Model.ModelPackage#getUsuario_Titulo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primeiro Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primeiro Nome</em>' attribute.
	 * @see #setPrimeiroNome(String)
	 * @see Model.ModelPackage#getUsuario_PrimeiroNome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPrimeiroNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primeiro Nome</em>' attribute.
	 * @see #getPrimeiroNome()
	 * @generated
	 */
	void setPrimeiroNome(String value);

	/**
	 * Returns the value of the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimo Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimo Nome</em>' attribute.
	 * @see #setUltimoNome(String)
	 * @see Model.ModelPackage#getUsuario_UltimoNome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getUltimoNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimo Nome</em>' attribute.
	 * @see #getUltimoNome()
	 * @generated
	 */
	void setUltimoNome(String value);

	/**
	 * Returns the value of the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nascimento</em>' attribute.
	 * @see #setDataNascimento(String)
	 * @see Model.ModelPackage#getUsuario_DataNascimento()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDataNascimento();

	/**
	 * Sets the value of the '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Nascimento</em>' attribute.
	 * @see #getDataNascimento()
	 * @generated
	 */
	void setDataNascimento(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Model.ModelPackage#getUsuario_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPF</em>' attribute.
	 * @see #setCPF(BigInteger)
	 * @see Model.ModelPackage#getUsuario_CPF()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getCPF();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCPF <em>CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPF</em>' attribute.
	 * @see #getCPF()
	 * @generated
	 */
	void setCPF(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(BigInteger)
	 * @see Model.ModelPackage#getUsuario_Telefone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getTelefone();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco1</em>' attribute.
	 * @see #setEndereco1(String)
	 * @see Model.ModelPackage#getUsuario_Endereco1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndereco1();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco1</em>' attribute.
	 * @see #getEndereco1()
	 * @generated
	 */
	void setEndereco1(String value);

	/**
	 * Returns the value of the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco2</em>' attribute.
	 * @see #setEndereco2(String)
	 * @see Model.ModelPackage#getUsuario_Endereco2()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndereco2();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco2</em>' attribute.
	 * @see #getEndereco2()
	 * @generated
	 */
	void setEndereco2(String value);

	/**
	 * Returns the value of the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEP</em>' attribute.
	 * @see #setCEP(BigInteger)
	 * @see Model.ModelPackage#getUsuario_CEP()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getCEP();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCEP <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEP</em>' attribute.
	 * @see #getCEP()
	 * @generated
	 */
	void setCEP(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidade</em>' attribute.
	 * @see #setCidade(String)
	 * @see Model.ModelPackage#getUsuario_Cidade()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCidade();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCidade <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidade</em>' attribute.
	 * @see #getCidade()
	 * @generated
	 */
	void setCidade(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see Model.ModelPackage#getUsuario_Estado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see Model.ModelPackage#getUsuario_Pais()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link Model.Usuario#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>RA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RA</em>' attribute.
	 * @see #setRA(BigInteger)
	 * @see Model.ModelPackage#getUsuario_RA()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getRA();

	/**
	 * Sets the value of the '{@link Model.Usuario#getRA <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RA</em>' attribute.
	 * @see #getRA()
	 * @generated
	 */
	void setRA(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Registro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Registro</em>' attribute.
	 * @see #setNumRegistro(BigInteger)
	 * @see Model.ModelPackage#getUsuario_NumRegistro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getNumRegistro();

	/**
	 * Sets the value of the '{@link Model.Usuario#getNumRegistro <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Registro</em>' attribute.
	 * @see #getNumRegistro()
	 * @generated
	 */
	void setNumRegistro(BigInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DevolucaoLivro()'"
	 * @generated
	 */
	void DevolucaoLivro();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CancelaReserva()'"
	 * @generated
	 */
	void CancelaReserva();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CriaRserva();

} // Usuario
