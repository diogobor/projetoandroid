package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidControllerOp.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidControllerOp
 */
public class AndroidControllerOpLogicImpl
    extends AndroidControllerOpLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidControllerOpLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidControllerOp#getOpController()
     */
    protected java.lang.Object handleGetOpController()
    {
        // TODO: add your implementation here!
        return null;
    }

}