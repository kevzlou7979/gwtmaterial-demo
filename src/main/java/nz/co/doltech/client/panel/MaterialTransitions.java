package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.client.ui.html.UnorderedList;

public class MaterialTransitions extends Composite {

	private static MaterialTransitionsUiBinder uiBinder = GWT
			.create(MaterialTransitionsUiBinder.class);

	interface MaterialTransitionsUiBinder extends
			UiBinder<Widget, MaterialTransitions> {
	}
	
	@UiField UnorderedList listContainer;
	@UiField MaterialImage image;
	@UiField MaterialRow gridPanel;
	
	public MaterialTransitions() {
		initWidget(uiBinder.createAndBindUi(this));
		gridPanel.getElement().getStyle().setOpacity(0);
	}
	
	@UiHandler("btnCloseGrid")
	void onCloseGrid(ClickEvent e){
		MaterialAnimator.animate(Transition.CLOSE_GRID, gridPanel, 0);
	}
	
	@UiHandler("btnShowGrid")
	void onShowGrid(ClickEvent e){
		MaterialAnimator.animate(Transition.SHOW_GRID, gridPanel, 0);
	}
	
	@UiHandler("btnStaggered")
	void onStaggered(ClickEvent e){
		MaterialAnimator.animate(Transition.SHOW_STAGGERED_LIST, listContainer, 0);
	}
	
	@UiHandler("btnFade")
	void onFade(ClickEvent e){
		MaterialAnimator.animate(Transition.FADE_IN_IMAGE, image, 0);
	}

}
