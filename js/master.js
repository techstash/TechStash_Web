function include(file) { 
  
  var script  = document.createElement('script'); 
  script.src  = file; 
  script.type = 'text/javascript'; 
  script.defer = true; 
  
  document.getElementsByTagName('head').item(0).appendChild(script); 
  
} 

include('js/meta.js');
include('plugins/bootstrap/bootstrap.min.js');
include('plugins/slick/slick.min.js');
include('plugins/venobox/venobox.min.js');
include('plugins/aos/aos.js');
include('js/main.js');