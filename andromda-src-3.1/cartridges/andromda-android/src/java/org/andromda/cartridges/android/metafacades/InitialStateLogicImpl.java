package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.InitialState.
 *
 * @see org.andromda.cartridges.android.metafacades.InitialState
 */
public class InitialStateLogicImpl
    extends InitialStateLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public InitialStateLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
}