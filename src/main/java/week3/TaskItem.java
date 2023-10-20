package week3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskItem {
    public static void main(String[] args) {

    }
    private int taskID;
    private String taskDescription;

    private TaskStatus taskstatus;

    public TaskItem(int taskID, String taskDescription, TaskStatus taskstatus) {
        this.taskID = taskID;
        this.taskDescription = taskDescription;
        this.taskstatus = taskstatus;
    }

    public TaskStatus getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(TaskStatus taskstatus) {
        this.taskstatus = taskstatus;
    }

    public int getTaskID() {

        return taskID;
    }

    public String getTaskDescription() {

        return taskDescription;
    }

    public void setTaskID(int taskID) {

        this.taskID = taskID;
    }

    public void setTaskDescription(String taskDescription) {

        this.taskDescription = taskDescription;
    }
}
