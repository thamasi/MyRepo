package com.lrngs.springboot.cntlr;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrngs.springboot.pojo.Plant;

@RestController
public class GardenController
{
	@RequestMapping("/GardenPlants")
	public List<Plant> getAllGardenPlants()

	{
		return Arrays.asList(new Plant("Avocado", "2016", "Healthy fruit", "medium", "2", "Fruit"),
				new Plant("Lime", "2016", "Juicy Mayor Lime", "Abundance", "4", "Fruit"),
				new Plant("Arabian Jasmine", "2016", "Fragrant", "Abundance", "5", "Flower"),
				new Plant("Star Jasmine", "2016", "Magical Aroma", "Abundance", "4", "Flower"),
				new Plant("Guava", "2015", "Red medium sweet guava", "Abundance", "5", "Fruit"),
				new Plant("Jasmine Molle", "2018", "Tiny fragrant flowers", "Abundance", "5", "Flower"));

	}

}
