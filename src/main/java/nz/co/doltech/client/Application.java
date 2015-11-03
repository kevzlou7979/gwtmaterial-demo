package nz.co.doltech.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.ApplicationController;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	private static final ApplicationController controller =
		GWT.create(ApplicationController.class);

	@Override
	public void onModuleLoad() {
		GWT.log("onModuleLoad");

		controller.init();
	}
}