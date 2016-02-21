import java.util.ArrayList;

public class TasksPending {
	
	private ArrayList<Task> tasksList = new ArrayList<Task>();
	private String name = "Pending";

	public TasksPending() {
		Task aTask1 = new Task("Do Laundry");
		Task aTask2 = new Task("Go Shopping");
		Task aTask3 = new Task("Rewatch Game Of Thrones ;)");
	
		
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
