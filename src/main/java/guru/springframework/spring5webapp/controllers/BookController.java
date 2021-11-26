/**
 * 
 */
package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

/**
 * @author A. Favorito on 25-11-2021
 *
 * 
 */
@Controller
public class BookController {

	private final BookRepository bookRepository;

	/**
	 * @param bookRepository
	 */
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {

		model.addAttribute("books", bookRepository.findAll());
		return "books/list";
	}

}
