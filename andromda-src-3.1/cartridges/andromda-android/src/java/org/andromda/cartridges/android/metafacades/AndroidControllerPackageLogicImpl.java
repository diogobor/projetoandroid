package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidControllerPackage.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidControllerPackage
 */
public class AndroidControllerPackageLogicImpl
    extends AndroidControllerPackageLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidControllerPackageLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
}