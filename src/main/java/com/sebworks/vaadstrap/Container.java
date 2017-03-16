package com.sebworks.vaadstrap;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.CssLayout;

/**
 * @author seb
 */
@StyleSheet({"bootstrap.min.css", "bootstrap-theme.min.css", "custom.css"})
@JavaScript({"jquery-1.11.3.min.js", "bootstrap.min.js"})
public class Container extends CssLayout {

	private boolean fluid = false;
	private String defaultStyle = "container";

	public Container() {
		setFluid(false);
	}

	/**
	 * Create and add a new row to this container.
	 * @return the new row
	 */
	public Row addNewRow() {
		Row row = new Row();
		addComponent(row);
		return row;
	}

	/**
	 * Add given row to the container
	 * @param row row to add
	 * @return this
	 */
	public Container addRow(Row row){
		addComponent(row);
		return this;
	}

	/**
	 * @param fluid if true, applies <code>container-fluid</code> which is a full width container, spanning the entire width of your viewport.
	 *              else (default), applies <code>container</code> which is a responsive fixed width container.
	 * @return this
	 */
	public Container setFluid(boolean fluid) {
		this.fluid = fluid;
		defaultStyle = fluid ? "container-fluid" : "container";
		return clearStyles();
	}

	/**
	 * @return true if fluid
	 */
	public boolean isFluid() {
		return fluid;
	}

	/**
	 * Clears any custom style and reverts back to default style
	 * @return this
	 */
	public Container clearStyles() {
		setStyleName(defaultStyle);
		return this;
	}

	/**
	 * Adds custom style(s) to this object
	 * @param styles styles to add
	 * @return this
	 */
	public Container addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

}
