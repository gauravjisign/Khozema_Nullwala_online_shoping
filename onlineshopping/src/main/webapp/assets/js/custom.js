
$(function(){
	
//	Solving Active menu problem
	switch(menu) {
	case 'About Us' : $("#about").addClass('active');
		break;
	case 'Contact Us' : $("#contact").addClass('active');
		break;
	case 'Product List' : $("#listProduct").addClass('active');
		break;		
	default : $("#home").addClass('active');
		break;
	
	}
});