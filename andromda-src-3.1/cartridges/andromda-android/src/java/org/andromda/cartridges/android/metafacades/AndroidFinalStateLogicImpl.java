package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidFinalState.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidFinalState
 */
public class AndroidFinalStateLogicImpl
    extends AndroidFinalStateLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidFinalStateLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidFinalState#getAndroidTransition()
     */
    protected java.lang.Object handleGetAndroidTransition()
    {
        // TODO: add your implementation here!
        return null;
    }

}