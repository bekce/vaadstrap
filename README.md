# vaadstrap
Bootstrap for Vaadin.

Designed to use [bootstrap's grid system](http://getbootstrap.com/css/#grid) in Vaadin applications to enable mobile-ready views without writing a single line of css.

The library is ready to be used by any Vaadin project and requires no widgetset compilation. Just download this and install to your repository by `mvn install` then include it in your project: 
```
<dependency>
	<groupId>com.sebworks</groupId>
	<artifactId>vaadstrap</artifactId>
	<version>0.1-SNAPSHOT</version>
</dependency>
```

Usage example: 
```
@Viewport("width=device-width, initial-scale=1")
public class BootstrapUI extends UI {
	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();
		Container container = new Container();
		Row row = container.addRow();
		Col col1 = row.addCol(ColMod.SM_6, ColMod.MD_4);
		Col col2 = row.addCol(ColMod.SM_6, ColMod.MD_4, VisibilityMod.HIDDEN_XS);
		Col col3 = row.addCol(ColMod.SM_6, ColMod.MD_4);
		col1.addComponent(new MTextArea().withWidth("100%"));
		col1.addComponent(new MTextArea().withWidth("100%"));
		col2.addComponent(randomgrid());
		col2.addComponent(randomgrid());
		col3.addComponent(new MHorizontalLayout(new Button("Button"),new Button("Button")).withFullWidth());
		setContent(container);
	}
	private Grid randomgrid(){
		MGrid grid = new MGrid().withProperties("Name","Surname","Age");
		for (int i = 0; i < 200; i++) {
			grid.addRow(UUID.randomUUID().toString().substring(0, 16),UUID.randomUUID().toString().substring(0, 16),String.valueOf((int) (Math.random()*100)));
		}
		return grid;
	}
}
```

This example uses `viritin` for demo purposes but it is not necessary. 

In the future the library may be extended to support more bootstrap features and components through `AbstractJavaScriptComponent`. PR's are welcome. 
