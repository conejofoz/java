package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class RotinaEnum {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		//Para alimentar um enum com string basta usar o método valueOf
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	}

}
