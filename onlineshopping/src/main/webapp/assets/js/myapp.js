$(function(){
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contact':
			$('#contact').addClass('active');
			break;
		case 'All   Products':
			$('#listProducts').addClass('active');
			break;
		case 'home':
			$('#home').addClass('active');
			break;
		default:
			$('#a_'+menu).addClass('active');
			break;
	}
});