package nz.co.doltech.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestPanel2 extends Composite {

	private static TestPanel2UiBinder uiBinder = GWT
			.create(TestPanel2UiBinder.class);

	interface TestPanel2UiBinder extends UiBinder<Widget, TestPanel2> {
	}
	
	public TestPanel2() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
