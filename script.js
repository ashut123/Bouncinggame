/* Handle CTA Button Click */
document.getElementById("cta").addEventListener("click", function() {
	// Scroll to About Section
	document.getElementById("about").scrollIntoView({behavior: "smooth"});
});

/* Handle Contact Form Submission */
document.getElementById("contact-form").addEventListener("submit", function(event) {
	event.preventDefault(); // Prevent Default Form Submission

	// TODO: Send Contact Form Data to Server

	alert("Thank you
