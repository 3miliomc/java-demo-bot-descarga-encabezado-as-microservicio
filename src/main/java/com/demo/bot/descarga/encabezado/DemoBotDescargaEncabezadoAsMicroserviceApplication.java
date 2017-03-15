package com.demo.bot.descarga.encabezado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import com.demo.bot.descarga.encabezado.tasks.DescargaHeaderTaskRunner;

@SpringBootApplication
@EnableTask
public class DemoBotDescargaEncabezadoAsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBotDescargaEncabezadoAsMicroserviceApplication.class, args);
	}
	
	@Bean
	public DescargaHeaderTaskRunner procesarTarea(){
		return new DescargaHeaderTaskRunner();
	}
}
