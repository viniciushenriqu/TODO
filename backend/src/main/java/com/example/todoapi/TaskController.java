package com.example.todoapi.task;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public List<Task> getAll() {
        return tasks;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                t.setTitle(task.getTitle());
                t.setCompleted(task.isCompleted());
                return t;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        boolean removed = tasks.removeIf(t -> t.getId().equals(id));
        if (!removed) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
