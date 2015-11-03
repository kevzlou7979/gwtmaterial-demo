package nz.co.doltech.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.design.client.ui.MaterialTopNav;
import nz.co.doltech.client.Place;
import nz.co.doltech.client.resources.IMaterialConstants;

public class MaterialDemo extends Composite {

	private static MaterialDemoUiBinder uiBinder = GWT.create(MaterialDemoUiBinder.class);

	interface MaterialDemoUiBinder extends UiBinder<Widget, MaterialDemo> {
	}
	
	@UiField HTMLPanel contentPanel;
	@UiField MaterialNavBar narBar;
	@UiField MaterialSideNav sideNav;
	@UiField MaterialTopNav topNav;
	
	public MaterialDemo() {
		initWidget(uiBinder.createAndBindUi(this));
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				String token = event.getValue();
				handleHistoryToken(token);
			}
		});
		handleHistoryToken(History.getToken());
		
	}
	
	@Override
	protected void onLoad() {
		// TODO Auto-generated method stub
		super.onLoad();
		initCode();
	}

	public native void initCode()/*-{
		//$wnd.loadHighlightJS();
	}-*/;
	
	private void handleHistoryToken(String token) {
		Place place = Place.about;
		if (!"".equals(token)) {
			place = Place.valueOf(token);
		}
		changeNav(place);
	}

	@UiHandler("btnChat")
	void onChat(ClickEvent e){
		Window.open(IMaterialConstants.LINK_GITTER_CHAT, "", "");
	}
	
	@UiHandler("btnGithub")
	void onGithub(ClickEvent e){
		Window.open(IMaterialConstants.GITHUB_LINK, "", "");
	}
	
	@UiHandler("gettingStartedPanel")
	void onGettingStarted(ClickEvent e){
		changeNav(Place.gettingstarted);
	}
	
	@UiHandler("btnBounty")
	void onBounty(ClickEvent e){
		Window.open("https://www.bountysource.com/teams/gwtmaterialdesign", "", "");
	}
	
	private void changeNav(Place place){
		sideNav.hide(narBar.getElement());
		Window.scrollTo(0, 0);
		contentPanel.clear();
		contentPanel.add(place.getContent());
		topNav.setTitle(place.getTitle());
		topNav.setDescription(place.getDescription());
	}
}