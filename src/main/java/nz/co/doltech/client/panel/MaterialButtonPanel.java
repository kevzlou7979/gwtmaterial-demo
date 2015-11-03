package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialButtonPanel extends Composite {

	private static MaterialButtonPanelUiBinder uiBinder = GWT.create(MaterialButtonPanelUiBinder.class);

	interface MaterialButtonPanelUiBinder extends UiBinder<Widget, MaterialButtonPanel> {
	}
	
	@UiField MaterialButton btnClick, btnHover, btnDoubleClick;
	
	public MaterialButtonPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("btnClick")
	void onClick(ClickEvent e){
		MaterialToast.alert("Click Triggered");
		btnClick.setText("Clicked");
	}
	
	@UiHandler("btnHover")
	void onHover(MouseOverEvent e){
		MaterialToast.alert("Hover Triggered");
		btnHover.setText("Hovered");
	}
	
	@UiHandler("btnDoubleClick")
	void onDoubleClick(DoubleClickEvent e){
		MaterialToast.alert("Double Click Triggered");
		btnDoubleClick.setText("Double Clicked");
	}
	
}
