package de.jwic.mobile02;

import java.util.ArrayList;
import java.util.List;

import de.jwic.base.Application;
import de.jwic.base.Control;
import de.jwic.base.IControlContainer;
import de.jwic.mobile02.demos.ButtonDemo;
import de.jwic.mobile02.demos.CheckBoxDemo;
import de.jwic.mobile02.demos.ComboDemo;
import de.jwic.mobile02.demos.FlipSwitchDemo;
import de.jwic.mobile02.demos.InputDemo;
import de.jwic.mobile02.demos.RadioButtonDemo;
import de.jwic.mobile02.demos.SelectMenuDemo;
import de.jwic.mobile02.demos.SelectMenuDemo02;
import de.jwic.mobile02.demos.TableDemo;
import de.jwic.mobile02.demos.TabsDemo;

/**
 * Created by boogie on 10/27/14.
 */
public class MobileDemoApplication extends Application {

	@Override
	public Control createRootControl(IControlContainer container) {
		
		final List<MobileDemoModule> mobileDemoModules = new ArrayList<MobileDemoModule>();

		mobileDemoModules.add(new ButtonDemo());
		mobileDemoModules.add(new InputDemo());
		mobileDemoModules.add(new CheckBoxDemo());
		mobileDemoModules.add(new RadioButtonDemo());
		mobileDemoModules.add(new FlipSwitchDemo());
		mobileDemoModules.add(new TabsDemo());
		mobileDemoModules.add(new ComboDemo());
		mobileDemoModules.add(new SelectMenuDemo());
		mobileDemoModules.add(new SelectMenuDemo02());
		mobileDemoModules.add(new TableDemo());
		/*
		mobileDemoModules.add(new DatePickerDemo());
		mobileDemoModules.add(new ToggleableGroupsDemo());
		mobileDemoModules.add(new AlexDemo());
		mobileDemoModules.add(new SelectBoxDemo());
		 */

		return new MobileDemoPage(container, "demoPage", mobileDemoModules);
	}
}
