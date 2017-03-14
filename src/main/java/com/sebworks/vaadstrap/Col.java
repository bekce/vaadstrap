package com.sebworks.vaadstrap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;

/**
 * @author seb
 *
 */
public class Col extends CssLayout {

	private Style childrenStyle;

	public Col() {
	}

	public Col(@Min(1) @Max(12) int sm, @Min(1) @Max(12) int md) {
		this();
		addStyles(ColMod.get(Threshold.SM, sm), ColMod.get(Threshold.MD, md));
	}

	public Col clearStyles() {
		setStyleName("");
		return this;
	}

	public Col addStyles(Style... styles) {
		for (Style style : styles) {
			addStyleName(style.getStyleName());
		}
		return this;
	}

	public Col setDefaultChildrenStyle(Style childrenStyle) {
		return setDefaultChildrenStyle(childrenStyle, false);
	}

	public Col setDefaultChildrenStyle(Style childrenStyle, boolean applyToAll) {
		this.childrenStyle = childrenStyle;
		if (applyToAll) {
			for (int i = 0; i < getComponentCount(); i++) {
				Component component = getComponent(i);
				component.addStyleName(childrenStyle.getStyleName());
			}
		}
		return this;
	}

	@Override
	public void addComponent(Component c) {
		c.setWidth(100, Unit.PERCENTAGE);
		if (childrenStyle != null) {
			c.addStyleName(childrenStyle.getStyleName());
		}
		super.addComponent(c);
	}

	@Override
	public void addComponentAsFirst(Component c) {
		c.setWidth(100, Unit.PERCENTAGE);
		if (childrenStyle != null) {
			c.addStyleName(childrenStyle.getStyleName());
		}
		super.addComponentAsFirst(c);
	}

}
