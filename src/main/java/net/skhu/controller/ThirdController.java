package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.dto.Student;

@Controller
@RequestMapping("third")
public class ThirdController {
	@RequestMapping(value = "test3", method = RequestMethod.GET)
	public String test1(Model model) {
		model.addAttribute("student", new Student(0, null, null, null));
		return "third/test3";
	}

	@RequestMapping(value = "test3", method = RequestMethod.POST)
	public String test1(Model model, Student student) {
		model.addAttribute("id",student.getId());
		model.addAttribute("studentNumber",student.getStudentNumber());
		model.addAttribute("studentName",student.getStudentName());
		model.addAttribute("email",student.getEmail());
		model.addAttribute("message", "저장되었습니다");
		return "third/test3";
	}
	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("student", new Student(0, null, null, null));
		return "third/test3";
	}

	@PostMapping("test2")
	public String test2(Model model, Student student) {
		model.addAttribute("id",student.getId());
		model.addAttribute("studentNumber",student.getStudentNumber());
		model.addAttribute("studentName",student.getStudentName());
		model.addAttribute("email",student.getEmail());
		model.addAttribute("message", "저장되었습니다");
		return "third/test3";
	}

}