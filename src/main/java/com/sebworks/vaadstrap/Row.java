package com.sebworks.vaadstrap;

import com.vaadin.ui.CssLayout;

/**
 * @author seb
 */
public class Row extends CssLayout {

	public Row() {
		clearStyles();
	}

	/**
	 * Add a column with given styles.
	 *
	 * @return the added column
	 * @see ColMod
	 * @see ColOffsetMod
	 * @see MarginMod
	 */
	public Col addCol(Style... styles) {
		Col col = new Col();
		col.addStyles(styles);
		addComponent(col);
		return col;
	}

	public Row clearStyles() {
		setStyleName("row");
		return this;
	}

	public Row addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

}
