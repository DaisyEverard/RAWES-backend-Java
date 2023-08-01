package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RestController
public class RAWESApi {
	public static void main(String[] args) {
		SpringApplication.run(RAWESApi.class, args);
	}
	@CrossOrigin
	@RequestMapping(value = {"/provisioning"}, method = RequestMethod.GET)
	public HashMap<String, List> getProvisioning() {
		HashMap<String, List> serviceMap = new HashMap<>();
		List<String> servicesArray = Arrays.asList("Provision of fresh water", "Provision of food",
				"Provision of fibre", "Provision of fuel", "Provision of genetic resources",
				"Provision of natural medicines and pharmaceuticals", "Provision of ornamental resources",
				"Clay, mineral, aggregate harvesting", "Waste disposal",
				"Energy harvesting from natural air and water flows");
		serviceMap.put("services", servicesArray);
		return serviceMap;
	}
	@CrossOrigin
	@RequestMapping(value = {"/cultural"}, method = RequestMethod.GET)
	public HashMap<String, List> getCultural() {
		HashMap<String, List> serviceMap = new HashMap<>();
		List<String> servicesArray = Arrays.asList("Cultural heritage", "Recreation and tourism", "Aesthetic value",
				"Spritual and religious value", "Insipiration value", "Social relations",
				"Education and research");
		serviceMap.put("services", servicesArray);
		return serviceMap;
	}
	@CrossOrigin
	@RequestMapping(value = {"/regulating"}, method = RequestMethod.GET)
	public HashMap<String, List> getRegulating() {
		HashMap<String, List> serviceMap = new HashMap<>();
		List<String> servicesArray = Arrays.asList("Air quality regulation", "Local climate regulation",
				"Global climate regulation", "Water regulation", "Flood hazard regulation",
				"Storm hazard regulation", "Pest regulation", "Regulation of human diseases",
				"Regulation of diseases affecting livestock", "Erosion regulation", "Water purification",
				"Pollination", "Salinity regulation", "Fire regulation", "Noise and visual buffering");
		serviceMap.put("services", servicesArray);
		return serviceMap;
	}
	@CrossOrigin
	@RequestMapping(value = {"/supporting"}, method = RequestMethod.GET)
	public HashMap<String, List> getSupporting() {
		HashMap<String, List> serviceMap = new HashMap<>();
		List<String> servicesArray = Arrays.asList("soil formation", "Primary production", "Nutrient cycling",
				"Water recycling", "provision of habitat");
		serviceMap.put("services", servicesArray);
		return serviceMap;
	}
}
