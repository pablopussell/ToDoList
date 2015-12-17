import static spark.Spark.*;

import freemarker.template.Configuration;
import spark.template.freemarker.FreeMarkerEngine; 

public class ToDoList {

	public static void main(String[] args) {
		staticFileLocation("/resources");
		
		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(ToDoList.class, "/resources");
		freeMarkerEngine.setConfiguration(configuration);
		
		ToDoListController toDoListController = new ToDoListController(freeMarkerEngine);
		
	}

}
