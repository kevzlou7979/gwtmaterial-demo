package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialModal;

public class ModalContent extends Composite {

	private static ModalContentUiBinder uiBinder = GWT.create(ModalContentUiBinder.class);

	interface ModalContentUiBinder extends UiBinder<Widget, ModalContent> {
	}

	public ModalContent() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("btnAgree")
	void onAgree(ClickEvent e){
		MaterialModal.closeModal();
	}
	
	@UiHandler("btnDisagree")
	void onDisagree(ClickEvent e){
		MaterialModal.closeModal();
	}

}
