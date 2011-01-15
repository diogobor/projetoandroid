package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidActionState.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidActionState
 */
public class AndroidActionStateLogicImpl
    extends AndroidActionStateLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidActionStateLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidActionState#getAndroidTransitions()
     */
    protected java.util.Collection handleGetAndroidTransitions()
    {
        // TODO: add your implementation here!
        return null;
    }

}