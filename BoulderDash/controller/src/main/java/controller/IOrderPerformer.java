package controller;

import java.io.IOException;

public interface IOrderPerformer {
	
	/**
	 * Gets the order to perform
	 * @param userOrder
	 * @throws IOException
	 */
	 void orderPerform(UserOrder userOrder) throws IOException;
}
