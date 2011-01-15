package org.andromda.cartridges.android.metafacades;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidServicePackage.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidServicePackage
 */
public class AndroidServicePackageLogicImpl
    extends AndroidServicePackageLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidServicePackageLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
}