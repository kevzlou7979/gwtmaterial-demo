package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialSideNavs extends Composite {

	private static MaterialSideNavsUiBinder uiBinder = GWT
			.create(MaterialSideNavsUiBinder.class);

	interface MaterialSideNavsUiBinder extends
			UiBinder<Widget, MaterialSideNavs> {
	}

	public MaterialSideNavs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
