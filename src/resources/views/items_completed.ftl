<!DOCTYPE html>
<html>
<head>
  <title>Todos</title>
  <link rel="stylesheet" href="../css/application.css" type="text/css" charset="utf-8">
</head>
<body>
  <div id="views">
    <div id="tasks">
      <h1>Completed Items</h1>
      
      <#list Completed as completed>
      <div class="items"></div>
        <div class="item">
            <div class="view">
                <input type="checkbox" id="toBeDeleted">
                <span>${completed.getTitle()}</span><a class="destroy"></a>
            </div>
        </div>
       </#list> 

      <footer>
        <a class="clear">Clear Selected</a>
          <a href="/" class="clear">&lt; Return to list Management </a>
      </footer>
    </div>
  </div>
</body>
</html>