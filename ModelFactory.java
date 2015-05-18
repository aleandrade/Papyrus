/**
 */
package Model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = Model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluno</em>'.
	 * @generated
	 */
	Aluno createAluno();

	/**
	 * Returns a new object of class '<em>Funcionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcionario</em>'.
	 * @generated
	 */
	Funcionario createFuncionario();

	/**
	 * Returns a new object of class '<em>Atendente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atendente</em>'.
	 * @generated
	 */
	Atendente createAtendente();

	/**
	 * Returns a new object of class '<em>Bibliotecario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bibliotecario</em>'.
	 * @generated
	 */
	Bibliotecario createBibliotecario();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Emprestimo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emprestimo</em>'.
	 * @generated
	 */
	Emprestimo createEmprestimo();

	/**
	 * Returns a new object of class '<em>Multa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multa</em>'.
	 * @generated
	 */
	Multa createMulta();

	/**
	 * Returns a new object of class '<em>Reserva</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserva</em>'.
	 * @generated
	 */
	Reserva createReserva();

	/**
	 * Returns a new object of class '<em>Publicacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publicacao</em>'.
	 * @generated
	 */
	Publicacao createPublicacao();

	/**
	 * Returns a new object of class '<em>Livro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livro</em>'.
	 * @generated
	 */
	Livro createLivro();

	/**
	 * Returns a new object of class '<em>Periodico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodico</em>'.
	 * @generated
	 */
	Periodico createPeriodico();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
