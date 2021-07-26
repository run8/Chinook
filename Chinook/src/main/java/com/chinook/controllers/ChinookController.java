package com.chinook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinook.data.AlbumRepository;

@Controller
public class ChinookController {
	
	@Autowired
	private AlbumRepository albumRepository;
	
//	@GetMapping("/album")                                   // Payload is the data that comes with the request
	@RequestMapping(value = "/album", method = RequestMethod.GET) // album is the endpoint
//	@ResponseBody  // This tells Spring the string I'm returning should be displayed in the browser.  Its not looking for a jsp
	// Spring by default expect to return the name of a jsp or the view thats defined in the model and view
	// The Model model tells Spring to return data to the view
	public String getAlbumData(Model model, @RequestParam (name = "id") int id) {
		String s = albumRepository.findById(id).get().getTitle();  // The get() gets 
		System.out.println(s);
		
		model.addAttribute("title", s);  // The "title" here must match the attribute in the jsp. This 
		return "album";    // Spring expects to find a jsp with this name
	}
	
}
