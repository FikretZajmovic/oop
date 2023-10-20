package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getAllObjects()
    {
        return this.tasks;
    }

    public Optional<TaskItem> getByStatus(TaskStatus taskStatus)
    {
        return tasks
                .stream()
                .filter(TaskItem -> {
                    return TaskItem.getTaskstatus().equals(taskStatus);
                }).findFirst();
    }

    public List<TaskItem> idGreaterThan(int taskID) {
        return tasks
                .stream()
                .filter(TaskItem -> TaskItem.getTaskID() >= 2)
                .toList();
    }

    public void printTaskDescription(TaskStatus taskDescription) {
        tasks = tasks.stream()
                .filter(TaskItem -> TaskItem.getTaskDescription().equals(taskDescription))
                .collect(Collectors.toList());
        for (TaskItem u : tasks){
            System.out.println(u.getTaskDescription());
        }
    }
}
