package com.demo.bot.descarga.encabezado.tasks;

import org.springframework.boot.CommandLineRunner;

public class DescargaHeaderTaskRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(null != args){
			System.out.println("El o los parametros son:" + args);
			
			String customerId = args[0];
			String instanceId = args[1];
			String processId = args[2];
			
			System.out.println("CustomerId:" + customerId + ", InstanceId: " + instanceId + ", ProcessId: " + processId);
		}
		
		System.out.println("Esta tarea se ejecuto");
	}

}
