public class Task {
	
	public Task(String taskName) {
		this.title=taskName;
	}
	
	private String title = "";
	private boolean isCompleted = false;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean getCompletedState() {
		return isCompleted;
	}
	
	public boolean toggleCompletedState() {
		if (isCompleted == false) {
			return isCompleted = true;
		}
		return isCompleted = false;
	}

}
