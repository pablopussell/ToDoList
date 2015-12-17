public class Task {
	
	private static int _lastID=0;
	
	public Task() {
		_lastID++;
		id=_lastID;
	}
	
	private String title = "";
	private boolean isCompleted = false;
	private int id;	
	
	public int getId() {
		return id;
	}
	
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
