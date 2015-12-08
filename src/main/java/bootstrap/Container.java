package bootstrap;

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
	public Container() {
		addStyleName("container");
	}

	public Row addRow() {
		Row row = new Row();
		addComponent(row);
		return row;
	}
}
