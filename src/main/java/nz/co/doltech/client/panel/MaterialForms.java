package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialRange;
import gwt.material.design.client.ui.MaterialSwitch;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialForms extends Composite {

	private static MaterialFormsUiBinder uiBinder = GWT.create(MaterialFormsUiBinder.class);

	interface MaterialFormsUiBinder extends UiBinder<Widget, MaterialForms> {
	}
	
	@UiField MaterialListBox lstOptions;
	@UiField MaterialCheckBox cbBoxAll, cbBox, cbBlue, cbRed, cbCyan, cbGreen, cbBrown;

	@UiField MaterialSwitch switch1, switch2;
	@UiField MaterialLabel lblSwitch1, lblSwitch2, lblRange;
	@UiField MaterialRange range;
	
	public MaterialForms() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("lstOptions")
	void onChangeListBox(ChangeEvent e){
		MaterialToast.alert("Selected Index: " + lstOptions.getSelectedIndex());
	}

	@UiHandler("cbBox")
	void onCheckBox(ClickEvent e){
		if(cbBox.getValue()){
			cbBox.setText("CheckBox 1: true");
		}else{
			cbBox.setText("CheckBox 1: false");
		}
	}

	@UiHandler("cbBoxAll")
	void onCheckAll(ClickEvent e){
		if(cbBoxAll.getValue()){
			cbBlue.setValue(true);
			cbRed.setValue(true);
			cbCyan.setValue(true);
			cbGreen.setValue(true);
			cbBrown.setValue(true);
		}else{
			cbBlue.setValue(false);
			cbRed.setValue(false);
			cbCyan.setValue(false);
			cbGreen.setValue(false);
			cbBrown.setValue(false);
		}
	}

	@UiHandler("switch1")
	void onSwitch1(ClickEvent e){
		if(switch1.getValue()){
			lblSwitch1.setText("Switch: true");
		}else{
			lblSwitch1.setText("Switch: false");
		}
	}

	@UiHandler("switch2")
	void onSwitch2(ClickEvent e){
		if(switch2.getValue()){
			lblSwitch2.setText("Switch: true");
		}else{
			lblSwitch2.setText("Switch: false");
		}
	}

	@UiHandler("range")
	void onRange(ChangeEvent e){
		lblRange.setText("Value: " + String.valueOf(range.getValue()));
	}
}
