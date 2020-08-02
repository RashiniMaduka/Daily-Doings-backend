package com.in28minutes.rest.webservices.restfulwebservices.todo;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
@Service
public class TodoHardcodedService {
    private static List<Todo> todos=new ArrayList();
    static{
        todos.add(new Todo(1,"in28minutes","bdhcjdhc",new Date(),false));
        todos.add(new Todo(2,"in28minutes","juyydhc",new Date(),false));
        todos.add(new Todo(3,"in28minutes","knkjnyfrjdhc",new Date(),false));
        todos.add(new Todo(4,"in28minutes","kajkshduwduwlldhc",new Date(),false));

    }
    public List<Todo> findAll(){
        return todos;
    }
    public Todo deleteById(long id){
        Todo todo=findById(id);
        if(todo==null) return null;
        if(todos.remove(todo)){
            todos.remove(todo);
        }
        return null;

    }
    public Todo findById(long id){
        for(Todo todo:todos){
            if(todo.getId()==id){
                return todo;
            }
        }
        return null;
    }

}
