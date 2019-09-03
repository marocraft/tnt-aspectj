package com.alexecollins;

import org.junit.Test;

import com.github.marocraft.App;
import com.github.marocraft.TestModeOnlyException;

/**
 * @author alexec (alex.e.c@gmail.com)
 */
public class AppTest {
	@Test(expected = TestModeOnlyException.class)
	public void testMainDisabled() throws Exception {
		//System.setProperty("test.mode.enabled", "false");
		App.main();
	}

	@Test
	public void testMainEnabled() throws Exception {
		//System.setProperty("test.mode.enabled", "true");
		App.main();
	}
}
