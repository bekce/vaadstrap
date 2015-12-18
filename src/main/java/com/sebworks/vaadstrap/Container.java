package com.sebworks.vaadstrap;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.CssLayout;

/**
 * @author seb
 *
 */
@StyleSheet({ "bootstrap.min.css", "bootstrap-theme.min.css", "custom.css" })
@JavaScript({ "jquery-1.11.3.min.js", "bootstrap.min.js" })
public class Container extends CssLayout {

	private boolean fluid = false;
	private String defaultStyle = "container";

	public Container() {
		setImmediate(true);
		setFluid(false);
	}

	public Row addRow() {
		Row row = new Row();
		addComponent(row);
		return row;
	}

	public Container setFluid(boolean fluid) {
		this.fluid = fluid;
		defaultStyle = fluid ? "container-fluid" : "container";
		return clearStyles();
	}

	public boolean isFluid() {
		return fluid;
	}

	public Container clearStyles() {
		setStyleName(defaultStyle);
		return this;
	}

	public Container addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

}
