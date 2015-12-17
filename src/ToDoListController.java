import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class ToDoListController {
	
	Map<String, Object> list = new HashMap<>();

	public ToDoListController(FreeMarkerEngine freeMarkerEngine) {
		get("/todolist/all", (req, res) -> {
			
			TasksCollection tasksCollection = new TasksCollection();
			list.put("Pending", tasksCollection);
			list.put("Completed", tasksCollection);
			Map lists = new HashMap();
			lists.put("list", list);
			
			return new ModelAndView(lists, "views/lists.ftl");
		}, freeMarkerEngine);
		
	}

}
