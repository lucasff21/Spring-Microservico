package com.lucas.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lucas.hrpayroll.feignclients.WorkerFeignClient;
import com.lucas.hrpayroll.model.Payment;
import com.lucas.hrpayroll.model.Worker;

@Service
public class PaymentService {


	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
