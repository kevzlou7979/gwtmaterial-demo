package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialCollectionPanel extends Composite {

	private static MaterialCollectionPanelUiBinder uiBinder = GWT.create(MaterialCollectionPanelUiBinder.class);

	interface MaterialCollectionPanelUiBinder extends UiBinder<Widget, MaterialCollectionPanel> {
	}

	public MaterialCollectionPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("collectWifi")
	void onWifi(ClickEvent e){
		MaterialToast.alert("Wifi Network");
	}
	
	@UiHandler("collectBluetooth")
	void onBluetooth(ClickEvent e){
		MaterialToast.alert("Bluetooth");
	}
	
	@UiHandler("collectData")
	void onData(ClickEvent e){
		MaterialToast.alert("Data Usage");
	}

}
