<!DOCTYPE html>
<html>
<head>
  <title>List Management</title>
  
  <link rel="stylesheet" href="../css/application.css" type="text/css" charset="utf-8">
</head>
<body>
  <div id="views">
    <div id="tasks">
      <h1>List Management</h1>
      
      <form>
        <input type="text" placeholder="Type the name of the new list">
      </form>
      
      <div class="items"></div>
      
      <#list lists?keys as key>
        <div class="item">
            <div class="view">
                <a href="items.html"><span>${lists[key]}</span></a> <a class="destroy"></a>
            </div> 
        </div>
      </#list>

    </div>
  </div>
</body>
</html>