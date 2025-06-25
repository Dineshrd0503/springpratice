
package com.dinesh.springbootmvcdemo;

import com.dinesh.springbootmvcdemo.model.Alien;
import com.dinesh.springbootmvcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {


    @GetMapping("/")
    public String displayWelcomeMessage(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot MVC Demo!");
        return "index";
    }

    @GetMapping("/add")
    public String add(
            @RequestParam(value = "firstNumber",required = false) Integer num1,
            @RequestParam(value = "secondNumber",required = false ) Integer num2,
            Model model
    ) {
        if(num1 == null || num2 == null) {
            model.addAttribute("message", "Please enter both numbers");
            return "index";
        }

        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "sum";
    }

    @GetMapping("/subtract")
    public ModelAndView subtract(
            @RequestParam(value = "firstNumber",required = false) Integer num1,
            @RequestParam(value = "secondNumber",required = false) Integer num2){
        ModelAndView mv=new ModelAndView("difference");
        if(num1==null||num2==null){
            mv.addObject("message","Please enter both numbers");
            mv.setViewName("index");
            return mv;
        }
        int difference = num1 - num2;
        mv.addObject("result", difference);
        return mv;

    }

    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(value="firstNumber",required = false) Integer num1,
        @RequestParam(value="secondNumber", required = false) Integer num2,
            ModelMap modelmap){
        if(num1 == null || num2 == null) {
            modelmap.addAttribute("message", "Please enter both numbers");
            return "index";
        }
        int product = num1 * num2;
        modelmap.addAttribute("result", product);
        return "product";
    }

    @GetMapping("/alien")
    public String addAlien(
            @RequestParam(value="alienName", required = false) String name,
            @RequestParam(value="alienAge", required = false) Integer age,
            @RequestParam(value="alienTechnology", required = false) String technology,
            Model model){
        if(name == null || age== null || technology == null) {
            model.addAttribute("message", "Please enter all alien details");
            return "index";
        }
        Alien alien = new Alien();

        alien.setName(name);
        alien.setAge(age);
        alien.setTechnology(technology);
        model.addAttribute("alien", alien);
        return "alien";

    }

    @GetMapping("/student")
    public String addStudent(@ModelAttribute("d") Student s) {
        return "student";

    }




}
