//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ParameterFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public java.lang.String getDefaultValue();

   /**
    * <p>
    * If this parameter is located on an event, this will represent
    * that event.
    * </p>
    */
    public org.andromda.metafacades.uml.EventFacade getEvent();

   /**
    * <p>
    * The name to use for accessors getting this parameter from a
    * bean.
    * </p>
    */
    public java.lang.String getGetterName();

   /**
    * <p>
    * If this parameter is located on an operation, this will
    * represent that operation.
    * </p>
    */
    public org.andromda.metafacades.uml.OperationFacade getOperation();

   /**
    * <p>
    * The name to use for accessors getting this parameter in a bean.
    * </p>
    */
    public java.lang.String getSetterName();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ClassifierFacade getType();

   /**
    * <p>
    * Indicates if the default value is present.
    * </p>
    */
    public boolean isDefaultValuePresent();

   /**
    * <p>
    * True if this parameter is an 'in' parameter.
    * </p>
    */
    public boolean isInParameter();

   /**
    * <p>
    * True if this parameter is an inout parameter.
    * </p>
    */
    public boolean isInoutParameter();

   /**
    * <p>
    * True if this parameter is an 'out' parameter.
    * </p>
    */
    public boolean isOutParameter();

   /**
    * <p>
    * True if this parameter is readable, aka an in-parameter, or this
    * feature is unspecified.
    * </p>
    */
    public boolean isReadable();

   /**
    * <p>
    * Whether or not this parameter is considered required (i.e must a
    * non-empty value).
    * </p>
    */
    public boolean isRequired();

   /**
    * <p>
    * Whether or not this parameter represents a return parameter.
    * </p>
    */
    public boolean isReturn();

   /**
    * <p>
    * True if this parameter is writable, aka an out-parameter, or
    * this feature is unspecified.
    * </p>
    */
    public boolean isWritable();

}