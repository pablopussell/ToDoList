import java.util.ArrayList;

public class TasksCompleted {
	
	private ArrayList<Task> tasksList = new ArrayList<Task>();
	private String name = "Completed";
	
	public TasksCompleted() {
		Task aTask1 = new Task("Go Gyming");
		Task aTask2 = new Task("Go Nuts at Razzmatazz");
		Task aTask3 = new Task("Rewatch Prison Break");
		
	
		tasksList.add(aTask1);
		tasksList.add(aTask2);
		tasksList.add(aTask3);
	}

	public ArrayList<Task> getTasks() {
		return tasksList;
	}
	
	public String getName() {
		return name;
	}

	public void addTask(Task task) {
		this.tasksList.add(task);
	}
	
	/*public void deleteTask(int id) {
		for (int i=0; i<=tasksList.size(); i++) {
			Task task = tasksList.get(i);
			if (task.getId() == id) {
				tasksList.remove(i);
			} else {
				i++;
			}
			
		}
	}*/

}
