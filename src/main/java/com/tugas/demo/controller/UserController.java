package com.tugas.demo.controller;

import com.tugas.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // List ini fungsinya sebagai database temporary (sementara)
    private List<User> userList = new ArrayList<>();

    // Redirect awal langsung ke halaman login
    @GetMapping("/")
    public String root() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Syarat modul: username = admin, password = nim masing-masing
        if ("admin".equals(username) && "20230140105".equals(password)) {
            return "redirect:/home";
        }
        model.addAttribute("error", "Username atau Password salah brok!");
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("users", userList);
        return "home";
    }

    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String processForm(@ModelAttribute User user) {
        userList.add(user); // Simpan data ke memori
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}