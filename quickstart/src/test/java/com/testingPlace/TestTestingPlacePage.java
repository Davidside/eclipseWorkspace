package com.testingPlace;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTestingPlacePage {

	private WicketTester tester;
	
	@Before
	public void setUp() {
		tester = new WicketTester(new TestingPlaceApplication());
		tester.getSession().setLocale(new Locale("en"));
	}
	
	@Test
	public void testSectionDDC() {
		tester.startPage(TestingPlacePage.class);
		tester.assertRenderedPage(TestingPlacePage.class);
		FormTester formTester = tester.newFormTester("form");
		formTester.select("selection", 1);
		formTester.submit();
		tester.assertModelValue("form:selection", "two");
		tester.assertLabel("selected", "Second selection");
	}
	
	@Test
	public void testResetButton() {
		TestingPlacePage testingPlacePage = new TestingPlacePage();
		DropDownChoice<String> dropDownChoice = (DropDownChoice) testingPlacePage.get("form:selection");
		List<String> choices = (List<String>) dropDownChoice.getChoices();
		dropDownChoice.setModelObject(choices.get(1));	
		tester.startPage(testingPlacePage);
		tester.assertModelValue("form:selection", dropDownChoice.getModelObject());
		FormTester formTester = tester.newFormTester("form");
		formTester.submit("reset");
		tester.assertModelValue("form:selection", null);
	}
	
	@Test
	public void testDateFromToValidator() {
		tester.startPage(TestingPlacePage.class);
		FormTester formTester = tester.newFormTester("group:dateForm");
		formTester.setValue("dateFieldFrom", "02.05.2016");
		formTester.setValue("dateFieldTo", "01.05.2016");
		formTester.setValue("netmask", "255.255.255.253");
		formTester.submit();
		tester.assertErrorMessages(new String[] {
				"Invalid date range. Date to '01.05.2016' must be greater or equal than date from '02.05.2016'.",
				"Invalid network mask."});
	}
	
	@Test
	public void testEnumDDC() {
		TestingPlacePage testingPlacePage = new TestingPlacePage();
		DropDownChoice<EnumInterface> dropDownChoice = (DropDownChoice) testingPlacePage.get("group:dateForm:ddcEnum");
		List<EnumInterface> choices = (List<EnumInterface>) dropDownChoice.getChoices();
		System.out.println(choices);
		dropDownChoice.setModelObject(choices.get(1));	
		tester.startPage(testingPlacePage);
		tester.assertModelValue("group:dateForm:ddcEnum", dropDownChoice.getModelObject());
		Assert.assertEquals("Old", dropDownChoice.getChoiceRenderer().getDisplayValue(dropDownChoice.getModelObject()));
	}
}
