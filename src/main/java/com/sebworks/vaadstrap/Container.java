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

	public Container() {
		setFluid(false);
	}

	public Row addRow() {
		Row row = new Row();
		addComponent(row);
		return row;
	}

	public Container setFluid(boolean fluid) {
		this.fluid = fluid;
		setStyleName(fluid ? "container-fluid" : "container");
		return this;
	}

	public boolean isFluid() {
		return fluid;
	}

}
