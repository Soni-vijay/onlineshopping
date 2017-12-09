$(function(){
	console.log("about");
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			console.log("about");
			break;
		case 'Contact':
			$('#contact').addClass('active');
			console.log("contacts");
			break;
		default:
			$('#home').addClass('active');
			console.log("home");
			break;
	}
});