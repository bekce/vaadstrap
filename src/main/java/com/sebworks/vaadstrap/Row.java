package com.sebworks.vaadstrap;

import com.vaadin.ui.CssLayout;

/**
 * @author seb
 *
 */
public class Row extends CssLayout {
	
	private String defaultStyle = "row";
	
	public Row() {
		clearStyles();
	}
	
	/**
	 * Add a column with given styles.
	 * @see ColMod
	 * @see ColOffsetMod
	 * @see MarginMod
	 * @return the added column
	 */
	public Col addCol(Style...styles){
		Col col = new Col();
		col.addStyles(styles);
		addComponent(col);
		return col;
	}
	
	public Row clearStyles() {
		setStyleName(defaultStyle);
		return this;
	}

	public Row addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

}
