package ru.geekbrains.samples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.samples.dao.SampleBeanDAO;

@Controller
public class SampleController {

	@Autowired
	private SampleBeanDAO sampleBeanDAO;

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("sample", sampleBeanDAO.getText());
		return "sample";
	}
}