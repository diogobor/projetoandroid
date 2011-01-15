package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidTransition.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidTransition
 */
public class AndroidTransitionLogicImpl
    extends AndroidTransitionLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidTransitionLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTransition#getAndroidInitialState()
     */
    protected java.lang.Object handleGetAndroidInitialState()
    {
        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTransition#getAndroidActionState()
     */
    protected java.lang.Object handleGetAndroidActionState()
    {
        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTransition#getAndroidParameters()
     */
    protected java.util.Collection handleGetAndroidParameters()
    {
        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTransition#getAndroidFinalState()
     */
    protected java.lang.Object handleGetAndroidFinalState()
    {
        // TODO: add your implementation here!
        return null;
    }

}