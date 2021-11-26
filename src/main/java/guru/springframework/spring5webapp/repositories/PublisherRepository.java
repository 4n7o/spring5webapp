/**
 * 
 */
package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

/**
 * @author A. Favorito on 24-11-2021
 *
 * 
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
