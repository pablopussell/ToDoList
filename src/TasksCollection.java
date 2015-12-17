import java.util.ArrayList;

public class TasksCollection {
	
	private ArrayList<Task> tasks;
	
	public TasksCollection() {
		Task task = new Task();
		
		task.setTitle("Do Laundry");
		tasks.add(task);
		task.setTitle("Go Shopping");
		tasks.add(task);
		task.setTitle("Rewatch Game Of Thrones ;)");
		tasks.add(task);
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	public void deleteTask(int id) {
		for (int i=0; i<=tasks.size(); i++) {
			Task task = tasks.get(i);
			if (task.getId() == id) {
				tasks.remove(i);
			} else {
				i++;
			}
			
		}
	}

}
