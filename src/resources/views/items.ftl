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
      
      <form>
        <input type="text" placeholder="What needs to be done?">
      </form>
      
      <div class="items"></div>
        <div class="item">
            <div class="view">
                <input type="checkbox">
                <span>Pending item</span> <a class="destroy"></a>
            </div>
        </div>
        <div class="item done">
            <div class="view">
                <input type="checkbox" checked="checked">
                <span>Completed Item</span> <a class="destroy"></a>
            </div>
        </div>

      <footer>
        <a class="clear">Clear completed</a>
          <a href="lists.html" class="clear">&lt; Return to list Management </a>
        <div class="count"><span class="countVal">1</span> left</div>
      </footer>
    </div>
  </div>
</body>
</html>