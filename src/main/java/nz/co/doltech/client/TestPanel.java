package nz.co.doltech.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestPanel extends Composite {

	private static TestPanelUiBinder uiBinder = GWT
			.create(TestPanelUiBinder.class);

	interface TestPanelUiBinder extends UiBinder<Widget, TestPanel> {
	}
	
	
	public TestPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	
	
}
