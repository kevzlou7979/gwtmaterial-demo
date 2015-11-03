package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.ModalType;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialDialogs extends Composite {

	private static MaterialDialogsUiBinder uiBinder = GWT.create(MaterialDialogsUiBinder.class);

	interface MaterialDialogsUiBinder extends UiBinder<Widget, MaterialDialogs> {
	}

	public MaterialDialogs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	@UiHandler("btnToast")
	void onToast(ClickEvent e){
		MaterialToast.alert("I Love Material Design");
	}
	
	@UiHandler("btnToastAction")
	void onToastAction(ClickEvent e){
		MaterialLink link = new MaterialLink("UNDO");
		link.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				MaterialToast.alert("UNDO DONE");
			}
		});
		MaterialToast.alert("Item Deleted", link);
	}
	
	@UiHandler("btnToastRounded")
	void onToastStyle(ClickEvent e){
		MaterialToast.alert("I Love Material Design", "rounded");
	}
	
	@UiHandler("btnModal")
	void onModal(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), ModalType.DEFAULT, false);
	}
	
	@UiHandler("btnMoadalBottomSheets")
	void onModalBottom(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), ModalType.BOTTOM_SHEET, false);
	}
	
	@UiHandler("btnModalFixFooter")
	void onModalFix(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), ModalType.FIXED_FOOTER, false);
	}
	
	@UiHandler("btnWindow")
	void onWindowModal(ClickEvent e){
		MaterialModal.showWindow(new ModalContent(), ModalType.WINDOW, "Window Title", "blue", false);
	}
	
	@UiHandler("btnClosable")
	void onClosable(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), ModalType.FIXED_FOOTER,  true);
	}
}
