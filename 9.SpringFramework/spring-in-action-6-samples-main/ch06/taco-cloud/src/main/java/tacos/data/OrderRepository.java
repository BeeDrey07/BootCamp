package tacos.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;
import tacos.User;

<<<<<<< HEAD
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

	List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

	/*
	 * List<Order> findByUserOrderByPlacedAtDesc(User user);
	 */
=======
public interface OrderRepository
         extends CrudRepository<TacoOrder, Long> {

  List<TacoOrder> findByUserOrderByPlacedAtDesc(
          User user, Pageable pageable);

  /*
  List<Order> findByUserOrderByPlacedAtDesc(User user);
   */

>>>>>>> c809f23 (MovieApp updated)
}
