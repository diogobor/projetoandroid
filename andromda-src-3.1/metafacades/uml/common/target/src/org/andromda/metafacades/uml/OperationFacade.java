//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an modeled operation.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface OperationFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * Finds the parameter on this operation having the given name, if
    * no parameter is found, null is returned instead.
    * </p>
    */
    public org.andromda.metafacades.uml.ParameterFacade findParameter(java.lang.String name);

   /**
    * <p>
    * Searches the given feature for the specified tag.
    * </p>
    * <p>
    * If the follow boolean is set to true then the search will
    * continue from the class operation to the class itself and then
    * up the class hiearchy.
    * </p>
    */
    public java.lang.Object findTaggedValue(java.lang.String name, boolean follow);

   /**
    * <p>
    * A comma seperated list of all argument names.
    * </p>
    */
    public java.lang.String getArgumentNames();

   /**
    * 
    */
    public java.lang.String getArgumentTypeNames();

   /**
    * 
    */
    public java.util.Collection getArguments();

   /**
    * 
    */
    public java.lang.String getCall();

   /**
    * <p>
    * Returns the concurrency modifier for this operation (i.e.
    * concurrent, guarded or sequential) of the model element, will
    * attempt a lookup for these values in the language mappings (if
    * any).
    * </p>
    */
    public java.lang.String getConcurrency();

   /**
    * <p>
    * Returns a comma seperated list of exceptions appended to the
    * comma seperated list of fully qualified 'initialException'
    * classes passed in to this method.
    * </p>
    */
    public java.lang.String getExceptionList(java.lang.String initialExceptions);

   /**
    * <p>
    * A comma seperated list containing all exceptions that this
    * operation throws.  Exceptions are determined through
    * dependencies that have the target element stereotyped as
    * <<Exception>>.
    * </p>
    */
    public java.lang.String getExceptionList();

   /**
    * <p>
    * A collection of all exceptions thrown by this operation.
    * </p>
    */
    public java.util.Collection getExceptions();

   /**
    * <p>
    * Gets the owner of this operation
    * </p>
    */
    public org.andromda.metafacades.uml.ClassifierFacade getOwner();

   /**
    * 
    */
    public java.util.Collection getParameters();

   /**
    * <p>
    * The name of the operation that handles postcondition
    * constraints.
    * </p>
    */
    public java.lang.String getPostconditionName();

   /**
    * <p>
    * The postcondition constraints belonging to this operation.
    * </p>
    */
    public java.util.Collection getPostconditions();

   /**
    * <p>
    * The call to the precondition operation.
    * </p>
    */
    public java.lang.String getPreconditionCall();

   /**
    * <p>
    * The name of the operation that handles precondition constraints.
    * </p>
    */
    public java.lang.String getPreconditionName();

   /**
    * <p>
    * The signature of the precondition operation.
    * </p>
    */
    public java.lang.String getPreconditionSignature();

   /**
    * <p>
    * The precondition constraints belonging to this operation.
    * </p>
    */
    public java.util.Collection getPreconditions();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ClassifierFacade getReturnType();

   /**
    * <p>
    * Returns the signature of the operation and optionally appends
    * the argument names (if withArgumentNames is true), otherwise
    * returns the signature with just the types alone in the
    * signature.
    * </p>
    */
    public java.lang.String getSignature(boolean withArgumentNames);

   /**
    * 
    */
    public java.lang.String getSignature();

   /**
    * <p>
    * Returns the signature of the operation and optionally appends
    * the given 'argumentModifier' to each argument.
    * </p>
    */
    public java.lang.String getSignature(java.lang.String argumentModifier);

   /**
    * <p>
    * A comma-separated parameter list  (type and name of each
    * parameter) of an operation.
    * </p>
    */
    public java.lang.String getTypedArgumentList();

   /**
    * <p>
    * A comma-separated parameter list  (type and name of each
    * parameter) of an operation with an optional modifier (i.e final)
    * before each parameter.
    * </p>
    */
    public java.lang.String getTypedArgumentList(java.lang.String modifier);

   /**
    * 
    */
    public boolean isAbstract();

   /**
    * <p>
    * True if the operation has (i.e. throws any exceptions) false
    * otherwise.
    * </p>
    */
    public boolean isExceptionsPresent();

   /**
    * <p>
    * Whether any postcondition constraints are present on this
    * operation.
    * </p>
    */
    public boolean isPostconditionsPresent();

   /**
    * <p>
    * Whether any precondition constraints are present on this
    * operation.
    * </p>
    */
    public boolean isPreconditionsPresent();

   /**
    * <p>
    * Indicates whether or not this operation is a query operation.
    * </p>
    */
    public boolean isQuery();

   /**
    * <p>
    * True/false depending on whether or not the operation has a
    * return type or not (i.e. a return type of something other than
    * void).
    * </p>
    */
    public boolean isReturnTypePresent();

   /**
    * 
    */
    public boolean isStatic();

}