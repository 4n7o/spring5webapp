/**
 * 
 */
package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

/**
 * @author A. Favorito on 25-11-2021
 *
 * 
 */
@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;

	/**
	 * @param authorRepository
	 */
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getBooks(Model model) {

		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}
}
