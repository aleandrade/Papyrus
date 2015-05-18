/**
 */
package Model.impl;

import Model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.USUARIO: return createUsuario();
			case ModelPackage.ALUNO: return createAluno();
			case ModelPackage.FUNCIONARIO: return createFuncionario();
			case ModelPackage.ATENDENTE: return createAtendente();
			case ModelPackage.BIBLIOTECARIO: return createBibliotecario();
			case ModelPackage.PROFESSOR: return createProfessor();
			case ModelPackage.EMPRESTIMO: return createEmprestimo();
			case ModelPackage.MULTA: return createMulta();
			case ModelPackage.RESERVA: return createReserva();
			case ModelPackage.PUBLICACAO: return createPublicacao();
			case ModelPackage.LIVRO: return createLivro();
			case ModelPackage.PERIODICO: return createPeriodico();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno createAluno() {
		AlunoImpl aluno = new AlunoImpl();
		return aluno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario createFuncionario() {
		FuncionarioImpl funcionario = new FuncionarioImpl();
		return funcionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atendente createAtendente() {
		AtendenteImpl atendente = new AtendenteImpl();
		return atendente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bibliotecario createBibliotecario() {
		BibliotecarioImpl bibliotecario = new BibliotecarioImpl();
		return bibliotecario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo createEmprestimo() {
		EmprestimoImpl emprestimo = new EmprestimoImpl();
		return emprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multa createMulta() {
		MultaImpl multa = new MultaImpl();
		return multa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserva createReserva() {
		ReservaImpl reserva = new ReservaImpl();
		return reserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao createPublicacao() {
		PublicacaoImpl publicacao = new PublicacaoImpl();
		return publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livro createLivro() {
		LivroImpl livro = new LivroImpl();
		return livro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodico createPeriodico() {
		PeriodicoImpl periodico = new PeriodicoImpl();
		return periodico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
