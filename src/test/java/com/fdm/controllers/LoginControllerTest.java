package com.fdm.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.fdm.entities.GenericDAO;
import com.fdm.entities.Recipe;
import com.fdm.entities.User;

public class LoginControllerTest {
	
	@Mock
	private GenericDAO<Recipe> recipeDao;
	@Mock
	private HttpSession session;
	@Mock
	private HttpServletRequest request;
	@InjectMocks
	private final LoginController controller = new LoginController();
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void loads_login_on_page_load() {
		Model model = mock(Model.class);
		ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
		assertEquals("login", controller.loadPage(model));
		//captor is used to test that an object was created. For example, 'new User()'. We can't test "new".
		verify(model).addAttribute(eq("user"), captor.capture());
		User user = captor.getValue();
		assertNotNull(user);
		assertNull(user.getUsername());
		assertNull(user.getPassword());
	}
	
	@Test
	public void prepares_home_page_with_user_details_and_recipes_on_page_load() {
		List<Recipe> allRecipes = new ArrayList<>(); 
		User user = mock(User.class);
		when(recipeDao.getAll()).thenReturn(allRecipes);
		when(user.getUsername()).thenReturn("harold");
		
		assertEquals("home", controller.loadPage(request, session, user));
		verify(session).setAttribute("username", "harold");
		verify(request).setAttribute("allRecipes", allRecipes);
	}
	
	
	
	
	
	
	
}
