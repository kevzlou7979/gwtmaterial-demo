package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

public class MaterialCard extends Composite {

	private static MaterialCardUiBinder uiBinder = GWT
			.create(MaterialCardUiBinder.class);

	interface MaterialCardUiBinder extends UiBinder<Widget, MaterialCard> {
	}

	@UiField MaterialRow rowCards;
	
	public MaterialCard() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("btnShow")
	void onShow(ClickEvent e){
		MaterialAnimator.animate(Transition.SHOW_GRID, rowCards, 0);
	}

}
