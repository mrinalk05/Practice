package oops;

class Clock{  
int rollNo;
String name,course;
float fee;

Clock (int rollNo, String name, String course){
	this.rollNo=rollNo;
	this.name=name;
	this.course=course;
	
}
Clock (int rollNo,String name,float fee, String course){
	
	this(rollNo,name,course);
	
	this.rollNo= rollNo;
	this.name=name;
	this.fee=fee;
}

}  


 