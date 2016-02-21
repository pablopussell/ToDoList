<!DOCTYPE html>
<html>
<head>
  <title>List Management</title>
  
  <link rel="stylesheet" href="../css/application.css" type="text/css" charset="utf-8">
</head>
<body>
  <div id="views">
    <div id="tasks">
      <h1>List Types</h1>
      
      <div class="items"></div>
      
        <div class="item">
            <div class="view">
                <a href="/items_pending/"><span>${Pending}</span></a> <a class="destroy"></a>
            </div> 
        </div>
        <div class="item">
            <div class="view">
                <a href="/items_completed/"><span>${Completed}</span></a> <a class="destroy"></a>
            </div> 
        </div>
      

    </div>
  </div>
</body>
</html>