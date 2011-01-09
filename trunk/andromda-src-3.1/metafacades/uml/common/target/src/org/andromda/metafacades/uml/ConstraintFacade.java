//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ConstraintFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * Gets the 'body' or text of this constraint.
    * </p>
    */
    public java.lang.String getBody();

   /**
    * <p>
    * Gets the model element to which the constraint applies (i.e. is
    * the context of).
    * </p>
    */
    public org.andromda.metafacades.uml.ModelElementFacade getContextElement();

   /**
    * 
    */
    public java.lang.String getTranslation(java.lang.String language);

   /**
    * <p>
    * True if this constraint denotes a body expression.
    * </p>
    * <p>
    * For example:
    * </p>
    * <p>
    * <pre>
    * </p>
    * <p>
    * context CustomerCard:getTransaction(from:Date, until:Date)
    * </p>
    * <p>
    * body: transactions->select(date.isAfter(from) and
    * date.isBefore(until))
    * </p>
    * <p>
    * </pre>
    * </p>
    * <p>
    * False otherwise.
    * </p>
    */
    public boolean isBodyExpression();

   /**
    * <p>
    * True if this constraint denotes a definition.
    * </p>
    * <p>
    * For example:
    * </p>
    * <p>
    * <pre>
    * </p>
    * <p>
    * context CustomerCard
    * </p>
    * <p>
    * def: getTotalPoints(d: date) : Integer =
    * transaction->select(date.isAfter(d)).points->sum()
    * </p>
    * <p>
    * </pre>
    * </p>
    * <p>
    * False otherwise.
    * </p>
    */
    public boolean isDefinition();

   /**
    * <p>
    * True if this constraint denotes an invariant.
    * </p>
    * <p>
    * For example:
    * </p>
    * <p>
    * <pre>
    * </p>
    * <p>
    * context LivingAnimal
    * </p>
    * <p>
    * inv: alive = true
    * </p>
    * <p>
    * </pre>
    * </p>
    * <p>
    * False otherwise.
    * </p>
    */
    public boolean isInvariant();

   /**
    * <p>
    * True if this constraint denotes a postcondition.
    * </p>
    * <p>
    * For example:
    * </p>
    * <p>
    * <pre>
    * </p>
    * <p>
    * context LivingAnimal::getNumberOfLegs()
    * </p>
    * <p>
    * post: numberOfLegs >= 0
    * </p>
    * <p>
    * </pre>
    * </p>
    * <p>
    * False otherwise.
    * </p>
    */
    public boolean isPostCondition();

   /**
    * <p>
    * True if this constraint denotes a precondition.
    * </p>
    * <p>
    * For example:
    * </p>
    * <p>
    * <pre>
    * </p>
    * <p>
    * context LivingAnimal::canFly()
    * </p>
    * <p>
    * pre: hasWings = true
    * </p>
    * <p>
    * </pre>
    * </p>
    * <p>
    * False otherwise.
    * </p>
    */
    public boolean isPreCondition();

}