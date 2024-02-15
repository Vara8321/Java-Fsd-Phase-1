document.querySelector('form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    // Validate form inputs
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let message = document.getElementById('message').value;

    if (name.trim() === '' || email.trim() === '' || message.trim() === '') {
        alert('Please fill out all fields.');
        return;
    }

    // If form is valid, submit data to backend (not implemented in this example)
    // You can use AJAX or fetch API to send data to a server
});
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();

        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});
$('.carousel').carousel({
    interval: 3000, // Set interval for automatic sliding
    pause: 'hover' // Pause on mouse hover
});

$('.carousel-control-prev').click(function() {
    $('.carousel').carousel('prev'); // Go to previous slide
});

$('.carousel-control-next').click(function() {
    $('.carousel').carousel('next'); // Go to next slide
});