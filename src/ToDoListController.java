import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class ToDoListController {
	
	public static void main(String[] args) {
		staticFileLocation("/resources");
		
		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(ToDoListController.class, "/resources");
		freeMarkerEngine.setConfiguration(configuration);
		
		ToDoListController toDoListController = new ToDoListController(freeMarkerEngine);
		
	}
	
	Map<String, Object> listType = new HashMap<>();
	TasksPending tasksPending = new TasksPending();
	TasksCompleted tasksCompleted = new TasksCompleted();
	Map<String, Object> pendingList = new HashMap<>();
	Map<String, Object> completedList = new HashMap<>();
	

	public ToDoListController(FreeMarkerEngine freeMarkerEngine) {
		get("/", (req, res) -> {
			
			listType.put("Pending", tasksPending.getName());
			listType.put("Completed", tasksCompleted.getName());
			
			return new ModelAndView(listType, "/views/lists.ftl");
		}, freeMarkerEngine);
		
		get("/items_pending/", (req, res) -> {
			
			pendingList.put("Pending", tasksPending.getTasks());
			
			return new ModelAndView(pendingList, "/views/items_pending.ftl");
		}, freeMarkerEngine);
		
		post("/views/", (req, res) -> {
			
			String taskName = req.queryParams("taskName");
			
			tasksPending.addTask(new Task(taskName));
			
			res.redirect("/items_pending/", 301);
			return null;
		});
		
		get("/items_completed/", (req, res) -> {
			
			completedList.put("Completed", tasksCompleted.getTasks());
			
			return new ModelAndView(completedList, "/views/items_completed.ftl");
		}, freeMarkerEngine);
		
	}

}
