//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front-end parameter is a parameter passed between front-end
 * action states.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndParameter
    extends org.andromda.metafacades.uml.ParameterFacade
{

   /**
    * <p>
    * The action to which this parameter belongs (if it belongs to an
    * action), otherwise it returns null.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndAction getAction();

   /**
    * <p>
    * Gets the controller operation to which this parameter belongs.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndControllerOperation getControllerOperation();

   /**
    * <p>
    * A collection of all possible attribute names of a table (this
    * will only work when your table is modeled as an array..not a
    * collection).
    * </p>
    */
    public java.util.Collection getTableAttributeNames();

   /**
    * <p>
    * All the columns for this parameter if it represents a table
    * variable. If a column is linked by an event (action) a
    * FrontEndParameter instance is included in the return value,
    * otherwise a plain String representing the column name.
    * </p>
    */
    public java.util.Collection getTableColumnNames();

   /**
    * <p>
    * A list of all attributes which make up the table columns of this
    * table (this only contains attributes when the table is
    * represented by an array).
    * </p>
    */
    public java.util.Collection getTableColumns();

   /**
    * <p>
    * Represents the view in which this parameter will be used.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndView getView();

   /**
    * <p>
    * Indicates whether or not this is an action parameter or not.
    * </p>
    */
    public boolean isActionParameter();

   /**
    * <p>
    * Indicates if this parameter is contained in a "front-end" use
    * case.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

   /**
    * <p>
    * Indicates whether or not this parameter is an argument of a
    * controller operation.
    * </p>
    */
    public boolean isControllerOperationArgument();

   /**
    * <p>
    * Indicates whether or not this parameter represents a table.
    * </p>
    */
    public boolean isTable();

}