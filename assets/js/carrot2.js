// carrot2.js
document.addEventListener('DOMContentLoaded', function() {
    var carrot2Link = document.getElementById('carrot2Link');
    var carrot2Frame = document.getElementById('carrot2Frame');
    if (carrot2Link && carrot2Frame) {
        carrot2Link.addEventListener('click', function(event) {
            event.preventDefault(); // Prevent default behavior (navigating to another page)
            carrot2Frame.style.display = 'block'; // Show the iframe
            carrot2Frame.src = 'https://search.carrot2.org/#/workbench'; // Set the iframe source
        });
    }
});