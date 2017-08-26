# vaadstrap
Bootstrap for Vaadin.

Designed to use [bootstrap's grid system](http://getbootstrap.com/css/#grid) in Vaadin applications to enable mobile-ready views without writing a single line of css.

The library is ready to be used by any Vaadin project and requires no widgetset compilation. 

```xml
<dependency>
   <groupId>com.sebworks</groupId>
   <artifactId>vaadstrap</artifactId>
   <version>0.2.1</version>
</dependency>

<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
```

|Branch |Version|Compatible With|
|-------|-------|----------|
|master |0.2.1|Vaadin 8.x|
|vaadin7|0.1.2|Vaadin 7.x|

Usage example: 

```java
@Viewport("width=device-width, initial-scale=1") // this is necessary
public class BootstrapUI extends UI {
	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();
		Container container = new Container();
		Row row = container.addRow();
		Col col1 = row.addCol(ColMod.SM_6, ColMod.MD_4);
		Col col2 = row.addCol(ColMod.SM_6, ColMod.MD_4, VisibilityMod.HIDDEN_XS);
		col1.addComponent(new TextArea());
		col1.addComponent(new TextArea());
		col2.addComponent(new HorizontalLayout(new Button("Button 1"), new Button("Button 2")));
		setContent(container);
	}
}
```

`Container` has `Row`(s). 
`Row` has `Col`(s).

`col-*-*`, `col-*-offset-*`, `visible-*`, `hidden-*` styles are available as enum constants.

In the future the library may be extended to support more bootstrap features and components through `AbstractJavaScriptComponent`. PR's are welcome. 
