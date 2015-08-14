$(function(){
  if(!flux.browser.supportsTransitions)
  alert("Flux Slider requires a browser that supports CSS3 transitions");
  
  window.f = new flux.slider('#slider', {
                             autoplay: true,
                             pagination: false
                             });
  
  // Setup a listener for user requested transitions
  $('div#transitions').bind('click', function(event){
                            event.preventDefault();
                            // If this is a 3D transform and the browser doesn't support 3D then inform the user
                            if($(event.target).closest('ul').is('ul#trans3d') && !flux.browser.supports3d)
                            {
                            alert("The '"+event.target.innerHTML+"' transition requires a browser that supports 3D transforms");
                            return;
                            }
                            
                            window.f.next(event.target.href.split('#')[1]);
                            });
  });