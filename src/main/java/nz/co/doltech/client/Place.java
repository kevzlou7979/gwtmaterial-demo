package nz.co.doltech.client;

import com.google.gwt.user.client.ui.Widget;
import nz.co.doltech.client.panel.MaterialAutoCompletes;
import nz.co.doltech.client.panel.MaterialBadges;
import nz.co.doltech.client.panel.MaterialButtonPanel;
import nz.co.doltech.client.panel.MaterialCard;
import nz.co.doltech.client.panel.MaterialCharts;
import nz.co.doltech.client.panel.MaterialChips;
import nz.co.doltech.client.panel.MaterialCollapsibles;
import nz.co.doltech.client.panel.MaterialCollectionPanel;
import nz.co.doltech.client.panel.MaterialColors;
import nz.co.doltech.client.panel.MaterialDialogs;
import nz.co.doltech.client.panel.MaterialDropDowns;
import nz.co.doltech.client.panel.MaterialErrors;
import nz.co.doltech.client.panel.MaterialFooterPanel;
import nz.co.doltech.client.panel.MaterialForms;
import nz.co.doltech.client.panel.MaterialGettingStarted;
import nz.co.doltech.client.panel.MaterialGrid;
import nz.co.doltech.client.panel.MaterialHelper;
import nz.co.doltech.client.panel.MaterialHome;
import nz.co.doltech.client.panel.MaterialIcons;
import nz.co.doltech.client.panel.MaterialLoaders;
import nz.co.doltech.client.panel.MaterialMedia;
import nz.co.doltech.client.panel.MaterialNavigations;
import nz.co.doltech.client.panel.MaterialPickers;
import nz.co.doltech.client.panel.MaterialScrollspyPanel;
import nz.co.doltech.client.panel.MaterialShadow;
import nz.co.doltech.client.panel.MaterialShowcase;
import nz.co.doltech.client.panel.MaterialTable;
import nz.co.doltech.client.panel.MaterialTabsPanel;
import nz.co.doltech.client.panel.MaterialTemplates;
import nz.co.doltech.client.panel.MaterialTheme;
import nz.co.doltech.client.panel.MaterialTransitions;
import nz.co.doltech.client.panel.table.MaterialDataGrid;
import nz.co.doltech.client.showcase.MaterialLogin;
import nz.co.doltech.client.showcase.MaterialParallax;

/**
 * This enum shows all the possible history tokens supported in the application
 */
public enum Place {
	about {
		@Override
		public String getTitle() {
			return "GWT Material";
		}
		@Override
		public String getDescription() {
			return "A  Material Design look and feel for GWT Apps plus Phonegap.";
		}
		@Override
		public Widget getContent() {
			return new MaterialHome();
		}
	},
	gettingstarted {
		@Override
		public String getTitle() {
			return "Getting Started";
		}
		@Override
		public String getDescription() {
			return "Learn how to easily start using GWT Material Design in your app.";
		}
		@Override
		public Widget getContent() {
			return new MaterialGettingStarted();
		}
	},
	buttons {
		@Override
		public String getTitle() {
			return "Buttons";
		}
		@Override
		public String getDescription() {
			return "There are 3 main button types described in material design. The raised button is a standard button that signify actions and seek to give depth to a mostly flat page. The floating circular action button is meant for very important functions. Flat buttons are usually used within elements that already have depth like cards or modals.";
		}
		@Override
		public Widget getContent() {
			return new MaterialButtonPanel();
		}
	},
	forms {
		@Override
		public String getTitle() {
			return "Forms";
		}

		@Override
		public String getDescription() {
			return "Forms are the standard way to receive user inputted data. The transitions and smoothness of these elements are very important because of the inherent user interaction associated with forms.";
		}
		@Override
		public Widget getContent() {
			return new MaterialForms();
		}
	},
	dialogs {
		@Override
		public String getTitle() {
			return "Dialogs";
		}

		@Override
		public String getDescription() {
			return "Dialogs are content that are not original visible on a page but show up with extra information if needed. The transitions should make the appearance of the dialog make sense and not jarring to the user.";
		}
		@Override
		public Widget getContent() {
			return new MaterialDialogs();
		}
	},
	loaders {
		@Override
		public String getTitle() {
			return "Loaders";
		}
		@Override
		public String getDescription() {
			return "If you have content that will take a long time to load, you should give the user feedback. For this reason we provide a number activity + progress indicators.";
		}
		@Override
		public Widget getContent() {
			return new MaterialLoaders();
		}
	},
	media {
		@Override
		public String getTitle() {
			return "Media";
		}
		@Override
		public String getDescription() {
			return "Media components include things that have to do with large media objects like Images, Video, Audio, etc.";
		}
		@Override
		public Widget getContent() {
			return new MaterialMedia();
		}
	},
	cards {
		@Override
		public String getTitle() {
			return "Cards";
		}
		@Override
		public String getDescription() {
			return "Cards are a convenient means of displaying content composed of different types of objects. They are also well-suited for presenting similar objects whose size or supported actions can vary considerably, like photos with captions of variable length.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCard();
		}
	},
	navigations {

		@Override
		public String getTitle() {
			return "NavBar";
		}
		@Override
		public String getDescription() {
			return "The navbar is fully contained by an HTML5 Nav tag. Inside a recommended container div, there are 2 main parts of the navbar. A logo or brand link, and the navigations links. You can align these links to the left or right.";
		}
		@Override
		public Widget getContent() {
			return new MaterialNavigations();
		}
	},
	collapsibles {
		@Override
		public String getTitle() {
			return "Collapsibles";
		}
		@Override
		public String getDescription() {
			return "Collapsibles are accordion elements that expand when clicked on. They allow you to hide content that is not immediately relevant to the user.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCollapsibles();
		}
	},
	dropdowns {
		@Override
		public String getTitle() {
			return "Dropdown";
		}
		@Override
		public String getDescription() {
			return "You can add dropdown easily by specifying it's item content and add a UiHandler on it to implement any event.";
		}
		@Override
		public Widget getContent() {
			return new MaterialDropDowns();
		}
	},
	footer {
		@Override
		public String getTitle() {
			return "Footer";
		}
		@Override
		public String getDescription() {
			return "Footers are a great way to organize a lot of site navigation and information at the end of a page. This is where the user will look once hes finished scrolling through the current page or is looking for additional information about your website.";
		}
		@Override
		public Widget getContent() {
			return new MaterialFooterPanel();
		}
	},
	tabs {
		@Override
		public String getTitle() {
			return "Tabs";
		}
		@Override
		public String getDescription() {
			return "The tabs structure consists of an unordered list of tabs that have hashes corresponding to tab ids. Then when you click on each tab, only the container with the corresponding tab id will become visible.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTabsPanel();
		}
	},
	collections {
		@Override
		public String getTitle() {
			return "Collections";
		}
		@Override
		public String getDescription() {
			return "Collections allow you to group list objects together.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCollectionPanel();
		}
	},
	badges {
		@Override
		public String getTitle() {
			return "Badges";
		}
		@Override
		public String getDescription() {
			return "Badges can notify you that there are new or unread messages or notifications. Add the new class to the badge to give it the background.";
		}
		@Override
		public Widget getContent() {
			return new MaterialBadges();
		}
	},
	grid {
		@Override
		public String getTitle() {
			return "Grid";
		}
		@Override
		public String getDescription() {
			return "We are using a standard 12 column fluid responsive grid system.The grid helps you layout your page in an ordered, easy fashion";
		}
		@Override
		public Widget getContent() {
			return new MaterialGrid();
		}
	},
	showcase {
		@Override
		public String getTitle() {
			return "Showcase";
		}
		@Override
		public String getDescription() {
			return "Great Example showcases about the implementation of Material Design in GWT";
		}
		@Override
		public Widget getContent() {
			return new MaterialShowcase();
		}
	},
	transition {
		@Override
		public String getTitle() {
			return "Transitions";
		}
		@Override
		public String getDescription() {
			return "Motion design can effectively guide the userï¿½s attention in ways that both inform and delight. Use motion to smoothly transport users between navigational contexts, explain changes in the arrangement of elements on a screen, and reinforce element hierarchy";
		}
		@Override
		public Widget getContent() {
			return new MaterialTransitions();
		}
	},
	shadow {
		@Override
		public String getTitle() {
			return "Shadow";
		}
		@Override
		public String getDescription() {
			return "In material design, everything should have a certain z-depth that determines how far raised or close to the page the element is.";
		}
		@Override
		public Widget getContent() {
			return new MaterialShadow();
		}
	},
	theme {
		@Override
		public String getTitle() {
			return "Theming";
		}
		@Override
		public String getDescription() {
			return "You can customize your desired theme for GWT Apps by changing the stylesheet path to any built in theme we made thru SASS.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTheme();
		}
	},
	table {
		@Override
		public String getTitle() {
			return "Table";
		}
		@Override
		public String getDescription() {
			return "Tables are a nice way to organize a lot of data. We provide a few utility classes to help you style your table as easily as possible. In addition, to improve mobile experience, all tables on mobile-screen widths are centered automatically.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTable();
		}
	},
	helper{
		@Override
		public String getTitle() {
			return "Helper";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialHelper();
		}
	},
	gettingStarted{
		@Override
		public String getTitle() {
			return "Getting Started";
		}
		@Override
		public String getDescription() {
			return "Learn how to easily start using GWT Material Design in your app.";
		}
		@Override
		public Widget getContent() {
			return new MaterialGettingStarted();
		}
	},
	icons{
		@Override
		public String getTitle() {
			return "Icons";
		}
		@Override
		public String getDescription() {
			return "We have included 740 Material Design Icons courtesy of Google. You can download them directly from the Material Design specs. The icon font was made and packed by Bootstrap Material Design.";
		}
		@Override
		public Widget getContent() {
			return new MaterialIcons();
		}
	},
	colors{
		@Override
		public String getTitle() {
			return "Colors";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialColors();
		}
	},
	scrollspy{
		@Override
		public String getTitle() {
			return "ScrollSpy";
		}
		@Override
		public String getDescription() {
			return "Scrollspy is a jQuery plugin that tracks certain elements and which element the user's screen is currently centered on. Our main demo of this is our table of contents on every documentation page to the right. Clicking on these links will also scroll the page to that element.";
		}
		@Override
		public Widget getContent() {
			return new MaterialScrollspyPanel();
		}
	},
	charts{
		@Override
		public String getTitle() {
			return "Material Charts";
		}
		@Override
		public String getDescription() {
			return "Using GWT Charts Library , we tried to do couple of Material Design Charts based on Design Options on each respective chart libraries.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCharts();
		}
	},
	datagrid{
		@Override
		public String getTitle() {
			return "Material DataGrid";
		}
		@Override
		public String getDescription() {
			return "DataGrid or Tables are a nice way to organize a lot of data. We provide a few utility classes to help you style your table as easily as possible. In addition, to improve mobile experience, all tables on mobile-screen widths are centered automatically.";
		}
		@Override
		public Widget getContent() {
			return new MaterialDataGrid();
		}
	},
	templates{
		@Override
		public String getTitle() {
			return "Templates";
		}
		@Override
		public String getDescription() {
			return "Inspiring templates before starting designing / developing your GWT Apps with Material Design look and feel.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTemplates();
		}
	},
	chips{
		@Override
		public String getTitle() {
			return "Chips";
		}
		@Override
		public String getDescription() {
			return "Chips represent complex entities in small blocks, such as a contact.  They can contain a photo, short title string, and brief information. Chips are manipulated through drag-and-drop. Touching them invokes the full view in a card or full screen view or invokes a menu of options related to that chip’s entity.";
		}
		@Override
		public Widget getContent() {
			return new MaterialChips();
		}
	}, autocompletes{
		@Override
		public String getTitle() {
			return "Autocomplete";
		}
		@Override
		public String getDescription() {
			return "Autocompletes are best way for selecting item easily and grouped them into chips for later search based on item values.";
		}
		@Override
		public Widget getContent() {
			return new MaterialAutoCompletes();
		}
	}, pickers{
		@Override
		public String getTitle() {
			return "Pickers";
		}
		@Override
		public String getDescription() {
			return "Pickers provide a simple way to select a single value from a pre-determined set.";
		}
		@Override
		public Widget getContent() {
			return new MaterialPickers();
		}
	}, errors{
		@Override
		public String getTitle() {
			return "Errors";
		}
		@Override
		public String getDescription() {
			return "Errors occur when an app fails to complete what is expected, such as: 1. The app does not understand user input,2. The system or app fails , 3. A user intends to run incompatible operations concurrently";
		}
		@Override
		public Widget getContent() {
			return new MaterialErrors();
		}
	}, login_demo{
		@Override
		public String getTitle() {
			return "";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialLogin();
		}
	}, parallax_demo{
		@Override
		public String getTitle() {
			return "";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialParallax();
		}
	};
	public abstract String getTitle();
	public abstract String getDescription();
	public abstract Widget getContent();
}