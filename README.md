# vaadstrap
Bootstrap for Vaadin.

Designed to use [bootstrap's grid system](http://getbootstrap.com/css/#grid) in Vaadin applications to enable mobile-ready views without writing a single line of css.

The library is ready to be used by any Vaadin project and requires no widgetset compilation. 
```
<dependency>
   <groupId>com.sebworks</groupId>
   <artifactId>vaadstrap</artifactId>
   <version>0.1.2</version>
</dependency>

<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
```

Usage example: 
```
@Viewport("width=device-width, initial-scale=1") // this is necessary
public class BootstrapUI extends UI {
	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();
		Container container = new Container();
		Row row = container.addRow();
		Col col1 = row.addCol(ColMod.SM_6, ColMod.MD_4);
		Col col2 = row.addCol(ColMod.SM_6, ColMod.MD_4, VisibilityMod.HIDDEN_XS);
		col1.addComponent(new MTextArea().withWidth("100%"));
		col1.addComponent(new MTextArea().withWidth("100%"));
		col2.addComponent(new MHorizontalLayout(new Button("Button 1"),new Button("Button 2")).withFullWidth());
		setContent(container);
	}
}
```

`Container` has `Row`(s). 
`Row` has `Col`(s).

`col-*-*`, `col-*-offset-*`, `visible-*`, `hidden-*` styles are available as enum constants.

This example uses `viritin` for demo purposes but it is not necessary. 

In the future the library may be extended to support more bootstrap features and components through `AbstractJavaScriptComponent`. PR's are welcome. 
