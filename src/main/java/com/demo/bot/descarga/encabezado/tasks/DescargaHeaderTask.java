package com.demo.bot.descarga.encabezado.tasks;

import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
public class DescargaHeaderTask {
	@Bean
	public DescargaHeaderTaskRunner procesarTarea(){
		return new DescargaHeaderTaskRunner();
	}
}
