package courseswithinstructors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseTopic {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String description;
//    private String courseInstructor;
   
  
    @ManyToOne  //many different objects to 1 instructor
    private Instructor instructor; //many course topics to one instructor
    
    
  //JPA required no args constructor
    protected CourseTopic() {}
    
    public CourseTopic(String name, String description, Instructor instructor) {
    	this.name = name;
    	this.description = description;
    	this.instructor = instructor;
 
    }
    public Long getId() {
    	return id;
    }
    
   public String getName() {
	   return name;
   }
   public String getDescription() {
	   return description;
   }
   public Instructor getInstructor() {
	   return instructor;
   }
 

}
