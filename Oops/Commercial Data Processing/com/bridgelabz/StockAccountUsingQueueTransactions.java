/******************************************************************************
 *  Purpose: Program is written for Stock account maintain using json
 *
 *  @author  Ranjith G C
 *  @since   03-06-2021
 *
 ******************************************************************************/
package com;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.addressbook.repository.JsonUtil;
import com.bridgelabz.handler.QueueUsingLL;
import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.model.Transactions;
import com.bridgelabz.utility.OOPsUtility;

public class StockAccountUsingQueueTransactions {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String pathOfTransactions = "/home/admin1/eclipse-workspace/BridgeLabzFellowshipPrograms/src/com/bridgelabz/jsonfiles/transactions.json";

		TransactionModel model = new TransactionModel();

		model = (TransactionModel) JsonUtil.readMapper(pathOfTransactions, model);

		QueueUsingLL<Transactions> queue = new QueueUsingLL<Transactions>();

		queue.enQueueAll(model.getTransactions());

		System.out.println("Enter password");
		if (OOPsUtility.stringScanner().equals("admin")) {
			int size = queue.size();
			// System.out.println(size);
			System.out.println("Transactions time");
			for (int i = 0; i <size; i++) {
				System.out.println(queue.get(0).getDatetime());
				queue.deQueue();
			}
		} else
			System.out.println("Invalid password");
	}

}