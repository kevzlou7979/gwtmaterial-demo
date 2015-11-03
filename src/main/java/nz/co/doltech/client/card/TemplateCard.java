package nz.co.doltech.client.card;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialCardTitle;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import nz.co.doltech.client.showcase.MaterialLogin;
import nz.co.doltech.client.showcase.MaterialParallax;
import nz.co.doltech.shared.TemplateDTO;

public class TemplateCard extends Composite {

	private static TemplateCardUiBinder uiBinder = GWT
			.create(TemplateCardUiBinder.class);

	interface TemplateCardUiBinder extends UiBinder<Widget, TemplateCard> {
	}
	
	@UiField MaterialImage imgResource;
	@UiField MaterialLabel lblDescription;
	@UiField MaterialCardTitle lblTitle;
	
	private TemplateDTO template;

	public TemplateCard(TemplateDTO template) {
		initWidget(uiBinder.createAndBindUi(this));
		setTemplate(template);
		lblTitle.setText(template.getName());
		lblDescription.setText(template.getDescription());
		imgResource.setResource(template.getImg());
	}

	@UiHandler("btnDemo")
	void onDemo(ClickEvent e){
		if("Parallax Template".equals(getTemplate().getName())){
			RootPanel.get().clear();
			RootPanel.get().add(new MaterialParallax());
		}else if("Login Template".equals(getTemplate().getName())){
			RootPanel.get().clear();
			RootPanel.get().add(new MaterialLogin());
		}else{
			Window.open(getTemplate().getDemoLink(), "", "_blank");
		}
		
	}
	
	@UiHandler("btnSource")
	void onSource(ClickEvent e){
		Window.open(getTemplate().getSourceLink(), "", "_blank");
	}
	
	
	/**
	 * @return the template
	 */
	public TemplateDTO getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(TemplateDTO template) {
		this.template = template;
	}

}
