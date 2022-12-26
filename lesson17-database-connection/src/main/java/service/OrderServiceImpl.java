package service;

import java.time.LocalDate;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImpl implements OrderService{
	
	public OrderDao orderDao;
	
	public OrderServiceImpl() {
		orderDao = new JdbcOrderDao();
	}
	
	@Override
	public void update(LocalDate deliveryDate, Double deliveryFree) {
		orderDao.update(deliveryDate, deliveryFree);
	}
	
	
}
