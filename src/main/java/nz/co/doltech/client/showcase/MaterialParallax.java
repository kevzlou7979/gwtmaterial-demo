package nz.co.doltech.client.showcase;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import nz.co.doltech.client.panel.MaterialDemo;

public class MaterialParallax extends Composite {

	private static MaterialParallaxUiBinder uiBinder = GWT.create(MaterialParallaxUiBinder.class);

	interface MaterialParallaxUiBinder extends UiBinder<Widget, MaterialParallax> {
	}

	public MaterialParallax() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("btnMaterial")
	void onBack(ClickEvent e){
		this.removeFromParent();
		RootPanel.get().add(new MaterialDemo());
	}

	

}
