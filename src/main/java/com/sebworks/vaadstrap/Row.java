package com.sebworks.vaadstrap;

import com.vaadin.ui.CssLayout;

/**
 * @author seb
 *
 */
public class Row extends CssLayout {
	public Row() {
		addStyleName("row");
	}
	
	public Col addCol(Style...styles){
		Col col = new Col();
		col.setStyles(styles);
		addComponent(col);
		return col;
	}
}
