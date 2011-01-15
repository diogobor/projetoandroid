package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidParameter.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidParameter
 */
public class AndroidParameterLogicImpl
    extends AndroidParameterLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidParameterLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidParameter#getAndroidTransition()
     */
    protected java.lang.Object handleGetAndroidTransition()
    {
        // TODO: add your implementation here!
        return null;
    }

}