<!DOCTYPE html>
<html>
<head>
  <title>Todos</title>
  <link rel="stylesheet" href="../css/application.css" type="text/css" charset="utf-8">
</head>
<body>
  <div id="views">
    <div id="tasks">
      <h1>My List</h1>
      
      <form method="POST" action="/views/">
        <input type="text" name="taskName" placeholder="What needs to be done?">
      </form>
      
      <#list Pending as pending>
      <div class="items"></div>
        <div class="item">
            <div class="view">
                <input type="checkbox">
                <span>${pending.getTitle()}</span><a class="destroy"></a>
            </div>
        </div>
       </#list> 
        
      <footer>
        <a class="clear">Clear completed</a>
          <a href="/" class="clear">&lt; Return to list Management </a>
      </footer>
    </div>
  </div>
</body>
</html>