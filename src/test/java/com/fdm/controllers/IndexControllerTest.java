package com.fdm.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexControllerTest {
	
	@Test
	public void returns_index_on_page_load() {
		IndexController controller = new IndexController();
		
		assertEquals("index", controller.loadpage());
	}
	
	
}
