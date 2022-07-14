package com.ericramirezs.kotohimebot;

import com.ericramirezs.commando4j.CommandEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		CommandEngine.setRepository(null);
		SpringApplication.run(Main.class, args);
	}
}
