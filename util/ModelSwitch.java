/**
 */
package Model.util;

import Model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				T result = caseAluno(aluno);
				if (result == null) result = caseUsuario(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNCIONARIO: {
				Funcionario funcionario = (Funcionario)theEObject;
				T result = caseFuncionario(funcionario);
				if (result == null) result = caseUsuario(funcionario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATENDENTE: {
				Atendente atendente = (Atendente)theEObject;
				T result = caseAtendente(atendente);
				if (result == null) result = caseFuncionario(atendente);
				if (result == null) result = caseUsuario(atendente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIBLIOTECARIO: {
				Bibliotecario bibliotecario = (Bibliotecario)theEObject;
				T result = caseBibliotecario(bibliotecario);
				if (result == null) result = caseFuncionario(bibliotecario);
				if (result == null) result = caseUsuario(bibliotecario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROFESSOR: {
				Professor professor = (Professor)theEObject;
				T result = caseProfessor(professor);
				if (result == null) result = caseFuncionario(professor);
				if (result == null) result = caseUsuario(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EMPRESTIMO: {
				Emprestimo emprestimo = (Emprestimo)theEObject;
				T result = caseEmprestimo(emprestimo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MULTA: {
				Multa multa = (Multa)theEObject;
				T result = caseMulta(multa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESERVA: {
				Reserva reserva = (Reserva)theEObject;
				T result = caseReserva(reserva);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PUBLICACAO: {
				Publicacao publicacao = (Publicacao)theEObject;
				T result = casePublicacao(publicacao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIVRO: {
				Livro livro = (Livro)theEObject;
				T result = caseLivro(livro);
				if (result == null) result = casePublicacao(livro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PERIODICO: {
				Periodico periodico = (Periodico)theEObject;
				T result = casePeriodico(periodico);
				if (result == null) result = casePublicacao(periodico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAluno(Aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcionario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionario(Funcionario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtendente(Atendente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliotecario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliotecario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliotecario(Bibliotecario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor(Professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emprestimo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emprestimo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmprestimo(Emprestimo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulta(Multa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserva</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserva</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserva(Reserva object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publicacao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publicacao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicacao(Publicacao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivro(Livro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodico(Periodico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
