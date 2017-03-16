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
	public Col addNewCol(Style... styles) {
		Col col = new Col(styles);
		addComponent(col);
		return col;
	}

	/**
	 * @deprecated use {@link #addNewCol(Style...)}
	 */
	@Deprecated
	public Col addCol(Style... styles) {
		return addNewCol(styles);
	}


		/**
		 * Add given col to this row
		 * @param col col to add
		 * @return this
		 */
	public Row addCol(Col col){
		addComponent(col);
		return this;
	}

	/**
	 * Clears any custom style and reverts back to default style
	 * @return this
	 */
	public Row clearStyles() {
		setStyleName("row");
		return this;
	}

	/**
	 * Adds custom style(s) to this object
	 * @param styles styles to add
	 * @return this
	 * @see MarginMod
	 */
	public Row addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

}
