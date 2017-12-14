package courseswithinstructors;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long instructorId;
    
	private String firstName;
    private String lastName;
    
    @OneToMany(mappedBy= "instructor") //notice the relationship of instructors, instructor is common to  many courses
    private Set <CourseTopic> courseTopics; //one instructor to many classes
    
    
  //JPA required no args constructor
    protected Instructor() {}  //protected can be used outside of this class
    
    public Instructor(String firstName, String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    }
    public Long getInstructorId() {
    	return instructorId;
    }
    public String getFirstName() {
 	   return firstName;
    }
    
    public String getLastName() {
	   return lastName;
   }
    
    public Set<CourseTopic> getCourseTopics() { //getter
    	return courseTopics; //type of collection we are returning
    }
    
   @Override
   public String toString() {
       return firstName + " " + lastName;
               
   }
	
	

}
