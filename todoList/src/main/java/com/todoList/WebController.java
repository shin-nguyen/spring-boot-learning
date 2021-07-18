package com.todoList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    List<Todo> todoList = new ArrayList<>();

    /*
        @RequestParam dùng để đánh dấu một biến là request param trong request gửi lên server.
        Nó sẽ gán dữ liệu của param-name tương ứng vào biến
     */
   /* @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit) {
        // Trả về đối tượng todoList.
        // Nếu người dùng gửi lên param limit thì trả về sublist của todoList
        model.addAttribute("todoList", limit != null ? todoList.subList(0, limit) : todoList);

        // Trả về template "listTodo.html"
        return "listTodo";
    }*/

    @GetMapping("/listTodo")
    public String index(Model model) {

        model.addAttribute("todoList", todoList);

        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {

        model.addAttribute("todo", new Todo());

        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {

        todoList.add(todo);

        return "success";
    }
}
