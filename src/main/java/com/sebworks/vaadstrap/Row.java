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
	
	public Col addCol(BootstrapStyle...styles){
		Col col = new Col();
		col.setColStyles(styles);
		addComponent(col);
		return col;
	}
}
