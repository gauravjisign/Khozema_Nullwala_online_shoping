
$(function(){
	
//	Solving Active menu problem
	switch(menu) {
	case 'About Us' : 
		$("#about").addClass('active');
		break;
	case 'Contact Us' : 
		$("#contact").addClass('active');
		break;
	case 'All Products' : 
		$("#listProducts").addClass('active');
		break;		
	default : 
		/*$("#home").addClass('active');*/
		$("#listProducts").addClass('active');
		$("#"+menu+"_category_active").addClass('active');
		break;	
	}
	console.log('menu: '+menu);
});