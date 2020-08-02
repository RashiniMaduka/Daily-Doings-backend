package com.in28minutes.rest.webservices.restfulwebservices.todo;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoResource {
    @Autowired
    private TodoHardcodedService todoservice;
    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(String username){
       return todoservice.findAll();
    }
    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void>deleteTodo(
            @PathVariable String username, @PathVariable long id){
        Todo todo=todoservice.deleteById(id);
        if(todo!=null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }

}
