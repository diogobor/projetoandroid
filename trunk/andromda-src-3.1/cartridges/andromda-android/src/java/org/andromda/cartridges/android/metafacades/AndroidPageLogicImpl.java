package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidPage.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidPage
 */
public class AndroidPageLogicImpl
    extends AndroidPageLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidPageLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
}