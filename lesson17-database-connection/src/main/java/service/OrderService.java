package service;

import java.time.LocalDate;

public interface OrderService {
	void update(LocalDate deliveryDate, Double deliveryFree);
}
