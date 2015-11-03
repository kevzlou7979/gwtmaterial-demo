package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Orientation;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialTimePicker;

public class MaterialPickers extends Composite {

	private static MaterialPickersUiBinder uiBinder = GWT
			.create(MaterialPickersUiBinder.class);

	interface MaterialPickersUiBinder extends UiBinder<Widget, MaterialPickers> {
	}

	@UiField MaterialDatePicker dpLandscape;
	@UiField MaterialTimePicker tpLandscape;
	
	public MaterialPickers() {
		initWidget(uiBinder.createAndBindUi(this));
		dpLandscape.setOrientation(Orientation.LANDSCAPE);
		tpLandscape.setOrientation(Orientation.LANDSCAPE);
	}

}
