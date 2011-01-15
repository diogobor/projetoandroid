package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidInitialState.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidInitialState
 */
public class AndroidInitialStateLogicImpl
    extends AndroidInitialStateLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidInitialStateLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidInitialState#getAndroidTransition()
     */
    protected java.lang.Object handleGetAndroidTransition()
    {
        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidInitialState#getAndroidUseCase()
     */
    protected java.lang.Object handleGetAndroidUseCase()
    {
        // TODO: add your implementation here!
        return null;
    }

}