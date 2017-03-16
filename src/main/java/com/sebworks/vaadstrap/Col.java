package com.sebworks.vaadstrap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;

/**
 * @author seb
 */
public class Col extends CssLayout {

	private Style childrenStyle;

	public Col() {
	}

	public Col(Style... styles){
		this();
		addStyles(styles);
	}

	public Col(@Min(1) @Max(12) int sm,
						 @Min(1) @Max(12) int md) {
		this();
		addStyles(ColMod.get(Threshold.SM, sm),
				ColMod.get(Threshold.MD, md));
	}

	public Col(@Min(1) @Max(12) int xs,
						 @Min(1) @Max(12) int sm,
						 @Min(1) @Max(12) int md,
						 @Min(1) @Max(12) int lg) {
		this();
		addStyles(ColMod.get(Threshold.XS, xs),
				ColMod.get(Threshold.SM, sm),
				ColMod.get(Threshold.MD, md),
				ColMod.get(Threshold.LG, lg));
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

	/**
	 * @param childrenStyle   children style to apply, this is usually some margin, with {@link MarginMod}.
	 * @return this object
	 */
	public Col setChildrenStyle(Style childrenStyle) {
		return setChildrenStyle(childrenStyle, false);
	}

	/**
	 * @param childrenStyle   children style to apply, this is usually some margin, with {@link MarginMod}.
	 * @param applyToExisting if true, applies given style to all existing children
	 * @return this object
	 */
	public Col setChildrenStyle(Style childrenStyle, boolean applyToExisting) {
		this.childrenStyle = childrenStyle;
		if (applyToExisting) {
			for (int i = 0; i < getComponentCount(); i++) {
				Component component = getComponent(i);
				component.addStyleName(childrenStyle.getStyleName());
			}
		}
		return this;
	}

	/**
	 * Add components with builder pattern
	 * @param components components to add
	 * @return this
	 */
	public Col add(Component... components){
		addComponents(components);
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
