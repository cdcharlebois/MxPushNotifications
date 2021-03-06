// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Stores an base 64 encoded string plain in the provided target file document
 * 
 * Note that targetFile will be committed.
 */
public class Base64DecodeToFile extends CustomJavaAction<Boolean>
{
	private String encoded;
	private IMendixObject __targetFile;
	private system.proxies.FileDocument targetFile;

	public Base64DecodeToFile(IContext context, String encoded, IMendixObject targetFile)
	{
		super(context);
		this.encoded = encoded;
		this.__targetFile = targetFile;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.targetFile = __targetFile == null ? null : system.proxies.FileDocument.initialize(getContext(), __targetFile);

		// BEGIN USER CODE
		StringUtils.base64DecodeToFile(getContext(), encoded, targetFile);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "Base64DecodeToFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
