package gwt.material.design.client.ui;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.base.ComplexWidget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.html.ListItem;
import gwt.material.design.client.ui.html.UnorderedList;

//@formatter:off
/**
* CollapsibleItem element to define the body 
* @author kevzlou7979
* @see <a href="http://gwt-material-demo.herokuapp.com/#collapsibles">Material Collapsibles</a>
*/
//@formatter:on
public class MaterialCollapsibleBody extends ComplexWidget {
	
	/**
	 * Creates empty collapsible body.
	 */
	public MaterialCollapsibleBody() {
		super(Document.get().createDivElement());
		setStyleName("collapsible-body");
	}
	
	/**
	 * Add other components into collapsible body.
	 */
	public MaterialCollapsibleBody(final Widget... widgets) {
		this();
		for(Widget w : widgets){
			add(w);
		}
	}

	@Override
	public void add(Widget child) {
		if(child instanceof UnorderedList) {
			for(Widget w : (UnorderedList) child) {
				if(w instanceof ListItem) {
					w.getElement().getStyle().setDisplay(Style.Display.BLOCK);
				}
			}
		} else if(child instanceof ListItem) {
			child.getElement().getStyle().setDisplay(Style.Display.BLOCK);
		}
		super.add(child);
	}
}
