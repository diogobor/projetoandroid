package org.andromda.cartridges.bpm4struts.metafacades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.andromda.cartridges.bpm4struts.Bpm4StrutsProfile;
import org.andromda.metafacades.uml.CoppetecPackageFacade;
import org.andromda.utils.StringUtilsHelper;
import org.apache.commons.lang.StringUtils;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.bpm4struts.metafacades.CoppetecStrutsAction.
 *
 * @see org.andromda.cartridges.bpm4struts.metafacades.CoppetecStrutsAction
 */
public class CoppetecStrutsActionLogicImpl
    extends CoppetecStrutsActionLogic
{

	public String insertModuleNameIntoOutlet(String outlet){
		return ((CoppetecPackageFacade)(getUseCase().getPackage())).replaceOutletWithWebModuleName(outlet); 
	}
    
	
	public CoppetecStrutsActionLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }

    protected String handleGetOnlineHelpValue()
    {
        final StringBuffer buffer = new StringBuffer();
        
        final String value = StringUtilsHelper.toResourceMessage(getDocumentation("", 64, false));
        buffer.append((value == null) ? "" : value);
        
        String message = buffer.toString();
        if (StringUtils.isBlank(message))
        	return message;

        return StringUtilsHelper.toResourceMessage(message);
    }


	
	protected boolean handleIsLookupGrid() {
        return Bpm4StrutsProfile.TAGGEDVALUE_ACTION_TYPE_LOOKUPGRID
        .equals(this.findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_ACTION_TYPE));
	}


	
	protected boolean handleIsImage() {
        return Bpm4StrutsProfile.TAGGEDVALUE_ACTION_TYPE_IMAGE
        .equals(this.findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_ACTION_TYPE));
	}


	protected List handleGetFieldLinkAsList() {
		Object fieldLik = this.findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_FIELD_LINK);
		List fields = new ArrayList();
		if(fieldLik!= null && !((String)fieldLik).equals("")){
			String strFieldLink = (String)fieldLik;
			String[] arrFieldLink = strFieldLink.split(",");			
			for(int i = 0; i < arrFieldLink.length; i++){
				fields.add(arrFieldLink[i]);
			}
			
		}
		return fields;
		
		
	}


	protected boolean handleIsOnlineHelp() {
		if (isTableLink() || !isFormPost())
			return false;
		
		final String value = StringUtilsHelper.toResourceMessage(this.getDocumentation("", 64, false));
		if (value != null)
			return true;
		
		for (Iterator iterator = getActionParameters().iterator(); iterator.hasNext();) {
			CoppetecStrutsParameter parameter = (CoppetecStrutsParameter) iterator.next();
			if (parameter.isOnlineHelp())
				return true;
		}
		
		return false;
	}
}